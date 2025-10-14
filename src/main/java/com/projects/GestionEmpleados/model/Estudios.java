package com.projects.GestionEmpleados.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="Estudios")
public class Estudios {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private Long anio;
    @Column
    private String mes;
    @Column
    private  String estudio;
    @Column
    private String institucion;
    @Column
    private String titulo;
    @Column
    @ManyToOne
    private  Long idEmpleado;

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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Estudios(Long id, Long anio, String mes, String estudio, String institucion, String titulo, Long idEmpleado) {
        this.id = id;
        this.anio = anio;
        this.mes = mes;
        this.estudio = estudio;
        this.institucion = institucion;
        this.titulo = titulo;
        this.idEmpleado = idEmpleado;
    }
}
