package com.projects.GestionEmpleados.service;

import com.projects.GestionEmpleados.model.Empleado;
import com.projects.GestionEmpleados.model.Empleado;
import com.projects.GestionEmpleados.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Lazy
@Service
//@Service("listEmpleadoService")
//@ConditionalOnProperty(name="service.empleados", havingValue = "list")
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;


    public List<Empleado> getEmpleados() {

        return empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(Long id) {

        return empleadoRepository.getById(id);
    }

    public Empleado registrarEmpleado(Empleado empleado){
        empleadoRepository.saveAndFlush(empleado);
        return empleado;
    }
}
