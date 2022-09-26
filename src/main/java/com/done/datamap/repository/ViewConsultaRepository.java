package com.done.datamap.repository;

import com.done.datamap.entity.Enfermerias;
import com.done.datamap.entity.Pacientes;
import com.done.datamap.entity.ViewConsulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViewConsultaRepository extends JpaRepository<ViewConsulta, Integer> {
    @Query(value = "SELECT p.id, p.origen, p.created_at " +
            " FROM vw_consultas p where p.id=:id",nativeQuery = true)
    List<ViewConsulta> findViewPacientesById(Integer id);
}
