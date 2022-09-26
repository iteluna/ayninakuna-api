package com.done.datamap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import com.done.datamap.entity.Enfermerias;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Pacientes {

    @Id
    @GeneratedValue
    private Integer id;
    private String codigo;
    private String categoria;
    private String nombres;

    @OneToMany(targetEntity = Enfermerias.class, cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id", referencedColumnName = "id")
    private List<Enfermerias> enfermeriasList;

    @OneToMany(targetEntity = Fonoaudiologias.class, cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id", referencedColumnName = "id")
    private List<Fonoaudiologias> fonoaudiologiasList;

    public List<Fonoaudiologias> getFonoaudiologiasList() {
        return fonoaudiologiasList;
    }

    public void setFonoaudiologiasList(List<Fonoaudiologias> fonoaudiologiasList) {
        this.fonoaudiologiasList = fonoaudiologiasList;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List<Enfermerias> getEnfermeriasList() {
        return enfermeriasList;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
