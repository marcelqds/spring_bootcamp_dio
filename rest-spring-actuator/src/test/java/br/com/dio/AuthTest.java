package br.com.dio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest
public class AuthTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deveRetornarErrorComCredencialInvalida() throws Exception{
        URI uri = new URI("/auth/signin");
        String content = "{\"username\":\"queiroz\",\"senha\":\"123456\"}";
        mockMvc.perform(MockMvcRequestBuilders
                .post(uri)
                .content(content)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().is(200));
    }
}
