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

    @Query(value = "SELECT v.id, v.nombre_completo, v.fotografia" +
            ", v.edad, v.tipo_malformacion, v.lugar_nacimiento, v.patologias, v.direccion " +
            ", v.codigo, v.categoria, v.tipo_parto, v.tipo_paciente" +
            ", v.padre_nombre, v.antecedente_paterno, v.padre_ocupacion, v.padre_telefono " +
            ", v.madre_nombre, v.antecedente_materno, v.madre_ocupacion, v.madre_telefono " +
            ", v.prfechacirugia, v.prprocquirurgico, v.prclinica, v.prcirujano " +
            ", v.efecha, v.epeso, v.etalla, v.etemperatura " +
            ", v.fdiagnostico, v.ffecha_sesion, v.fdescripcion, v.fusuario " +
            ", v.oreceta, v.otratamiento, v.otipomoldeador, v.oplacas " +
            ", v.qtratamiento, v.qdiagnostico, v.qreferidoa " +
            " FROM vw_reporte1 v where v.id=:id",nativeQuery = true)
    Optional<ViewReport> exportPDFById(Integer id);
}
