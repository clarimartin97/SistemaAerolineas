package dominio;

import tads.Cola;
import tads.ListaSimple;
import tads.Matriz;

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
    private Matriz<Pasaje> pasajesPrim;
    private int numeroCompradosPrim;
    private Matriz<Pasaje> pasajesEcon;
    private int numeroCompradosEcon;
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
        this.pasajesPrim = new Matriz<Pasaje>(cantPasajesPClase / 3,3);
        this.numeroCompradosPrim = 0;
        this.pasajesEcon = new Matriz<Pasaje>(cantPasajesEcon / 3,3);
        this.numeroCompradosEcon = 0;
        this.colaEsperaPrimera = new Cola<>();
        this.colaEsperaEconomica = new Cola<>();

    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Avion getCodAvion() {
        return codAvion;
    }

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

    public Cola<Pasaje> getColaEsperaPrimera() {
        return colaEsperaPrimera;
    }

    public void setColaEsperaPrimera(Cola<Pasaje> colaEsperaPrimera) {
        this.colaEsperaPrimera = colaEsperaPrimera;
    }

    public Cola<Pasaje> getColaEsperaEconomica() {
        return colaEsperaEconomica;
    }

    public void setColaEsperaEconomica(Cola<Pasaje> colaEsperaEconomica) {
        this.colaEsperaEconomica = colaEsperaEconomica;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.getCodAvion().compareTo(o.getCodAvion());
    }


    public int getNumeroCompradosPrim() {
        return numeroCompradosPrim;
    }

    public void setNumeroCompradosPrim(int numeroCompradosPrim) {
        this.numeroCompradosPrim = numeroCompradosPrim;
    }


    public int getNumeroCompradosEcon() {
        return numeroCompradosEcon;
    }

    public void setNumeroCompradosEcon(int numeroCompradosEcon) {
        this.numeroCompradosEcon = numeroCompradosEcon;
    }


    public Matriz<Pasaje> getPasajesPrim() {
        return pasajesPrim;
    }


    public void setPasajesPrim(Matriz<Pasaje> pasajesPrim) {
        this.pasajesPrim = pasajesPrim;
    }

    public Matriz<Pasaje> getPasajesEcon() {
        return pasajesEcon;
    }
    
    public void setPasajesEcon(Matriz<Pasaje> pasajesEcon) {
        this.pasajesEcon = pasajesEcon;
    }

}
