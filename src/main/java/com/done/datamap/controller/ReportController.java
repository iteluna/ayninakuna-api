package com.done.datamap.controller;
import com.done.datamap.repository.ViewConsultaRepository;
import com.done.datamap.entity.ViewConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private ViewConsultaRepository viewConsultaRepository;
    @GetMapping("/listViewPacientesById")
    public List<ViewConsulta> getListViewPacientesById(Integer id){
        return viewConsultaRepository.findViewPacientesById(id);
    }
}
