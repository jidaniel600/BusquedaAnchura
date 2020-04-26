package org.teoriagrafos;

import java.util.ArrayList;
import java.util.List;
import  logical.grafos.Estados;

public class Nodo {

     private int contenido;
     private List<Nodo> nodosHijos;
     private Estados estado;

     

     public Nodo(final int contenido) throws Exception {
          validarContenido(contenido);
          this.estado = Estados.NO_VISITADO;
           nodosHijos = new ArrayList<>();

     }

     public void validarContenido(final int num) throws Exception {
          if (num < 0)
               throw new Exception("no puede ser un numero negativo el contenido");
          this.contenido = num;
     }

     public int getContenido() {
          return contenido;
     }

     public void setContenido(int contenido) {
          this.contenido = contenido;
     }

    

     public Estados getEstado() {
          return estado;
     }

     public void setEstado(Estados estado) {
          this.estado = estado;
     }

     public List<Nodo> getNodosHijos() {
          return nodosHijos;
     }

     public void setNodosHijos(List<Nodo> nodosHijos) {
          this.nodosHijos = nodosHijos;
     }



}