package com.done.datamap.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class ViewConsulta {
    @Id
    private Integer id;
    private String nombre_completo;
    private String codigo;
    private String categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String origen) {
        this.nombre_completo = origen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String created_at) {
        this.codigo = created_at;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
