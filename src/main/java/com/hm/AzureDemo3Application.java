package com.hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class AzureDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemo3Application.class, args);
	}
	
	@GetMapping("/")
	public String getAPI() {
		return "Hello Spring Boot Azure API!";
	}
	
	@GetMapping("/mesage")
	public String getMessage() {
		return "Hello Spring Boot Azure Message API!";
	}
	

}
