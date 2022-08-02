package com.mqds.testeunidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TesteController {

    @GetMapping("/unidade")
    public String unidade(String nome){
        return String.format("Hello World, %s", nome);
    }

    @GetMapping("/integracao")
    public String integracao(@RequestParam(name="nome", defaultValue="Tchelo") String nome){
        return String.format("Bem vindo, %s",nome);
    }
}
