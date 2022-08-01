package com.mqds.utilizandobeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("A marca de uma lágrima");
        livro.setCodigo("KOF123");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Antônio Bandeira");
        //livro.setAutorLivro(autor); Foi injetado via @Autowired

        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }
}
