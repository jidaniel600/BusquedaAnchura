package logical.grafos;

import java.util.*;

import org.springframework.stereotype.Service;

import  java.util.LinkedList;

import logical.grafos.Vertices;


@Service
public class Grafos {

    private LinkedList<Vertices> listaVertices;


    public Grafos() {
        try {
            listaVertices = new LinkedList<>();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void agregarVertice(Vertices v) {
        try {
            if (!comprobarExistencia(v))
                listaVertices.add(v);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    public java.util.List<Vertices> getListaVertices() {
        return listaVertices;
    }

    public void setListaVertices(LinkedList listaVertices) {
        this.listaVertices = listaVertices;
    }

    public boolean comprobarExistencia(Vertices vert) {
        int res = (int) listaVertices.stream().filter(d -> d.getContenido() == vert.getContenido()).count();

        if (res > 0)
            return true;
        return false;


    }

}
