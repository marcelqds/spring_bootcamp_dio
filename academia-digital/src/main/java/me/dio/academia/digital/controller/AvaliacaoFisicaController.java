package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    AvaliacaoFisicaServiceImpl avaliacaoService;

    @GetMapping public List<AvaliacaoFisica> findAll(){
        return avaliacaoService.getAll();
    }

    @GetMapping(value = "/{id}")
    public AvaliacaoFisica findById(@PathVariable Long id){
        return avaliacaoService.get(id);
    }

    @PostMapping
    public AvaliacaoFisica save(@RequestBody @Valid AvaliacaoFisicaForm form){
        return avaliacaoService.create(form);
    }
}
