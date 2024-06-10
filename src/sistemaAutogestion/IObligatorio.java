package sistemaAutogestion;

import dominio.Pasaje;
import tads.Nodo;

public interface IObligatorio {
    /*
     **************** REGISTROS **************************************
     */
    // Pre: Las listas de aerolineas, clientes y vuelos no deben ser null.
    // Post: Las listas de aerolineas, clientes y vuelos están correctamente
    // inicializadas y vacías. Retorna un objeto de tipo Retorno indicando el éxito
    // de la operación (OK).
    public Retorno crearSistemaDeGestion();

    // Pre: El nombre y país no deben ser null ni estar vacíos. La cantidad máxima
    // de aviones debe ser mayor a 0. La aerolínea no debe existir previamente en la
    // lista de aerolíneas.
    // Post: Si se cumplen las condiciones, se agrega la aerolínea a la lista de
    // aerolíneas y se retorna un objeto de tipo Retorno indicando el éxito de la
    // operación (OK). En caso contrario, retorna un objeto de tipo Retorno con el
    // error correspondiente.
    public Retorno crearAerolinea(String nombre, String pais, int cantMaxAviones);

    // Pre: La lista de aerolíneas no debe estar vacía. La aerolínea debe existir en
    // la lista de aerolíneas. La aerolínea no debe tener aviones registrados.
    // Post: Si se cumplen las condiciones, se elimina la aerolínea de la lista de
    // aerolíneas y se retorna un objeto de tipo Retorno indicando el éxito de la
    // operación (OK). En caso contrario, retorna un objeto de tipo Retorno con el
    // error correspondiente.
    public Retorno eliminarAerolinea(String nombre);

    // Pre: La aerolínea debe existir. La capacidad máxima debe ser mayor que 9 y
    // múltiplo de 3. No debe existir un avión con el mismo código en la aerolínea.
    // Post: Si se cumplen las condiciones, se registra el avión en la lista de
    // aviones de la aerolínea y se retorna un objeto de tipo Retorno indicando el
    // éxito de la operación (OK). En caso contrario, retorna un objeto de tipo
    // Retorno con el error correspondiente.
    public Retorno registrarAvion(String codigo, int capacidadMax, String nomAerolinea);

    // Pre: La aerolínea debe existir. El código del avión debe existir en la lista
    // de aviones de la aerolínea. El avión no debe tener vuelos con pasajes
    // vendidos.
    // Post: Si se cumplen las condiciones, se elimina el avión de la lista de
    // aviones de la aerolínea y se retorna un objeto de tipo Retorno indicando el
    // éxito de la operación (OK). En caso contrario, retorna un objeto de tipo
    // Retorno con el error correspondiente.
    public Retorno eliminarAvion(String nomAerolinea, String codAvion);

    // Pre: El pasaporte no debe ser null y debe tener 7 caracteres. El
    // nombre no debe ser null ni estar vacío. La edad debe ser mayor a 0. El
    // cliente no debe existir previamente en la lista de clientes.
    // Post: Si se cumplen las condiciones, se registra el cliente en la lista de
    // clientes y se retorna un objeto de tipo Retorno indicando el éxito de la
    // operación (OK). En caso contrario, retorna un objeto de tipo Retorno con el
    // error correspondiente.
    public Retorno registrarCliente(String pasaporte, String nombre, int edad);

    /*
     **************** GESTIÓN DE VUELOS Y PASAJES **************************************
     */
    // Pre: La aerolínea debe existir. El avión debe existir en la aerolínea y no
    // debe tener vuelos programados en la misma fecha. El código del vuelo no debe
    // existir previamente. La cantidad de pasajes económicos y de primera clase
    // debe ser mayor o igual a 3 y múltiplo de 3. La suma de pasajes económicos y
    // de primera clase no debe exceder la capacidad máxima del avión.
    // Post: Si se cumplen las condiciones, se crea el vuelo y se agrega a la lista
    // de vuelos y se retorna un objeto de tipo Retorno indicando el éxito de la
    // operación (OK). En caso contrario, retorna un objeto de tipo Retorno con el
    // error correspondiente.
    public Retorno crearVuelo(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia,
            int mes, int anio, int cantPasajesEcon, int cantPasajesPClase);

    // Pre: El cliente debe existir. El vuelo debe existir. La categoría del pasaje
    // debe ser válida (1 para clase económica, 2 para primera clasee). Deben quedar
    // pasajes
    // disponibles en la categoría solicitada.
    // Post: Si se cumplen las condiciones, se registra la compra del pasaje y se
    // actualizan las listas correspondientes del cliente y del vuelo. Retorna un
    // objeto de tipo Retorno indicando el éxito de la operación (OK). En caso
    // contrario, retorna un objeto de tipo Retorno con el error correspondiente.
    public Retorno comprarPasaje(String pasaporteCliente, String codigoVuelo, int categoriaPasaje);

    // Pre: El cliente debe existir. El vuelo debe existir. El cliente debe tener un
    // pasaje comprado en ese vuelo.
    // Post: Si se cumplen las condiciones, se registra la devolución del pasaje y
    // se actualizan las listas correspondientes del cliente y del vuelo. Retorna un
    // objeto de tipo Retorno indicando el éxito de la operación (OK). En caso
    // contrario, retorna un objeto de tipo Retorno con el error correspondiente.
    public Retorno devolverPasaje(String pasaporteCliente, String codigoVuelo);

    /*
     **************** REPORTES Y CONSULTAS **************************************
     */
    // Pre: La lista de aerolíneas no debe estar vacía.
    // Post: Retorna un objeto de tipo Retorno exitoso con la lista de aerolíneas.
    public Retorno listarAerolineas();

    // Pre: La aerolínea con el nombre especificado debe existir.
    // Post: Retorna un objeto de tipo Retorno OK con la lista de aviones de la
    // aerolínea especificada.
    public Retorno listarAvionesDeAerolinea(String nombre);

    // Pre: La lista de clientes no debe estar vacía.
    // Post: Retorna un objeto de tipo Retorno OK con la lista de clientes.
    public Retorno listarClientes();

    // Pre: La lista de vuelos no debe estar vacía.
    // Post: Retorna un objeto de tipo Retorno OK con la lista de vuelos.
    public Retorno listarVuelos();

    // Pre: El cliente con el pasaporte especificado debe existir.
    // Post: Retorna un objeto de tipo Retorno OK con la lista de vuelos del cliente
    // especificado.
    public Retorno vuelosDeCliente(String pasaporte);

    // Pre: La aerolínea con el nombre especificado debe existir.
    // Post: Retorna un objeto de tipo Retorno OK con la lista de pasajes devueltos
    // de la aerolínea especificada.
    public Retorno pasajesDevueltos(String nombreAerolinea);

    // Pre: El vuelo con el código especificado debe existir.
    // Post: Retorna un objeto de tipo Retorno OK con la vista del vuelo
    // especificado, mostrando las matrices de pasajes económicos y de primera
    // clase.
    public Retorno vistaDeVuelo(String codigoVuelo);

    // Metodos Auxiliares:
    public String listarVuelosClienteRec(Nodo<Pasaje> pasajeAux);

    public Retorno pasajesPrimera(String codigoVuelo);

    public Retorno pasajesEcon(String codigoVuelo);

    public Retorno colaPrimera(String codigoVuelo);

    public Retorno colaEcon(String codigoVuelo);
}
