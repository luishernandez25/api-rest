package com.api.rest.web.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class TestController {

    @GetMapping("/hola")
    public  String saludar (){
        return "hello world";

    }
}
