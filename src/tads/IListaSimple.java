package tads;

public interface IListaSimple<T extends Comparable<T>> {

    public boolean esVacia();

    public void agregarInicio(T n);

    public void agregarFinal(T n);

    public void borrarInicio();

    public void borrarFin();

    public void vaciar();

    public String mostrar();

    public void agregarOrd(T n);
    
    public void borrarElemento(T n);

    public int cantElementos();

    public Nodo<T> obtenerElemento(T n);

    public String mostrarREC(Nodo<T> l);

    public boolean estaElemento(T n);

    public Nodo<T> getFin();

}
