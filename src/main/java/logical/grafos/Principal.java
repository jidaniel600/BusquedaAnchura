package logical.grafos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	int[] elementos = { 100, 80, 200, 70, 90, 150, 300, 40, 76, 96, 170, 20, 50, 160, 180 };
	List<Vertices> lista;
	public void crearMenuPrincipal() {

		try {
			Grafos grafo = new Grafos();

			for (int pos = 0; pos < elementos.length; pos++) {
				Vertices v = new Vertices(elementos[pos]);
				grafo.agregarVertice(v);

			}
			lista = grafo.getListaVertices();

			for (Vertices vert : lista) {

				if (vert.getContenido()==100) {
					vert.agregarHijo(lista.get(1));
					vert.agregarHijo(lista.get(2));
				}
				if (vert.getContenido() == 80) {
					vert.agregarHijo(lista.get(3));
					vert.agregarHijo(lista.get(4));
				}
				if (vert.getContenido() == 200) {
					vert.agregarHijo(lista.get(5));
					vert.agregarHijo(lista.get(6));
				}
				if (vert.getContenido() == 70) {
					vert.agregarHijo(lista.get(7));
					vert.agregarHijo(lista.get(8));
				}
				if (vert.getContenido() == 90) {
					vert.agregarHijo(lista.get(9));

				}
				if (vert.getContenido() == 150) {
					vert.agregarHijo(lista.get(10));

				}
				if (vert.getContenido() == 40) {
					vert.agregarHijo(lista.get(11));
					vert.agregarHijo(lista.get(12));

				}
				if (vert.getContenido() == 170) {
					vert.agregarHijo(lista.get(13));
					vert.agregarHijo(lista.get(14));

				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}

	public void busquedaporAnchura(int numero) throws Exception {

		try {
			Vertices v = new Vertices(numero);
			LinkedList<Vertices> cola = new LinkedList<>();
			cola.add(v);
			while(!cola.isEmpty()){

				v =  cola.poll();
				System.out.print(v + " ");
				Iterator<Vertices> adj =  lista.iterator();

				while (adj.hasNext()){
					Vertices vadj = adj.next();
					if(vadj.getEstado() == Estados.NO_VISITADO){
						vadj.setEstado(Estados.VISITADO);
						cola.add(vadj);
					}
				}

			}

		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
		}


	}

}
