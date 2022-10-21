package com.example.dbauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DbauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbauthApplication.class, args);
	}

}
