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
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = valor;
                    return;
                }
            }
        }
    }

    public boolean contiene(T valor) {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (valor.equals(matriz[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void eliminarValor(T valor) {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (valor.equals(matriz[i][j])) {
                    matriz[i][j] = null;
                }
            }
        }
    }

    public String mostrarMatriz(Matriz<T> mat) {
        String aux = "";
        for (int i = 0; i < mat.getFilas(); i++) {
            aux+= "*  ";
            for (int j = 0; j < mat.getColumnas(); j++) {
                aux += mat.getValor(i, j) + "  *  ";
            }
            aux += "\n ***********************************\n";
        }
        System.out.println(aux);
        return aux;
    }

    /**
     * @return the filas
     */
    public int getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }

    /**
     * @return the columnas
     */
    public int getColumnas() {
        return columnas;
    }

    /**
     * @param columnas the columnas to set
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public T getValor(int i, int j) {
        return matriz[i][j];
    }
}
