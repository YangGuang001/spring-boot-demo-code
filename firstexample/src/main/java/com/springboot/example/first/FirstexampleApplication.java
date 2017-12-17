package com.springboot.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.example.first.dao")
@EntityScan(basePackages = "com.springboot")
@EnableScheduling
@ServletComponentScan
public class FirstexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstexampleApplication.class, args);
	}
}
