package dominio;

public class Pasaje implements Comparable<Pasaje> {

    private Cliente cliente;
    private Vuelo vuelo;
    private int categoriaPasaje;
    private String estado;

    public Pasaje(Cliente cliente, Vuelo codigoVuelo, int categoriaPasaje, String estado) {
        this.cliente = cliente;
        this.vuelo = vuelo;
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
        return this.cliente.getPasaporte() + "-" + this.getVuelo();

    }


    @Override
    public int compareTo(Pasaje o) {
        return this.getCliente().compareTo(o.getCliente());
    }

   
}
