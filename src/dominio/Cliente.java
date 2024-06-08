package dominio;

import tads.ListaSimple;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private String pasaporte;
    private int edad;
    private ListaSimple<Pasaje> pasajesCompradosDevueltos;

    public Cliente(String _pasaporte,String _nombre, int _edad) {
        this.setNombre(_nombre);
        this.setPasaporte(_pasaporte);
        this.setEdad(_edad);
        this.pasajesCompradosDevueltos = new ListaSimple<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return this.getPasaporte() + "-" + this.getNombre() + "-" + getEdad()+"|";

    }

    public ListaSimple<Pasaje> getPasajesCompradosDevueltos() {
        return pasajesCompradosDevueltos;
    }

    public void setPasajesCompradosDevueltos(ListaSimple<Pasaje> pasajesCompradosDevueltos) {
        this.pasajesCompradosDevueltos = pasajesCompradosDevueltos;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getPasaporte().compareTo(o.getPasaporte());
    }
    @Override
    public boolean equals(Object obj) {
 
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cliente other = (Cliente) obj;
        return this.getPasaporte().equals(other.getPasaporte());
    }
    

 
}
