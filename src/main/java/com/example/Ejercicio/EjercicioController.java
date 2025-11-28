package com.example.Ejercicio;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class EjercicioController {
    @PostMapping(
            path = "/ejercicio",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Map <String, String> ejercicio(@RequestBody Map<String, String> datos){
        String usuario = datos.get("usuario");
        String contrasena = datos.get("contrasena");

        String mensaje= " " +usuario+" " + contrasena + "tus datos enviados correctamente";
        return Map.of("mensaje",mensaje);
    }
}
