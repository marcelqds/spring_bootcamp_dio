package com.mqds.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos){ 
        this.conteudoIscritos = conteudoInscritos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos){
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public Set<Conteudo> getConteudoInscritos(){ 
        return conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos(){
        return conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome,dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
