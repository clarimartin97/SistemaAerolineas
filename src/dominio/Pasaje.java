package dominio;

public class Pasaje implements Comparable<Pasaje> {

    private Cliente cliente;
    private Vuelo vuelo;
    private int categoriaPasaje;
    private String estado;

    public Pasaje(Cliente cliente, Vuelo Vuelo, int categoriaPasaje, String estado) {
        this.cliente = cliente;
        this.vuelo = Vuelo;
        this.categoriaPasaje = categoriaPasaje;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo Vuelo) {
        this.vuelo = Vuelo;
    }

    public int getCategoriaPasaje() {
        return categoriaPasaje;
    }

    public void setCategoriaPasaje(int categoriaPasaje) {
        this.categoriaPasaje = categoriaPasaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return this.cliente.getPasaporte() + "-" + this.vuelo.getCodigoVuelo() + "|";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pasaje pasaje = (Pasaje) o;
        return cliente.equals(pasaje.cliente);
    }

    @Override
    public int compareTo(Pasaje o) {
        return this.getCliente().compareTo(o.getCliente());
    }

}
