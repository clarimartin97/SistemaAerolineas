/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads;

/**
 *
 * @author Clara
 */
public class Cola<T extends Comparable<T>> implements ICola<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int cantidad;

    @Override
    public void encolar(T n) {
        Nodo<T> nuevoNodo = new Nodo<>(n);
        if (esVacia()) {
            inicio = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
        cantidad++;
    }

    @Override
    public void desencolar() {
        if (!esVacia()) {
            if (inicio == fin) {
                inicio = null;
            } else {
                inicio = inicio.getSiguiente();
            }
            cantidad--;
        }
    }

    @Override
    public Nodo<T> frente() {
        return inicio;

    }

    public boolean esVacia() {
        return inicio == null;
    }
}
