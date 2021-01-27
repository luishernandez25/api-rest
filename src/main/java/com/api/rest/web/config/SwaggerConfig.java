package com.api.rest.web.config;

import com.google.common.collect.Lists;
import io.swagger.annotations.AuthorizationScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiKey apiKey() {
        return new ApiKey("AUTHORIZATION", "api_key", "header");
    }


    @Bean
    public Docket api() {

        ParameterBuilder paramBuilder = new ParameterBuilder();
        List<Parameter> params = new ArrayList<>();
        paramBuilder.name("Authorization").modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        params.add(paramBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(params)

                .select()
                .apis(RequestHandlerSelectors.basePackage("com.api.rest.web.controller"))
                .build().apiInfo(apiEndInfo())

        .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

    }

    private ApiInfo apiEndInfo() {
        return new ApiInfoBuilder().title("Api Rest By Lhz")
                .description("Desarrollo de API para aplicacion productos IT, Para su uso debes primero invocar el auth-controller el cual te devolvera un token para poder interactuar con las demas apis, Luego deberas agregar el prefijo Bearer seguido  del token")
                .license("Apache 2.0")
                .version("1.5.0").contact(new Contact("Luis", "https://luishernandezweb.com", "contact@lhz.com"))
                .licenseUrl("www.apache.org/licences/LICENCE-2.0.html")
                .build();

    }



}