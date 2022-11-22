package com.mvncicd.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsMvnApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Method";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsMvnApplication.class, args);
		System.out.println("Welcome to Springboot");
	}

}
