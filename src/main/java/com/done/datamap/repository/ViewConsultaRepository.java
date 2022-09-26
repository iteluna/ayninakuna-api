package com.done.datamap.repository;

import com.done.datamap.entity.ViewConsulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViewConsultaRepository extends JpaRepository<ViewConsulta, Integer> {
    @Query(value = "SELECT v.id, v.nombre_completo, v.codigo, v.categoria " +
            " FROM vw_reporte1 v where v.id=:id",nativeQuery = true)
    List<ViewConsulta> findViewPacientesById(Integer id);
}
