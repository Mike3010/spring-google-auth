package com.example.googleauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableWebSecurity
@RestController
public class GoogleAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleAuthApplication.class, args);
	}

 	@GetMapping("/test")
	public String test() {
		return "test works";
	}

	@GetMapping("/user")
	public Principal currentUserName(Principal principal) {
		return principal;
	}
}
