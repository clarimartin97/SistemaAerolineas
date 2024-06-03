/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads;

public class Matriz<T> {

    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Object[filas][columnas];
    }
    
     public void agregarValor(T valor) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = valor;
                }
            }
        }
    }
     public boolean contiene(T valor) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (valor.equals(matriz[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
     
     public void eliminarValor(T valor) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (valor.equals(matriz[i][j])) {
                    matriz[i][j] = null;
                }
            }
        }
    }
}

