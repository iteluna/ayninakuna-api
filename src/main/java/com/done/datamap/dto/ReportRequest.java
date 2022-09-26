package com.done.datamap.dto;

import com.done.datamap.entity.Pacientes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReportRequest {
    private Pacientes pacientes;
}
