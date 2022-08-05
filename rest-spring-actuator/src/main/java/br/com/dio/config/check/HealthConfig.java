package br.com.dio.config.check;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class HealthConfig implements HealthIndicator {

    @Override
    public Health health() {
        try{
            InetAddress address = InetAddress.getByName("localhost");
            if(address.isReachable(10000))
                return Health.up().build();
        }catch(Exception e){
            return Health.down().withDetail("Motivo", "Ocorreu um problema: "+ e.getMessage()).build();
            //System.out.println("Ocorreu um erro: "+e.getMessage());
        }
        return Health.down().withDetail("Motivo", "Motivo desconhecido!").build();

    }

}

//https://codecentric.github.io/spring-boot-admin/2.6.6/