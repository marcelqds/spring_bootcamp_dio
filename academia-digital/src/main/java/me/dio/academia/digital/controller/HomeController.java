package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @GetMapping
    public String getWelcome(){
        return "API - Academia de Ginástica - v1.0";
    }
}
