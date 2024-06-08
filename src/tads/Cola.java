package tads;

import tads.ICola;
import tads.Nodo;

public class Cola<T extends Comparable<T>> implements ICola<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    int cantElementos;

    public Cola() {
        inicio = null;
        fin = null;
        cantElementos = 0;
    }

    @Override
    public void encolar(T dato) {

        Nodo nuevo = new Nodo(dato);
        if (this.esVacia()) {
            fin = nuevo;
        }
        nuevo.setSiguiente(getInicio());
        inicio = nuevo;
        cantElementos++;

    }

    @Override
    public void desencolar() {

        if (!this.esVacia()) {

            if (cantElementos == 1) {
                inicio = null; //To change body of generated methods, choose Tools | Templates.
                fin = null;
                cantElementos = 0;
            } else {

                Nodo actual = getInicio();

                while (actual.getSiguiente() != fin) {
                    actual = actual.getSiguiente();
                }

                actual.setSiguiente(null);
                fin = actual;

                cantElementos--;
            }
        }
    }

    @Override
    public boolean esVacia() {
        return getInicio() == null;
    }

    @Override
    public int cantElementos() {
        return cantElementos;
    }

    @Override
    public T frente() {
        if (!this.esVacia()) {
            return inicio.getDato();
        }
        return null;
    }

    @Override
    public Nodo<T> getInicio() {
        return inicio;
    }

    @Override
    public String mostrarCola() {
        String aux = "";
        Nodo mostrar = getInicio();

        while (mostrar != null) {

            aux += (mostrar.getDato() + " - ");
            mostrar = mostrar.getSiguiente();
        }

        return aux;

    }

}