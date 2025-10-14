package com.projects.GestionEmpleados.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
}
