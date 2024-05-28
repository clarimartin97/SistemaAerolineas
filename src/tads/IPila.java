/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tads;

public interface IPila<T extends Comparable<T>> {

    public void push(T n);

    public void pop();

    public Nodo<T> top();
}
