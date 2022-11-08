package com.example.Ejercicio101112.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        ApiInfo api= new ApiInfo("SpringBoot Book REST",
                "Una api de biblioteca",
                "1.0",
                "https://www.linkedin.com/in/mati-sosa-lucero95/",
                new Contact("Matias", "https://www.linkedin.com/in/mati-sosa-lucero95/", "mati.sosa95@hotmail.com"),
                "MIT",
                "https://www.linkedin.com/in/mati-sosa-lucero95/",
                Collections.emptyList());

        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(api).
                select().
                apis(RequestHandlerSelectors.any()).
                paths(PathSelectors.any()).
                build();
    }
}
