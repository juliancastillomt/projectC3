package com.juliancastillo.alquilerComputadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AlquilerComputadoresApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlquilerComputadoresApplication.class, args);
	}

}
