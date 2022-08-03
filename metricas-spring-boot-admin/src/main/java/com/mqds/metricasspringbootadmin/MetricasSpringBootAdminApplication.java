package com.mqds.metricasspringbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
//@SpringBootApplication
public class MetricasSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricasSpringBootAdminApplication.class, args);
	}

}
