package com.mqds.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;

    public void setTitulo(String titulo){ this.titulo = titulo;}
    public void setDescricao(String descricao){this.descricao = descricao;}
    public void setData(LocalDate data){ this.data = data;}

   public String getTitulo(){ return titulo;}
   public String getDescricao(){ return descricao;}
   public LocalDate getData(){ return data;}

   @Override
   public String toString(){
    return "{titule='" +titulo + '\'' +
        ",descricao='" + descricao + '\'' +
        ",data=" + data +
        '}'; 
   }

}
