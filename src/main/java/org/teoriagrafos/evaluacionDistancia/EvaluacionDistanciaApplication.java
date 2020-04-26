package org.teoriagrafos.evaluacionDistancia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import logical.grafos.Principal;

@SpringBootApplication
@ComponentScan(basePackages = {"logical.grafos"})
public class EvaluacionDistanciaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionDistanciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("iniciando el comando ");
		
		
	}
	

}
