package com.kamala.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kamala.controller")
public class KalamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalamaApplication.class, args);
	}
}
