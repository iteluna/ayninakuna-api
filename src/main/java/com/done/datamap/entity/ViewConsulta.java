package com.done.datamap.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class ViewConsulta {
    @Id
    private Integer id;
    private String origen;
    private String created_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }


}
