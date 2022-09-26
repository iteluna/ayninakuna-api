package com.done.datamap.controller;
import com.done.datamap.entity.ViewReport;
import com.done.datamap.service.ViewReportService;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewReportController {
    private final ViewReportService viewConsultaService;

    public ViewReportController(ViewReportService viewConsultaService){
        this.viewConsultaService=viewConsultaService;
    }

    @GetMapping("/viewReport1ById")
    public List<ViewReport> viewReport1ById(Integer id){
        return this.viewConsultaService.getViewReport1ById(id);
    }

    @GetMapping("/exportPDFById")
    public ResponseEntity<Resource> exportPDFById(Integer id){
        return this.viewConsultaService.exportPDFById(id);
    }
}
