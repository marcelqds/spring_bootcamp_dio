package com.mqds.injecaodependencia;

public class Carro implements Veiculo{

    @Override
    public void acao() {
        System.out.println("É um carro.");
    }
}
