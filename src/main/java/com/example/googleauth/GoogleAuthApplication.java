package com.example.googleauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableWebSecurity
@RestController
public class GoogleAuthApplication {

	public static void main(final String[] args) {
		SpringApplication.run(GoogleAuthApplication.class, args);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/test")
	public String test() {
		return "test works";
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user")
	public Principal currentUserName(final Principal principal) {
		return principal;
	}
}
