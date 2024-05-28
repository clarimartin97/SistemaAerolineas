/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tads;

/**
 *
 * @author Clara
 * @param <T>
 */
public interface ICola<T extends Comparable<T>> {

public void encolar(T n);
public void desencolar();
public Nodo<T> frente();

}
