package com.api.rest;

import com.api.rest.persistence.ProductoRepository;
import com.api.rest.persistence.crud.ProductoCrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}


}
