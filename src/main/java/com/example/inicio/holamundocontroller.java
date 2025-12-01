package com.example.inicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundocontroller {

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo desde Spring Boot!";
    }
}
