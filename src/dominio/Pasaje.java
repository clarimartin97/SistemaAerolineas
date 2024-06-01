package dominio;

public class Pasaje implements Comparable<Pasaje> {

    private Cliente cliente;
    private Vuelo codigoVuelo;
    private int categoriaPasaje;
    private String estado;

    public Pasaje(Cliente cliente, Vuelo codigoVuelo, int categoriaPasaje, String estado) {
        this.cliente = cliente;
        this.codigoVuelo = codigoVuelo;
        this.categoriaPasaje = categoriaPasaje;
        this.estado = estado;
    }

    public Cliente getPasaporteCliente() {
        return cliente;
    }

    public void setPasaporteCliente(Cliente pasaporteCliente) {
        this.cliente = pasaporteCliente;
    }

    public Vuelo getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(Vuelo codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
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


    @Override
    public int compareTo(Pasaje o) {
        return this.getPasaporteCliente().compareTo(o.getPasaporteCliente());
    }

   
}
