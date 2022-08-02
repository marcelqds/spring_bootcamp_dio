package com.mqds.testeunidade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TesteIntegracao {
    @Autowired
    private MockMvc mvc;

    @Test void testeSemArgumento() throws Exception{
        RequestBuilder requisicao = get("/teste/integracao");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem vindo, Tchelo",resultado.getResponse().getContentAsString());
    }

    @Test void testeComArgumento() throws Exception{
        RequestBuilder requisicao = get("/teste/integracao?nome=marcelo");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem vindo, marcelo", resultado.getResponse().getContentAsString());
    }
}
