package sistemaAutogestion;

import dominio.Aerolinea;
import dominio.Avion;
import dominio.Cliente;
import dominio.Pasaje;
import dominio.Vuelo;
import tads.ListaSimple;
import tads.Nodo;
import tads.Matriz;

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

        Nodo<Avion> nodoAvion = nodoAerolinea.getDato().getAviones()
                .obtenerElemento(new Avion(codigo, capacidadMax, nodoAerolinea.getDato()));
        if (nodoAvion != null) {
            if (nodoAvion.getDato().getCodigo().equals(codigo)) {
                return new Retorno(Retorno.Resultado.ERROR_1);
            } else {
                nodoAvion.getDato().setNomAerolinea(nodoAerolinea.getDato());
                return new Retorno(Retorno.Resultado.OK);
            }
        } else {
            Avion nuevoAvion = new Avion(codigo, capacidadMax, nodoAerolinea.getDato());
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
        Nodo<Avion> auxAvion = nodoAerolinea.getDato().getAviones()
                .obtenerElemento(new Avion(codAvion, 0, nodoAerolinea.getDato()));
        if (auxAvion == null) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        nodoAerolinea.getDato().getAviones().borrarElemento(auxAvion.getDato());
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno registrarCliente(String pasaporte, String nombre, int edad) {
        if (edad <= 0) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        if (pasaporte == null || pasaporte.length() != 7) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        Cliente cliente = new Cliente(pasaporte, nombre, edad);
        Nodo<Cliente> nodoExistente = clientes.obtenerElemento(cliente);
        if (nodoExistente != null) {
            return new Retorno(Retorno.Resultado.ERROR_3);
        }
        clientes.agregarInicio(cliente);
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno crearVuelo(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia,
            int mes, int anio, int cantPasajesEcon, int cantPasajesPClase) {

        Nodo<Aerolinea> nodoAerolinea = aerolineas.obtenerElemento(new Aerolinea(aerolinea, "", 0));
        if (nodoAerolinea == null) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }

        Nodo<Avion> nodoAvion = nodoAerolinea.getDato().getAviones()
                .obtenerElemento(new Avion(codAvion, 0, nodoAerolinea.getDato()));

        if (nodoAvion == null) {
            return new Retorno(Retorno.Resultado.ERROR_3);
        }

        if (vuelos.obtenerElemento(new Vuelo(codigoVuelo, nodoAerolinea.getDato(), nodoAvion.getDato(), paisDestino,
                dia, mes, anio, cantPasajesEcon, cantPasajesPClase)) != null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }

        Nodo<Vuelo> auxVuelo = vuelos.getInicio();
        while (auxVuelo != null) {
            Vuelo vuelo = auxVuelo.getDato();
            if (vuelo.getAvion().equals(nodoAvion.getDato()) && vuelo.getDia() == dia
                    && vuelo.getMes() == mes
                    && vuelo.getAnio() == anio) {
                return new Retorno(Retorno.Resultado.ERROR_4);
            }
            auxVuelo = auxVuelo.getSiguiente();
        }

        if (cantPasajesEcon < 3 || cantPasajesEcon % 3 != 0 || cantPasajesPClase < 3
                || cantPasajesPClase % 3 != 0) {
            return new Retorno(Retorno.Resultado.ERROR_5);
        }

        int capacidadAvion = nodoAvion.getDato().getCapacidadMax();
        if (cantPasajesEcon + cantPasajesPClase > capacidadAvion) {
            return new Retorno(Retorno.Resultado.ERROR_6);
        }

        int totalPasajes = cantPasajesEcon + cantPasajesPClase;
        if (totalPasajes < capacidadAvion) {
            cantPasajesEcon += capacidadAvion - totalPasajes;
        }

        Vuelo nuevoVuelo = new Vuelo(codigoVuelo, nodoAerolinea.getDato(),
                nodoAvion.getDato(), paisDestino, dia, mes,
                anio, cantPasajesEcon, cantPasajesPClase);
        nuevoVuelo.setCantPasajesEcon(cantPasajesEcon);
        nuevoVuelo.setCantPasajesPClase(cantPasajesPClase);
        vuelos.agregarFinal(nuevoVuelo);
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno comprarPasaje(String pasaporteCliente, String codigoVuelo, int categoríaPasaje) {

        Nodo<Cliente> nodoCliente = clientes.obtenerElemento(new Cliente(pasaporteCliente, "", 0));
        if (nodoCliente == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }

        Pasaje nuevoPasaje = new Pasaje(nodoCliente.getDato(), nodoVuelo.getDato(), categoríaPasaje, "CPR");

        if (categoríaPasaje == 2) {
            if (nodoVuelo.getDato().getNumeroCompradosPrim() < nodoVuelo.getDato().getCantPasajesPClase()) {
                nodoVuelo.getDato().getPasajesPrim().agregarInicio(nuevoPasaje);
                nodoVuelo.getDato().setNumeroCompradosPrim(nodoVuelo.getDato().getNumeroCompradosPrim() + 1);
                nodoCliente.getDato().getPasajesCompradosDevueltos().agregarInicio(nuevoPasaje);
            } else if (categoríaPasaje == 2) {

                nodoVuelo.getDato().getColaEsperaPrimera().encolar(nuevoPasaje);
            }
        } else {
            if (nodoVuelo.getDato().getNumeroCompradosEcon() < nodoVuelo.getDato().getCantPasajesEcon()) {
                nodoVuelo.getDato().getPasajesEcon().agregarInicio(nuevoPasaje);
                nodoVuelo.getDato().setNumeroCompradosEcon(nodoVuelo.getDato().getNumeroCompradosEcon() + 1);
                nodoCliente.getDato().getPasajesCompradosDevueltos().agregarInicio(nuevoPasaje);
            } else {

                nodoVuelo.getDato().getColaEsperaEconomica().encolar(nuevoPasaje);
            }
        }
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno devolverPasaje(String pasaporteCliente, String codigoVuelo) {
        Nodo<Cliente> nodoCliente = clientes.obtenerElemento(new Cliente(pasaporteCliente, "", 0));
        if (nodoCliente == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_2);
        }
        Nodo<Pasaje> nodoPasaje = nodoCliente.getDato().getPasajesCompradosDevueltos()
                .obtenerElemento(new Pasaje(nodoCliente.getDato(), nodoVuelo.getDato(), 0, ""));
        if (nodoPasaje == null) {
            return new Retorno(Retorno.Resultado.ERROR_3);
        }

        Pasaje nuevoPasaje = new Pasaje(nodoCliente.getDato(), nodoVuelo.getDato(),
                nodoPasaje.getDato().getCategoriaPasaje(), "DEV");

        nodoCliente.getDato().getPasajesCompradosDevueltos().agregarFinal(nuevoPasaje);
        nodoVuelo.getDato().getAerolinea().getPasajesDevueltos().agregarFinal(nodoPasaje.getDato());
        if (nodoPasaje.getDato().getCategoriaPasaje() == 2) {
            nodoVuelo.getDato().getPasajesPrim().borrarElemento(nodoPasaje.getDato());
            nodoVuelo.getDato().setNumeroCompradosPrim(nodoVuelo.getDato().getNumeroCompradosPrim() - 1);
            if (!nodoVuelo.getDato().getColaEsperaPrimera().esVacia()) {
                Pasaje nuevaCompra = nodoVuelo.getDato().getColaEsperaPrimera().frente();
                nodoVuelo.getDato().getColaEsperaPrimera().desencolar();
                comprarPasaje(nuevaCompra.getCliente().getPasaporte(), nuevaCompra.getVuelo().getCodigoVuelo(),
                        nuevaCompra.getCategoriaPasaje());
            }
        } else {
            nodoVuelo.getDato().getPasajesEcon().borrarElemento(nodoPasaje.getDato());
            nodoVuelo.getDato().setNumeroCompradosEcon(nodoVuelo.getDato().getNumeroCompradosEcon() - 1);
            if (!nodoVuelo.getDato().getColaEsperaEconomica().esVacia()) {
                Pasaje nuevaCompra = nodoVuelo.getDato().getColaEsperaEconomica().frente();
                nodoVuelo.getDato().getColaEsperaEconomica().desencolar();
                comprarPasaje(nuevaCompra.getCliente().getPasaporte(), nuevaCompra.getVuelo().getCodigoVuelo(),
                        nuevaCompra.getCategoriaPasaje());
            }
        }
        return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno listarAerolineas() {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = aerolineas.mostrar();
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
        r.valorString = nodoAerolinea.getDato().getAviones().mostrar();
        return r;
    }

    @Override
    public Retorno listarClientes() {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = clientes.mostrarREC();
        return r;
    }

    @Override
    public Retorno listarVuelos() {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = vuelos.mostrar();
        return r;
    }

    @Override
    public Retorno vuelosDeCliente(String pasaporte) {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        Nodo<Cliente> nodoCliente = clientes.obtenerElemento(new Cliente(pasaporte, "", 0));
        if (nodoCliente == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        String resultado = listarVuelosClienteRec(nodoCliente.getDato().getPasajesCompradosDevueltos().getInicio());
        if (resultado.length() > 2) {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        r.valorString = resultado;
        return r;
    }

    @Override
    public String listarVuelosClienteRec(Nodo<Pasaje> pasajeAux) {
        if (pasajeAux == null) {
            return "";
        }
        return pasajeAux.getDato().getVuelo().getCodigoVuelo() + "-" + pasajeAux.getDato().getEstado() + "|" + "\n"
                + listarVuelosClienteRec(pasajeAux.getSiguiente());
    }

    @Override
    public Retorno pasajesDevueltos(String nombreAerolinea) {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        Nodo<Aerolinea> nodoAerolinea = aerolineas.obtenerElemento(new Aerolinea(nombreAerolinea, "", 0));

        if (nodoAerolinea.getDato() == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }

        r.valorString = nodoAerolinea.getDato().getPasajesDevueltos().mostrar();
        return r;
    }

    @Override
    public Retorno vistaDeVuelo(String codigoVuelo) {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));

        Matriz matrizPrim = new Matriz(nodoVuelo.getDato().getCantPasajesPClase() / 3, 3);
        Matriz matrizEcon = new Matriz(nodoVuelo.getDato().getCantPasajesEcon() / 3, 3);

        Nodo<Pasaje> nodoPasajePrim = nodoVuelo.getDato().getPasajesPrim().getInicio();
        while (nodoPasajePrim != null) {
            matrizPrim.agregarValor(nodoPasajePrim.getDato().getCliente().getPasaporte());
            nodoPasajePrim = nodoPasajePrim.getSiguiente();
        }

        Nodo<Pasaje> nodoPasajeEcon = nodoVuelo.getDato().getPasajesEcon().getInicio();
        while (nodoPasajeEcon != null) {
            matrizEcon.agregarValor(nodoPasajeEcon.getDato().getCliente().getPasaporte());
            nodoPasajeEcon = nodoPasajeEcon.getSiguiente();
        }
        r.valorString = "\n  ***********************************\n           *** PRIMERA ***         \n"
                + matrizPrim.mostrarMatriz(matrizPrim)
                + "\n           *** Economica ***         \n" + matrizEcon.mostrarMatriz(matrizEcon);
        System.out.print(r.valorString);
        return r;
    }

    @Override
    public Retorno pasajesPrimera(String codigoVuelo) {
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = nodoVuelo.getDato().getPasajesPrim().mostrar();
        return r;
    }

    @Override
    public Retorno pasajesEcon(String codigoVuelo) {
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = nodoVuelo.getDato().getPasajesEcon().mostrar();
        return r;
    }

    @Override
    public Retorno colaPrimera(String codigoVuelo) {
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);

        }
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = nodoVuelo.getDato().getColaEsperaPrimera().mostrarCola();
        return r;
    }

    @Override
    public Retorno colaEcon(String codigoVuelo) {
        Nodo<Vuelo> nodoVuelo = vuelos.obtenerElemento(new Vuelo(codigoVuelo, null, null, "", 0, 0, 0, 0, 0));
        if (nodoVuelo == null) {
            return new Retorno(Retorno.Resultado.ERROR_1);
        }
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorString = nodoVuelo.getDato().getColaEsperaEconomica().mostrarCola();
        return r;
    }

}
