package com.springboot.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class OracleJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OracleJpaApplication.class, args);
	}
}
