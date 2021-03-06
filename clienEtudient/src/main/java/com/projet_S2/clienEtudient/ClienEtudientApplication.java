package com.projet_S2.clienEtudient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2

public class ClienEtudientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienEtudientApplication.class, args);
	}

}
