package com.example.newreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan({"main.Controllers", "main.Repo"})
@EnableJpaRepositories("main.Repo")

public class NewregApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewregApplication.class, args);
	}

}
