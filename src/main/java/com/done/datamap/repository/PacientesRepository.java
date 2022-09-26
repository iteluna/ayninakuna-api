package com.done.datamap.repository;

import com.done.datamap.dto.ReportResponse;
import com.done.datamap.entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
    //@Query(value = "SELECT new com.done.datamap.dto.ReportResponse( p.apellido_paterno, p.apellido_materno) FROM pacientes p where p.codigo=:codigo")
    //List<ReportResponse> findPacientesByCodigo(String codigo);

    @Query(value = "SELECT p.id, p.codigo, p.categoria, p.nombres " +
            " FROM pacientes p where p.codigo=:codigo",nativeQuery = true)
    List<Pacientes> findPacientesByCodigo(String codigo);

}
