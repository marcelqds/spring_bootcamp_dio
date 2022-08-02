package com.mqds.agenda.controller;

import com.mqds.agenda.entity.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato get(){
        Contato contato = new Contato(1L,"Marcelo","5933-3762");
        return contato;
    }
}
