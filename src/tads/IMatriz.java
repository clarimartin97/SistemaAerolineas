
package tads;

public interface IMatriz<T> {

    public void agregarValor(T valor);

    public boolean contiene(T valor);

    public void eliminarValor(T valor);

    public String mostrarMatriz(Matriz<T> mat);

    public int getFilas();

    public void setFilas(int filas);

    public int getColumnas();

    public void setColumnas(int columnas);

    public T getValor(int i, int j);

}
