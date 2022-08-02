package com.mqds.testeunidade;

import com.mqds.testeunidade.controller.TesteController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TesteUnidadeController {

    @Test
    public void testeUnidade(){
        TesteController controller = new TesteController();
        String resultado = controller.unidade("Marcelo Queiroz");
        assertEquals("Hello World, Marcelo Queiroz",resultado);
    }

}
