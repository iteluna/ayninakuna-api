package com.done.datamap.service;

import com.done.datamap.entity.ViewReport;
import com.done.datamap.repository.ViewReportRepository;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.InputStream;
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
                InputStream report = this.getClass().getClassLoader().getResourceAsStream("jreport11.jasper");
                Resource resource = new ClassPathResource("ayninakuna.png");
                InputStream input = resource.getInputStream();
                File fileImage = resource.getFile();

                final HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("nombre_completo", viewReport.getNombre_completo());
                parameters.put("edad", viewReport.getEdad());
                parameters.put("tipo_malformacion", viewReport.getTipo_malformacion());
                parameters.put("lugar_nacimiento", viewReport.getLugar_nacimiento());
                parameters.put("patologias", viewReport.getPatologias());
                parameters.put("direccion", viewReport.getDireccion());
                parameters.put("codigo", viewReport.getCodigo());
                parameters.put("categoria", viewReport.getCategoria());
                parameters.put("tipo_parto", viewReport.getTipo_parto());
                parameters.put("tipo_paiente", viewReport.getTipo_paciente());

                parameters.put("padre_nombre", viewReport.getPadre_nombre());
                parameters.put("antecente_paterno", viewReport.getAntecedente_paterno());
                parameters.put("padre_ocupacion", viewReport.getPadre_ocupacion());
                parameters.put("padre_telefono", viewReport.getPadre_telefono());

                parameters.put("madre_nombre", viewReport.getMadre_nombre());
                parameters.put("antecedente_materno", viewReport.getAntecedente_materno());
                parameters.put("madre_ocupacion", viewReport.getMadre_ocupacion());
                parameters.put("madre_telefono", viewReport.getMadre_telefono());

                parameters.put("prfechacirugia", viewReport.getPrfechacirugia());
                parameters.put("prprocquirurgico", viewReport.getPrprocquirurgico());
                parameters.put("prclinica", viewReport.getPrclinica());
                parameters.put("prcirujano", viewReport.getPrcirujano());

                parameters.put("efecha", viewReport.getEfecha());
                parameters.put("epeso", viewReport.getEpeso());
                parameters.put("etalla", viewReport.getEtalla());
                parameters.put("etemperatura", viewReport.getEtemperatura());

                parameters.put("qdiagnostico", viewReport.getQdiagnostico());
                parameters.put("qtratamiento", viewReport.getQdiagnostico());
                parameters.put("qrefereridoa", viewReport.getQreferidoa());

                parameters.put("url_image", viewReport.getFotografia());
                parameters.put("url_logo", fileImage.getAbsolutePath());
                //parameters.put("url_logo", "https://api.ayninakuna.org/public/pacientes_fotos/ayninakuna.png");


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
