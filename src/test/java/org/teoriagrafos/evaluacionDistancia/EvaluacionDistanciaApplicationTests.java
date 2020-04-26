package org.teoriagrafos.evaluacionDistancia;

import logical.grafos.Grafos;
import logical.grafos.Vertices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import logical.grafos.Principal;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ComponentScan(basePackages = "logical.grafos")
class EvaluacionDistanciaApplicationTests {

     @Autowired
	 Grafos gr;

	@Test
	void contextLoads() throws Exception {

		Principal p = new Principal();
		Grafos g = new Grafos();
		p.crearMenuPrincipal();
		p.busquedaporAnchura(100);
		int a = 10;
		
	}



}
