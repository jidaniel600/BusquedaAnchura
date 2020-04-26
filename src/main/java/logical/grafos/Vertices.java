package logical.grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vertices {

	private int contenido;
	private LinkedList<Vertices> hijos;
	private Estados estado;

	public Vertices(int valor ) throws Exception {
		validarContenido(valor);
		this.estado = Estados.NO_VISITADO;
		this.hijos = new LinkedList<>();

	}

	public void agregarHijo(Vertices hijo) {
		 hijos.add(hijo);
	}
	
	public void validarContenido(int num) throws Exception {
		if (num <= 0) {
			throw new Exception("no se puede validar el numero negativo");
		}
		this.contenido = num;
	}

	
	
	/* getters y setters de la aplicacion*/
	
	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public List<Vertices> getHijos() {
		return hijos;
	}

	public void setHijos(LinkedList<Vertices> hijos) {
		this.hijos = hijos;
	}
	
	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	



}
