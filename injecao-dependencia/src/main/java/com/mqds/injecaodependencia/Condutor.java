package com.mqds.injecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args){
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    @Autowired
    private Veiculo veiculo;

    public Condutor(Veiculo obj){
        veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}
