package com.app.devfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DevfolioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevfolioServerApplication.class, args);
	}

}
