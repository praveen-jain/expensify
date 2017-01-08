package com.crizillion.expensify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ExpensifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensifyApplication.class, args);
	}
}