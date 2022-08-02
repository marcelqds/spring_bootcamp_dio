package com.mqds.springbootweb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/{id}")
    public String get(@PathVariable Long id){
        return "{\"nome\": \"Hello World\"}";
    }

    @GetMapping
    public List<String> listAll(){
        List<String> list = new ArrayList<>();
        list.add("Hello World");
        list.add("Hello World");
        list.add("Hello World");

        return list;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String inserir(@RequestBody String nome){
        return "Nome: "+ nome;
    }

    /*@PutMapping("/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody String nome){
        return "Editando "+id + " "+ nome;
    }*/

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        System.out.println("Deletado com sucesso! "+id);
    }
}
