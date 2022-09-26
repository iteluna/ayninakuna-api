package com.done.datamap.controller;

import com.done.datamap.dto.ReportResponse;
import com.done.datamap.entity.Pacientes;
import com.done.datamap.entity.ViewConsulta;
import com.done.datamap.repository.EnfermeriasRepository;
import com.done.datamap.repository.PacientesRepository;
import com.done.datamap.repository.ViewConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private PacientesRepository pacientesRepository;
    @Autowired
    private EnfermeriasRepository enfermeriasRepository;
    @Autowired
    private ViewConsultaRepository viewConsultaRepository;

    @GetMapping("/listPacientes")
    public List<Pacientes> getListPacientes(){
        return pacientesRepository.findAll();
    }

    @GetMapping("/listPacientesByCodigo")
    public List<Pacientes> getListPacientesByCodigo(String codigo){
        return pacientesRepository.findPacientesByCodigo(codigo);
    }

    @GetMapping("/listViewPacientesById")
    public List<ViewConsulta> getListViewPacientesById(Integer id){
        return viewConsultaRepository.findViewPacientesById(id);
    }
}
