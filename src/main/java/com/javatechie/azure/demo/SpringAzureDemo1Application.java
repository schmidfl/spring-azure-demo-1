package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemo1Application {

	@GetMapping("/message")
	public String message(){
		return "Congrats! Your app was successfully deployed in Azure!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemo1Application.class, args);
	}

}
