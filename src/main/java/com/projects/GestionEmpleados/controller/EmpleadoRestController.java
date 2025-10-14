package com.projects.GestionEmpleados.controller;

import com.projects.GestionEmpleados.model.Empleado;
import com.projects.GestionEmpleados.service.EmpleadoService;
import com.projects.GestionEmpleados.service.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.yaml.snakeyaml.events.Event;


import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmpleadoRestController {

    @Lazy
    @Autowired
    //@Qualifier("listEmpleadoService")
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>> getEmpleados() {
        List<Empleado> empleados = empleadoService.getEmpleados();
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<?> getEmpleadoById(@PathVariable Long id){
        Empleado empleado = empleadoService.getEmpleadoById(id);
            if (empleado == null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("empleado no encontrado con id" + id);
            }

        return ResponseEntity.ok(empleado);

    }

    @PostMapping("/empleados")
    public ResponseEntity<?> registrarEmpleado(@RequestBody Empleado empleado){
        //<?> esta convencion permite recibir en el return cualquier tipo de elemento
       // empleados.add(empleado);
        //return ResponseEntity.status(HttpStatus.CREATED).body("Empleado" + empleado.getID() + " creado con exito");
        //la linea arriba comentada esta bien peor por buenas practicas de restApi,
        // es necesario entregar solo el codigo de respuesta HTTP y la URL para consumir el servicio

        Empleado empleadoCreado = empleadoService.registrarEmpleado(empleado);

        URI ubicacion = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(empleadoCreado.getId())
                .toUri();

        return ResponseEntity.created(ubicacion).body(empleadoCreado);
    }
}


