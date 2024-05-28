package sistemaAutogestion;

import dominio.Aerolinea;
import dominio.Avion;
import dominio.Cliente;
import dominio.Pasaje;
import dominio.Vuelo;
import tads.ListaSimple;
import tads.Nodo;
import tads.Pila;

public class Sistema implements IObligatorio {

    private ListaSimple<Aerolinea> aerolineas;
    private ListaSimple<Cliente> clientes;
    private ListaSimple<Vuelo> vuelos;

    public Sistema() {
        this.clientes = new ListaSimple<>();
        this.aerolineas = new ListaSimple<>();
        this.vuelos = new ListaSimple<>();
    }

    @Override
    public Retorno crearSistemaDeGestion() {
        if (aerolineas == null || clientes == null || vuelos == null) {
            return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        } else {
            aerolineas = new ListaSimple<>();
            clientes = new ListaSimple<>();
            vuelos = new ListaSimple<>();
            return new Retorno(Retorno.Resultado.OK);
        }
    }

    @Override
    public Retorno crearAerolinea(String nombre, String pais, int cantMaxAviones) {
        if (cantMaxAviones <= 0) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        Aerolinea aerolinea = new Aerolinea(nombre, pais, cantMaxAviones);
        Nodo<Aerolinea> nodoExistente = aerolineas.obtenerElemento(aerolinea);
        if (nodoExistente != null && nodoExistente.getDato().getNombre().equals(nombre)) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        aerolineas.agregarOrd(aerolinea);
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno eliminarAerolinea(String nombre) {
        Nodo<Aerolinea> auxAerolinea = aerolineas.obtenerElemento(new Aerolinea(nombre, "", 0));
        if (auxAerolinea == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        if (!auxAerolinea.getDato().getAviones().esVacia()) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        aerolineas.borrarElemento(auxAerolinea.getDato());
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno registrarAvion(String codigo, int capacidadMax, String nomAerolinea) {
        Nodo<Aerolinea> nodoAerolinea = aerolineas.obtenerElemento(new Aerolinea(nomAerolinea, "", 0));
        if (nodoAerolinea == null) {
            return new Retorno(Retorno.Resultado.ERROR_3);
        }

        if (capacidadMax < 9 || capacidadMax % 3 != 0) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }

        Nodo<Avion> nodoAvion = nodoAerolinea.getDato().getAviones().obtenerElemento(new Avion(codigo, capacidadMax, nodoAerolinea.getDato()));
        if (nodoAvion != null) {
            if (nodoAvion.getDato().getCodigo().equals(codigo)) {
                return new Retorno(Retorno.Resultado.ERROR_1);
            } else {
                nodoAvion.getDato().setNomAerolinea(nodoAerolinea.getDato());
                return new Retorno(Retorno.Resultado.OK);
            }
        } else {
            Avion nuevoAvion = new Avion(codigo, capacidadMax, nodoAerolinea.getDato()); // Aquí se pasa nodoAerolinea.getDato() como argumento
            nodoAerolinea.getDato().getAviones().agregarInicio(nuevoAvion);
            return new Retorno(Retorno.Resultado.OK);
        }
    }

    @Override
    public Retorno eliminarAvion(String nomAerolinea, String codAvion) {
        Nodo<Aerolinea> nodoAerolinea = aerolineas.obtenerElemento(new Aerolinea(nomAerolinea, "", 0));

        if (nodoAerolinea == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Nodo<Avion> auxAvion = nodoAerolinea.getDato().getAviones().obtenerElemento(new Avion(codAvion, 0, nodoAerolinea.getDato()));
        if (auxAvion == null) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        nodoAerolinea.getDato().getAviones().borrarElemento(auxAvion.getDato());
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno registrarCliente(String pasaporte, String nombre, int edad) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno crearVuelo(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia, int mes, int año, int cantPasajesEcon, int cantPasajesPClase) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno comprarPasaje(String pasaporteCliente, String codigoVuelo, int categoríaPasaje) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno devolverPasaje(String pasaporteCliente, String codigoVuelo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarAerolineas() {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = aerolineas.mostrarREC();
        return r;
    }

    @Override
    public Retorno listarAvionesDeAerolinea(String nombre) {

        Retorno r = new Retorno(Retorno.Resultado.OK);

        if (nombre == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        if (aerolineas.esVacia()) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Nodo<Aerolinea> nodoAerolinea = aerolineas.obtenerElemento(new Aerolinea(nombre, "", 0));
        r.valorString = nodoAerolinea.getDato().getAviones().mostrarREC();
        return r;
    }

    @Override
    public Retorno listarClientes() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarVuelos() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno vuelosDeCliente(String pasaporte) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno pasajesDevueltos(String nombreAerolinea) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno vistaDeVuelo(String codigoVuelo) {
        return Retorno.noImplementada();
    }

}
