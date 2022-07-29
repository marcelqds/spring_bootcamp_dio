package com.mqds.projetospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String HelloMessage(){
        return "Hello World!";
    }
}

