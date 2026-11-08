package com.tecnm.act1.controller;

import java.time.LocalDateTime;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {

    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto Act1 T4 - Jose Jose Osvaldo - Ingeniería en Sistemas Computacionales";
    }

    @GetMapping("/estado")
    public Map<String, Object> estado() {
        return Map.of(
            "estado", "activo",
            "hora", LocalDateTime.now().toString(),
            "java", System.getProperty("java.version")
        );
    }
}