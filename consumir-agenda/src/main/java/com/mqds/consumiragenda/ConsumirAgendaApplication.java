package com.mqds.consumiragenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //Habilitando Feign
public class ConsumirAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumirAgendaApplication.class, args);
	}

}
