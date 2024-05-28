//import dominio.Avion;
//import java.util.ArrayList;
//import java.util.List;
package dominio;

import java.util.Objects;
import tads.ListaSimple;

public class Aerolinea implements Comparable<Aerolinea> {

    private String nombre;
    private String pais;
    private int cantMaxAviones;
    private ListaSimple<Avion> aviones;
    private ListaSimple<Pasaje> pasajesDevueltos;

    public Aerolinea(String _nombre, String _pais, int _cantMaxAviones) {
        this.setNombre(_nombre);
        this.setPais(_pais);
        this.setCantMaxAviones(_cantMaxAviones);
        this.aviones = new ListaSimple<>();
        this.pasajesDevueltos = new ListaSimple<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantMaxAviones() {
        return cantMaxAviones;
    }

    public void setCantMaxAviones(int cantMaxAviones) {
        this.cantMaxAviones = cantMaxAviones;
    }

    public ListaSimple<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(ListaSimple<Avion> aviones) {
        this.aviones = aviones;
    }

    public ListaSimple<Pasaje> getPasajesDevueltos() {
        return pasajesDevueltos;
    }

    public void setPasajesDevueltos(ListaSimple<Pasaje> pasajesDevueltos) {
        this.pasajesDevueltos = pasajesDevueltos;
    }

    public String toString() {
        return this.getNombre() + "-" + this.getPais() + "-" + getCantMaxAviones();

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aerolinea aerolinea = (Aerolinea) obj;
        return this.getNombre().equalsIgnoreCase(aerolinea.getNombre());
    }

    @Override
    public int compareTo(Aerolinea o) {
      return this.nombre.compareToIgnoreCase(o.nombre);
    }


}
