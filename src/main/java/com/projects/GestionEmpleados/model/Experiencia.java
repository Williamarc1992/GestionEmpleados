package com.projects.GestionEmpleados.model;

import jakarta.persistence.*;

@Entity
@Table(name="Experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Long anio;
    @Column
    private String mes;
    @Column
    private String empresa;
    @Column
    private String jefe;
    @Column
    private  String cargo;
    @Column
    private  String responsabilidades;
    @Column
    private  String logros;


    public Experiencia(Long id, Long anio, String mes, String empresa, String jefe, String cargo, String responsabilidades, String logros, Empleado empleado) {
        this.id = id;
        this.anio = anio;
        this.mes = mes;
        this.empresa = empresa;
        this.jefe = jefe;
        this.cargo = cargo;
        this.responsabilidades = responsabilidades;
        this.logros = logros;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }


}
