package dominio;

import tads.Cola;
import tads.ListaSimple;

public class Vuelo implements Comparable<Vuelo> {

    private String codigoVuelo;
    private Aerolinea aerolinea;
    private Avion codAvion;
    private String paisDestino;
    private int dia;
    private int mes;
    private int anio;
    private int cantPasajesEcon;
    private int cantPasajesPClase;
    private ListaSimple<Pasaje> pasajesComprados;
    private Cola<Pasaje> colaEsperaPrimera;
    private Cola<Pasaje> colaEsperaEconomica;

    public Vuelo(String _codigoVuelo, Aerolinea _aerolinea, Avion _codAvion, String _paisDestino,
            int _dia, int _mes, int _anio, int _cantPasajesEcon, int _cantPasajesPClase) {
        this.setCodigoVuelo(_codigoVuelo);
        this.setAerolinea(_aerolinea);
        this.setCodAvion(_codAvion);
        this.setPaisDestino(_paisDestino);
        this.setDia(_dia);
        this.setMes(_mes);
        this.setAnio(_anio);
        this.setCantPasajesEcon(_cantPasajesEcon);
        this.setCantPasajesPClase(_cantPasajesPClase);
        this.pasajesComprados = new ListaSimple<>();
        this.colaEsperaPrimera = new Cola<>();
        this.colaEsperaEconomica = new Cola<>();

    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    /**
     * @return the aerolinea
     */
    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    /**
     * @param aerolinea the aerolinea to set
     */
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    /**
     * @return the codAvion
     */
    public Avion getCodAvion() {
        return codAvion;
    }

    /**
     * @param codAvion the codAvion to set
     */
    public void setCodAvion(Avion codAvion) {
        this.codAvion = codAvion;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantPasajesEcon() {
        return cantPasajesEcon;
    }

    public void setCantPasajesEcon(int cantPasajesEcon) {
        this.cantPasajesEcon = cantPasajesEcon;
    }

    public int getCantPasajesPClase() {
        return cantPasajesPClase;
    }

    public void setCantPasajesPClase(int cantPasajesPClase) {
        this.cantPasajesPClase = cantPasajesPClase;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.getCodAvion().compareTo(o.getCodAvion());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vuelo vuelo = (Vuelo) obj;
        return codAvion.equals(vuelo.codAvion);
    }
}
