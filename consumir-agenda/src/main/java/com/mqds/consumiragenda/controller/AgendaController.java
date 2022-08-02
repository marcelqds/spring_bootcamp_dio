package com.mqds.consumiragenda.controller;

import com.mqds.consumiragenda.Contato;
import com.mqds.consumiragenda.IConsumindoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @Autowired
    private IConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato(){
        return consumindoApi.retornaContato();
    }
}
