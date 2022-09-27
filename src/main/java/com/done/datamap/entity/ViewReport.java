package com.done.datamap.entity;



import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class ViewReport {
    @Id
    private Integer id;
    private String fotografia;

    private String nombre_completo;
    private String edad;
    private String tipo_malformacion;
    private String lugar_nacimiento;
    private String patologias;
    private String direccion;

    private String codigo;
    private String categoria;
    private String tipo_parto;
    private String tipo_paciente;

    private String padre_nombre;
    private String antecedente_paterno;
    private String padre_ocupacion;
    private String padre_telefono;

    private String madre_nombre;
    private String antecedente_materno;
    private String madre_ocupacion;
    private String madre_telefono;

    private String prfechacirugia;
    private String prprocquirurgico;
    private String prclinica;
    private String prcirujano;

    private String efecha;
    private String epeso;
    private String etalla;
    private String etemperatura;

    private String fdiagnostico;
    private String ffecha_sesion;
    private String fdescripcion;
    private String fusuario;

    private String oreceta;
    private String otratamiento;
    private String otipomoldeador;
    private String oplacas;

    private String qdiagnostico;
    private String qtratamiento;
    private String qreferidoa;

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

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo_malformacion() {
        return tipo_malformacion;
    }

    public void setTipo_malformacion(String tipo_malformacion) {
        this.tipo_malformacion = tipo_malformacion;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_parto() {
        return tipo_parto;
    }

    public void setTipo_parto(String tipo_parto) {
        this.tipo_parto = tipo_parto;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }

    public String getPadre_nombre() {
        return padre_nombre;
    }

    public void setPadre_nombre(String padre_nombre) {
        this.padre_nombre = padre_nombre;
    }

    public String getAntecedente_paterno() {
        return antecedente_paterno;
    }

    public void setAntecedente_paterno(String antecente_paterno) {
        this.antecedente_paterno = antecente_paterno;
    }

    public String getPadre_ocupacion() {
        return padre_ocupacion;
    }

    public void setPadre_ocupacion(String padre_ocupacion) {
        this.padre_ocupacion = padre_ocupacion;
    }

    public String getPadre_telefono() {
        return padre_telefono;
    }

    public void setPadre_telefono(String padre_telefono) {
        this.padre_telefono = padre_telefono;
    }

    public String getMadre_nombre() {
        return madre_nombre;
    }

    public void setMadre_nombre(String madre_nombre) {
        this.madre_nombre = madre_nombre;
    }

    public String getAntecedente_materno() {
        return antecedente_materno;
    }

    public void setAntecedente_materno(String antecente_materno) {
        this.antecedente_materno = antecente_materno;
    }

    public String getMadre_ocupacion() {
        return madre_ocupacion;
    }

    public void setMadre_ocupacion(String madre_ocupacion) {
        this.madre_ocupacion = madre_ocupacion;
    }

    public String getMadre_telefono() {
        return madre_telefono;
    }

    public void setMadre_telefono(String madre_telefono) {
        this.madre_telefono = madre_telefono;
    }

    public String getPrfechacirugia() {
        return prfechacirugia;
    }

    public void setPrfechacirugia(String prfechacirugia) {
        this.prfechacirugia = prfechacirugia;
    }

    public String getPrprocquirurgico() {
        return prprocquirurgico;
    }

    public void setPrprocquirurgico(String prprocquirurgico) {
        this.prprocquirurgico = prprocquirurgico;
    }

    public String getPrclinica() {
        return prclinica;
    }

    public void setPrclinica(String prclinica) {
        this.prclinica = prclinica;
    }

    public String getPrcirujano() {
        return prcirujano;
    }

    public void setPrcirujano(String prcirujano) {
        this.prcirujano = prcirujano;
    }

    public String getEfecha() {
        return efecha;
    }

    public void setEfecha(String efecha) {
        this.efecha = efecha;
    }

    public String getEpeso() {
        return epeso;
    }

    public void setEpeso(String epeso) {
        this.epeso = epeso;
    }

    public String getEtalla() {
        return etalla;
    }

    public void setEtalla(String etalla) {
        this.etalla = etalla;
    }

    public String getEtemperatura() {
        return etemperatura;
    }

    public void setEtemperatura(String etemperatura) {
        this.etemperatura = etemperatura;
    }

    public String getFdiagnostico() {
        return fdiagnostico;
    }

    public void setFdiagnostico(String fdiagnostico) {
        this.fdiagnostico = fdiagnostico;
    }

    public String getFfecha_sesion() {
        return ffecha_sesion;
    }

    public void setFfecha_sesion(String ffecha_sesion) {
        this.ffecha_sesion = ffecha_sesion;
    }

    public String getFdescripcion() {
        return fdescripcion;
    }

    public void setFdescripcion(String fdescripcion) {
        this.fdescripcion = fdescripcion;
    }

    public String getFusuario() {
        return fusuario;
    }

    public void setFusuario(String fusuario) {
        this.fusuario = fusuario;
    }

    public String getOreceta() {
        return oreceta;
    }

    public void setOreceta(String oreceta) {
        this.oreceta = oreceta;
    }

    public String getOtratamiento() {
        return otratamiento;
    }

    public void setOtratamiento(String otratamiento) {
        this.otratamiento = otratamiento;
    }

    public String getOtipomoldeador() {
        return otipomoldeador;
    }

    public void setOtipomoldeador(String otipomoldeador) {
        this.otipomoldeador = otipomoldeador;
    }

    public String getOplacas() {
        return oplacas;
    }

    public void setOplacas(String oplacas) {
        this.oplacas = oplacas;
    }

    public String getQdiagnostico() {
        return qdiagnostico;
    }

    public void setQdiagnostico(String qdiagnostico) {
        this.qdiagnostico = qdiagnostico;
    }

    public String getQtratamiento() {
        return qtratamiento;
    }

    public void setQtratamiento(String qtratamiento) {
        this.qtratamiento = qtratamiento;
    }

    public String getQreferidoa() {
        return qreferidoa;
    }

    public void setQreferidoa(String qreferidoa) {
        this.qreferidoa = qreferidoa;
    }
}
