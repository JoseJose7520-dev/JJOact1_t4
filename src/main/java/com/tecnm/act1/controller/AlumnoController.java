package com.tecnm.act1.controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/datos")
    public Map<String, Object> datos() {
        return Map.of(
            "nombre", "Jose Jose Osvaldo",
            "carrera", "Ingeniería en Sistemas Computacionales",
            "semestre", 7,
            "institucion", "TecNM Campus Oaxaca"
        );
    }

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of(
            "Gestión de Proyectos de Software",
            "Lenguajes y Autómatas II",
            "Administración de Bases de Datos",
            "Taller de Investigación I",
            "Arquitectura de Computadoras"
        );
    }

    @GetMapping("/semestre")
    public int semestre() {
        return 7;
    }
}