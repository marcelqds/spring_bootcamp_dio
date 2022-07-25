package com.mqds.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate data;

    public void setData(LocalDate data){ this.data = data;}

    public LocalDate getData(){ return data;}
    
    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

   @Override
   public String toString(){
    return "{titule='" +getTitulo() + '\'' +
        ",descricao='" + getDescricao() + '\'' +
        ",data=" + data +
        '}'; 
   }

}
