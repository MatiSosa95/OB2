package com.example.Ejercicio101112.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @Value("${app.message}")
    String message;

    @GetMapping
    public String helloWorld(){
        System.out.println(message);
        return "Hello World";
    }
}
