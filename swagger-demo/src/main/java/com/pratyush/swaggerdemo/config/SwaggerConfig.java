package com.pratyush.swaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Pratyush Code")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/book.*")).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Book Service")
                .description("Sample documentation generated using swagger2 for our Book Rest APIs")
                .termsOfServiceUrl("https://www.google.com/")
                .license("Prayush licence @2020")
                .licenseUrl("https://www.google.com/")
                .version("1.0")
                .build();
    }

}
