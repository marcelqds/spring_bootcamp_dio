package com.mqds.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp{
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45)
    
    private Set<Dev> devsInscritos = new HashSet<>();
    private set<Conteudo> conteudos = LinkedHashSet<>();

    public void setNome(String nome){ this.nome = nome;}
    public void setDescricao(String descricao){this.descricao = descricao;}
    public void setDevsIncritos(Set<Dev> devsIncritos){this.devsInscritos = devsInscritos;}
    public void setConteudos(Set<Conteudo> conteudos){this.conteudos = conteudos;}

    public String getTitulo(){ return titulo;}
    public String getDescricao(){ return descricao;}
    public LocalDate getDataInicial(){ return dataInicial;}
    public LocalDate getDataFinal(){ return dataFinal;}
    public Set<Dev> getDevsInscritos(){ return devsInscritos;}
    public Set<Conteudo> getConteudos(){ return conteudos;}
    
    @Override
    public boolean equals(Objects o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Dev) o;
        return Objects.equals(nome,bootcamp.nome) 
        && Objects.equals(descricao, bootcamp.descricao) 
        && Objects.equals(dataInicial, bootcamp.dataInicial)
        && Objects.equals(dataFinal, bootcamp.dataFinal);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nome, descricao, dataInicial, dataFinal,devsInscritos, conteudos);
    }
}
