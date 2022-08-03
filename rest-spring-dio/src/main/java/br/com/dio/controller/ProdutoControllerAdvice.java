package br.com.dio.controller;

import br.com.dio.exception.ProdutoNullException;
import br.com.dio.exception.ProdutoPriceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProdutoNullException.class)
    public ResponseEntity<Object> catpuraErroNull(){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(getBody("message","Verifique os campos do produto"));
    }

    @ExceptionHandler(ProdutoPriceException.class)
    public ResponseEntity<Object> capturaValorInvalido(){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(getBody("message", "Valor informado é inválido"));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> errorGenerico(){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(getBody("message","Ocorreu um error no sistema!"));
    }

    private Map<String, Object> getBody(String key, String value){
        Map<String, Object> body = new HashMap<>();
        body.put(key,value);
        return body;
    }
}
