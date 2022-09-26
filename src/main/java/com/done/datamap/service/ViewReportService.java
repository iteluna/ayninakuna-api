package com.done.datamap.service;

import com.done.datamap.entity.ViewReport;
import com.done.datamap.repository.ViewReportRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.json.expression.member.ObjectKeyExpression;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import javax.swing.text.View;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ViewReportService {
    @Autowired
    private ViewReportRepository viewReportRepository;

    public List<ViewReport> getViewReport1ById(Integer id){
        return this.viewReportRepository.getViewReport1ById(id);
    }
    @NotNull
    public ResponseEntity<Resource> exportPDFById(Integer id){
        Optional<ViewReport> optViewReport = this.viewReportRepository.exportPDFById(id);
        if(optViewReport.isPresent()){
            try {
                final ViewReport viewReport = optViewReport.get();
                InputStream report = this.getClass().getClassLoader().getResourceAsStream("jreport1.jasper");
                final HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("nombre_completo", viewReport.getNombre_completo());

                JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
                byte[] reporte = JasperExportManager.exportReportToPdf(jasperPrint);
                String sdf = (new SimpleDateFormat("dd/MM/yyyy")).format(new Date());
                StringBuilder stringBuilder = new StringBuilder().append("InvoicePDF:");
                ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                        .filename(stringBuilder.append(viewReport.getId())
                                .append("generateDate:")
                                .append(sdf)
                                .append(".pdf").toString()
                        ).build();
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentDisposition(contentDisposition);
                return ResponseEntity.ok().contentLength((long)reporte.length)
                        .contentType(MediaType.APPLICATION_PDF)
                        .headers(httpHeaders).body(new ByteArrayResource(reporte));

            }catch (Exception e){
                e.printStackTrace();
            }

        }
        else{
            return ResponseEntity.noContent().build();
        }
        return null;
    }
}
