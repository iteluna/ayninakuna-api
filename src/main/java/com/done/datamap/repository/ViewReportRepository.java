package com.done.datamap.repository;

import com.done.datamap.entity.ViewReport;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ViewReportRepository extends JpaRepository<ViewReport, Integer> {
    @Query(value = "SELECT v.id, v.nombre_completo, v.codigo, v.categoria " +
            " FROM vw_reporte1 v where v.id=:id",nativeQuery = true)
    List<ViewReport> getViewReport1ById(Integer id);

    @Query(value = "SELECT v.id, v.nombre_completo, v.codigo, v.categoria " +
            " FROM vw_reporte1 v where v.id=:id",nativeQuery = true)
    Optional<ViewReport> exportPDFById(Integer id);
}
