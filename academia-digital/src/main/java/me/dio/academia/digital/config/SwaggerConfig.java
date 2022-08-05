package me.dio.academia.digital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Api Academia de Ginástica")
                .description("Matrícula e avaliação fisíca de alunos")
                .contact(new Contact("Queiroz","http://localhost:8080","queiroz@teste.com.br"))
                .version("1.0")
                .build();
    }

    @Bean
    public Docket getApi(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("me.dio.academia.digital.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
}
