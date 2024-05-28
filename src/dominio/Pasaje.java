package dominio;

public class Pasaje implements Comparable<Pasaje> {

    private Cliente pasaporteCliente;
    private Vuelo codigoVuelo;
    private String categoriaPasaje;

    public Pasaje(Cliente pasaporteCliente, Vuelo codigoVuelo, String categoriaPasaje) {
        this.pasaporteCliente = pasaporteCliente;
        this.codigoVuelo = codigoVuelo;
        this.categoriaPasaje = categoriaPasaje;
    }

    /**
     * @return the pasaporteCliente
     */
    public Cliente getPasaporteCliente() {
        return pasaporteCliente;
    }

    /**
     * @param pasaporteCliente the pasaporteCliente to set
     */
    public void setPasaporteCliente(Cliente pasaporteCliente) {
        this.pasaporteCliente = pasaporteCliente;
    }

    /**
     * @return the codigoVuelo
     */
    public Vuelo getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * @param codigoVuelo the codigoVuelo to set
     */
    public void setCodigoVuelo(Vuelo codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getCategoriaPasaje() {
        return categoriaPasaje;
    }

    public void setCategoriaPasaje(String categoriaPasaje) {
        this.categoriaPasaje = categoriaPasaje;
    }

    @Override
    public int compareTo(Pasaje o) {
        return this.getCategoriaPasaje().compareTo(o.getCategoriaPasaje());
    }

}
