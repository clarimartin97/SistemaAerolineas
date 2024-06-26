package tads;

public class Nodo<T extends Comparable<T>> {

    private T dato;
    private Nodo siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
