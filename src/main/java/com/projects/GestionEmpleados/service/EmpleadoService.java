package com.projects.GestionEmpleados.service;


import com.projects.GestionEmpleados.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    public List<Empleado> getEmpleados();
    public Empleado getEmpleadoById(Long id);
    public Empleado registrarEmpleado(Empleado empleado);
}
