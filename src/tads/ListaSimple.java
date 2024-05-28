package tads;

public class ListaSimple<T extends Comparable<T>> implements IListaSimple<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int cantElementos;
    private int cantMax;

    public ListaSimple() {
        inicio = null;
        fin = null;
        cantElementos = 0;
        cantMax = Integer.MAX_VALUE;
    }

    public ListaSimple(int capMax) {
        inicio = null;
        fin = null;
        cantElementos = 0;
        cantMax = capMax;
    }

    @Override
    public boolean esVacia() {
        return getInicio() == null;
    }

    @Override
    public void agregarInicio(T n) {

        Nodo<T> nuevo = new Nodo(n);

        nuevo.setSiguiente(getInicio());
        inicio = nuevo;
    }

    @Override
    public void agregarFinal(T n) {

        if (esVacia()) {
            agregarInicio(n);
        } else {
            Nodo aux = getInicio();

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(new Nodo(n));
        }
    }

    @Override
    public void borrarInicio() {

        if (!esVacia()) {

            Nodo<T> aBorrar = getInicio();
            inicio = getInicio().getSiguiente();
            aBorrar.setSiguiente(null);
        }
    }

    @Override
    public void borrarFin() {

        if (!esVacia()) {

            if (getInicio().getSiguiente() == null) {
                borrarInicio();
            } else {
                Nodo<T> aux = getInicio();

                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }

                aux.setSiguiente(null);

            }
        }

    }

    @Override
    public void vaciar() {
        inicio = null;
    }

    @Override
    public void mostrar() {
        Nodo<T> aux = getInicio();

        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    @Override
    public boolean estaElemento(T n) {

        Nodo<T> aux = getInicio();
        boolean existe = false;

        while (aux != null && !existe) {
            if (aux.getDato().equals(n)) {
                existe = true;
            }
            aux = aux.getSiguiente();
        }
        return existe;

    }

    @Override
    public int cantElementos() {

        Nodo<T> aux = getInicio();
        int cant = 0;

        while (aux != null) {
            cant++;
            aux = aux.getSiguiente();
        }
        return cant;

    }

    @Override
    public Nodo<T> obtenerElemento(T n) {
        Nodo<T> nodo = null;
        Nodo<T> aux = getInicio();
        while (aux != null && nodo == null) {
            if (aux.getDato().equals(n)) {
                nodo = aux;
            }
            aux = aux.getSiguiente();
        }
        return nodo;
    }

    @Override
    public void borrarElemento(T n) {

        if (!esVacia()) {

            if (getInicio().getDato() == n) {
                borrarInicio();
            } else {

                Nodo<T> aux = getInicio();

                while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != n) {
                    aux = aux.getSiguiente();
                }

                if (aux.getSiguiente() != null) {

                    Nodo<T> aBorrar = aux.getSiguiente();
                    aux.setSiguiente(aBorrar.getSiguiente());
                    aBorrar.setSiguiente(null);
                }

            }
        }
    }

    @Override
    public String mostrarREC(Nodo nodoAux) {
        String aux = "";
        while (nodoAux != null) {
            aux += nodoAux.getDato().toString();
            if (nodoAux.getSiguiente() != null) {
                aux += "|";
                aux += "\n";
            } else {
                aux += "|";
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return aux;
    }

    public String mostrarREC() {
        return mostrarREC(inicio);
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void agregarOrd(T n) {
        if (this.cantElementos < this.cantMax) {
            if (this.esVacia() || this.inicio.getDato().compareTo(n) >= 0) {
                this.agregarInicio(n);
                return;
            }
            Nodo<T> aux = this.inicio;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().compareTo(n) < 0) {
                aux = aux.getSiguiente();
            }
            Nodo<T> nuevoNodo = new Nodo<>(n);
            nuevoNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevoNodo);
            this.cantElementos++;
        }
    }

    public Nodo<T> getFin() {
        return fin;
    }
}
