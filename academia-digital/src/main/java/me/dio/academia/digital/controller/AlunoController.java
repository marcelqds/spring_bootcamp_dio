package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired AlunoServiceImpl alunoService;

    @GetMapping public List<Aluno> findAll(@RequestParam(value="dataDeNascimento", required = false) String dataDeNascimento){
        return alunoService.getAll(dataDeNascimento);
    }

    @GetMapping(value = "/{id}")
    public Aluno findById(@PathVariable Long id){
        return alunoService.get(id);
    }

    @PostMapping public Aluno save(@RequestBody @Valid AlunoForm alunoForm){
        return alunoService.create(alunoForm);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> findAllAvalicacoesById(@PathVariable Long id){
        return alunoService.findAllAvalicoesById(id);
    }

}
