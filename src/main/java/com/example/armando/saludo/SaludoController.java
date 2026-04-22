package com.example.armando.saludo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(
        name = "Saludo"
)
@RestController
public class SaludoController {
    @GetMapping ("/saludo")
    public String inicio () {
        return "Hola Mundo!!!";
    }
}
