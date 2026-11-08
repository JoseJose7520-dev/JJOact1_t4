# JJOact1_t4 — Introducción a Spring Boot

Primer proyecto con Spring Boot para la materia, Tema 4 Act. 1.
Es una API sencilla con dos controladores que regresan información de prueba sobre mí y el proyecto.

**Alumno:** Jose Jose Osvaldo — Ingeniería en Sistemas Computacionales, 7.º semestre
**Institución:** TecNM Campus Oaxaca

## Tecnologías
- Java 21
- Spring Boot 4.1.2 (Spring Web)
- Maven
- Desplegado en un VPS Ubuntu con nginx y HTTPS (Let's Encrypt)

## Endpoints

| Ruta | Qué regresa |
|---|---|
| `/proyecto` | Nombre del proyecto y del alumno (texto) |
| `/estado` | Estado del servidor, hora y versión de Java (JSON) |
| `/alumno/datos` | Mis datos (JSON) |
| `/alumno/materias` | Lista de materias (JSON) |
| `/alumno/semestre` | Semestre actual (número) |

## Demo en línea
- https://devs8.tech/proyecto
- http://179.197.84.34:8081/proyecto

## Cómo correrlo
```
mvnw.cmd spring-boot:run
```
Después entra a `http://localhost:8081/proyecto`.

Para generar el jar:
```
mvnw.cmd clean package -DskipTests
java -jar target/act1-0.0.1-SNAPSHOT.jar
```

## Demo en línea

**VPS (puerto 8081)**
- http://179.197.84.34:8081/proyecto
- http://179.197.84.34:8081/estado
- http://179.197.84.34:8081/alumno/datos
- http://179.197.84.34:8081/alumno/materias
- http://179.197.84.34:8081/alumno/semestre

**Con HTTPS**
- https://devs8.tech/proyecto
- https://devs8.tech/estado
- https://devs8.tech/alumno/datos
- https://devs8.tech/alumno/materias
- https://devs8.tech/alumno/semestre