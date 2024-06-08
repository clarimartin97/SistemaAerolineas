package sistemaAutogestion;

import dominio.Pasaje;
import tads.Nodo;

public interface IObligatorio {

    /*
    **************** REGISTROS **************************************
     */
    // Crear un sistema de gestión
    // Pre: Tener las listas correctas inicializadas y que no sean null
    // Post: Retorna un objeto de tipo Retorno indicando el exito de la operacion (OK) y con las listas correctas iniciadas
    public Retorno crearSistemaDeGestion();

    // Crear una aerolínea
    // Pre: Que la cantidad de aviones sea mayor a 0. 
    //Que no exista la aerolinea que estamos intentando crear
    // Post: Retorna un objeto de tipo Retorno indicando el éxito o fracaso de la operación y agrega la aerolinea creada a lista de aerolineas.
    public Retorno crearAerolinea(String nombre, String pais, int cantMaxAviones);

    // Eliminar una aerolínea
    // Pre: Que la aerolinea a eliminar exista en la lista de aerolineas
    //  Que la lista de aerolineas no este vacia
    // Post: Retorna un objeto de tipo Retorno indicando el éxito o fracaso de la operación y elimina la aerolinea enviada por parametros
    public Retorno eliminarAerolinea(String nombre);

    // Registrar un avión
    // Pre: Que la aerolinea exista
    //      Que la capacidad sea mayor que 9 y que sea multiplo de 3
    //      Que no exista un avion con el mimso codigo
    // Post: Retorna un objeto de tipo Retorno indicando el éxito o fracaso de la operación y registra el avion dentro de la lista de la aerolinea
    public Retorno registrarAvion(String codigo, int capacidadMax, String nomAerolinea);

    // Eliminar un avión
    // Pre: Que la aerolinea exista
    //      Que exista el código de avión dentro de la aerolínea
    //      Que no tenga viaje con pasajes vendidos
    // Post: Retorna un objeto de tipo Retorno indicando el éxito o fracaso de la operación y elimina el avion.
    public Retorno eliminarAvion(String nomAerolinea, String codAvion);

    // Registrar un cliente
    // Pre: 
    // Post: 
    public Retorno registrarCliente(String pasaporte, String nombre, int edad);

    /*
    **************** GESTIÓN DE VUELOS Y PASAJES **************************************
     */
    // Crear un vuelo
    // Pre: 
    // Post: 
    public Retorno crearVuelo(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia, int mes, int año, int cantPasajesEcon, int cantPasajesPClase);

    // Comprar un pasaje
    // Pre: 
    // Post: 
    public Retorno comprarPasaje(String pasaporteCliente, String codigoVuelo, int categoríaPasaje);

    // Devolver un pasaje
    // Pre: 
    // Post: 
    public Retorno devolverPasaje(String pasaporteCliente, String codigoVuelo);

    /*
    **************** REPORTES Y CONSULTAS **************************************
     */
    // Listar aerolíneas
    // Pre: Que la lista de aerolineas no este vacia
    // Post: Retorna un objeto de tipo Retorno exitoso con la lista de aerolíneas y se muestra la lista.
    public Retorno listarAerolineas();

    // Listar aviones de una aerolínea
    // Pre:  Que exista la aerolinea respectiva con dicho nombre
    // Post: Retorna un objeto de tipo Retorno OK con la lista de aviones de la aerolínea especificada
    public Retorno listarAvionesDeAerolinea(String nombre);

    // Listar clientes
    // Pre: 
    // Post:
    public Retorno listarClientes();

    // Listar vuelos
    // Pre: 
    // Post: 
    public Retorno listarVuelos();

    // Obtener los vuelos de un cliente
    // Pre: 
    // Post: 
    public Retorno vuelosDeCliente(String pasaporte);

    // Obtener los pasajes devueltos de una aerolínea
    // Pre: 
    // Post: 
    public Retorno pasajesDevueltos(String nombreAerolinea);

    // Obtener la vista de un vuelo
    // Pre: 
    // Post: 
    public Retorno vistaDeVuelo(String codigoVuelo);

    //Metodos Auxiliares:
    public String listarVuelosClienteRec(Nodo<Pasaje> pasajeAux);

    public Retorno pasajesPrimera(String codigoVuelo);

    public Retorno pasajesEcon(String codigoVuelo);

    public Retorno colaPrimera(String codigoVuelo);

    public Retorno colaEcon(String codigoVuelo);
}
