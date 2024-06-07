/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sistemaAutogestion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IObligatorioTest {

    private Sistema miSistema;

    public IObligatorioTest() {
    }

    @Before
    public void setUp() {
        miSistema = new Sistema();
    }
    //
    // @Test
    // public void testCrearAerolineaOK() {
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Singapore Airlines", "Singapur", 12);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearAerolineaERROR1() {
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Qantas", "Australia", 23);
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearAerolineaERROR2() {
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 0);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Qantas", "Australia", -3);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }
    //
    // public void testCrearAerolineaERRORV2() {
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 1);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Qantas", "Australia", 1);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testEliminarAerolineaOK() {
    // Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Air New Zealand", "Nueva Zelanda", 35);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAerolinea("Qatar Airways");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testEliminarAerolineaERROR1() {
    // Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAerolinea("TAM Airlines");
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    ////////////// error
    //
    // @Test
    // public void testEliminarAerolineaERROR2() {
    // Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAerolinea("Qatar Airways");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarAvion("QA345", 9, "Turkish Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAerolinea("Turkish Airlines");
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarAvionOK() {
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 7);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 23);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("QF345", 15, "Qantas");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarAvionERROR1() {
    // Retorno r = miSistema.crearAerolinea("American C", "Costa Rica", 6);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("LATAM", "Suecia", 2);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Paises Bajos Airlines", "Paises Bajos", 13);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarAvion("AA345", 33, "Paises Bajos Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("AA700", 90, "Paises Bajos Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("AA345", 21, "Paises Bajos Airlines");
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarAvionERROR2() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 3, "Ethiopian Airlines");
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 14, "Ethiopian Airlines");
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarAvionERROR3() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 20, "Air Canada");
    // assertEquals(Retorno.error3().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testEliminarAvionOK() {
    // Retorno r = miSistema.crearAerolinea("Bali Airlines", "India", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thurin", "Ushuaia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 21, "Thurin");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("TG800", 33, "Bali Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAvion("Bali Airlines", "TG800");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testEliminarAvionERROR1() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 24, "Ethiopian Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("TG800", 27, "Thai Airways");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAvion("Gol Brasil", "ET345");
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testEliminarAvionERROR2() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 33, "Ethiopian Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("TG800", 39, "Thai Airways");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.eliminarAvion("Ethiopian Airlines", "YY111");
    // assertEquals(Retorno.error2().resultado, r.resultado);
    //
    // }
    //
    // @Test
    // public void testListarAerolineas() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Cathay Pacific", "Hong Kong", 35);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Qantas", "Australia", 40);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.listarAerolineas();
    // assertEquals("Cathay Pacific-Hong Kong-35|\nEthiopian
    // Airlines-Etiopía-15|\nQantas-Australia-40|\nThai Airways-Tailandia-25|",
    // r.valorString);
    // }
    //
    // @Test
    // public void testListarAerolineasVacio() {
    // Retorno r = miSistema.listarAerolineas();
    // assertEquals("", r.valorString);
    // }
    //
    // @Test
    // public void testListarAvionesDeAerolinea() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 15, "Ethiopian Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET311", 24, "Ethiopian Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("TG563", 45, "Thai Airways");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.listarAvionesDeAerolinea("Ethiopian Airlines");
    // assertEquals("ET311-24|\nET345-15|", r.valorString);
    //
    // }
    //
    // @Test
    // public void testListarAvionesDeAerolineaVacia() {
    // Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina",
    // 10);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.listarAvionesDeAerolinea("Aerolineas Argentinas");
    // assertEquals("", r.valorString);
    // }
    // @Test
    // public void testRegistrarClienteOK() {
    // Retorno r = miSistema.crearSistemaDeGestion();
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("ABC1234", "Juan Perez", 30);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("DEF5678", "Maria Gomez", 25);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarClienteERROR1() {
    // Retorno r = miSistema.crearSistemaDeGestion();
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("GHI9012", "Carlos Lopez", -5);
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testRegistrarClienteERROR2() {
    // Retorno r = miSistema.crearSistemaDeGestion();
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("JKL345", "Ana Fernandez", 20);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("MNOPQRS1", "Pedro Martinez", 40);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }

    // @Test
    // public void testRegistrarClienteERROR3() {
    // Retorno r = miSistema.crearSistemaDeGestion();
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("Laura Ortiz", "TUV6789", 35);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("Sofia Gonzalez", "TUV6789", 28);
    // assertEquals(Retorno.error3().resultado, r.resultado);
    // }
    // @Test
    // public void testCrearVueloOK() {
    // Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 90);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("ET345", 90, "Ethiopian Airlines");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.crearVuelo("1111", "Ethiopian Airlines", "ET345", "Etiopía", 1,
    // 1, 2024, 24, 15);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    // @Test
    // public void testCrearVueloErrorCodigoVueloExistente() {
    //
    // Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 70);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // r = miSistema.registrarAvion("QF345", 150, "Qantas");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // // Se crea un vuelo con el mismo código de vuelo para generar el error
    // miSistema.crearVuelo("QF001", "Qantas", "QF123", "Australia", 2, 1, 2024, 21,
    // 3);
    // // Se intenta crear otro vuelo con el mismo código de vuelo
    // r = miSistema.crearVuelo("QF001", "Qantas", "QF345", "Australia", 2, 1, 2024,
    // 21, 3);
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    // @Test
    // public void testCrearVueloErrorAerolíneaNoExistente() {
    // Retorno r = miSistema.crearVuelo("EK123", "NoExistente", "EK001", "USA", 1,
    // 1, 2025, 297, 3);
    //
    // @Test
    // public void testComprarPasajeOK() {
    // Retorno r = miSistema.crearSistemaDeGestion();
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.crearAerolinea("Qantas", "Australia", 7);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarAvion("QF345", 15, "Qantas");
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.registrarCliente("ABC1234", "Juan Perez", 30);
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // // Asumiendo que el vuelo AA001 tiene capacidad suficiente para pasajes de
    // primera clase y económica
    // r = miSistema.comprarPasaje("ABC1234", "QF345", 1); // Comprar pasaje de
    // primera clase
    // assertEquals(Retorno.ok().resultado, r.resultado);
    //
    // r = miSistema.comprarPasaje("ABC1234", "QF345", 2); // Comprar pasaje de
    // clase económica
    // assertEquals(Retorno.ok().resultado, r.resultado);
    // }
    ////
    // @Test
    // public void testComprarPasajeERROR1() {
    // // Intentar comprar un pasaje para un cliente que no existe
    // Retorno r = miSistema.comprarPasaje("87654321", "AA001", 1);
    // assertEquals(Retorno.error1().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testComprarPasajeERROR2() {
    // // Intentar comprar un pasaje para un vuelo que no existe
    // Retorno r = miSistema.comprarPasaje("12345678", "AA999", 1);
    // assertEquals(Retorno.error2().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearVueloErrorAvionNoExistenteEnAerolínea() {
    // Retorno r = miSistema.crearVuelo("QF124", "Qantas", "EK001", "USA", 1, 1,
    // 2025, 297, 3);
    // assertEquals(Retorno.error3().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearVueloErrorVueloExistenteParaAvionEnFecha() {
    // miSistema.crearVuelo("QF125", "Qantas", "QF001", "USA", 1, 1, 2025, 297, 3);
    // Retorno r = miSistema.crearVuelo("QF126", "Qantas", "QF001", "Canada", 1, 1,
    // 2025, 297, 3);
    // assertEquals(Retorno.error4().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearVueloErrorCantidadesPasajesNoMultiploDeTres() {
    // Retorno r = miSistema.crearVuelo("QF127", "Qantas", "QF001", "USA", 1, 1,
    // 2025, 298, 2);
    // assertEquals(Retorno.error5().resultado, r.resultado);
    // }
    //
    // @Test
    // public void testCrearVueloErrorSumaPasajesExcedeCapacidadAvion() {
    // Retorno r = miSistema.crearVuelo("QF128", "Qantas", "QF001", "USA", 1, 1,
    // 2025, 298, 100);
    // assertEquals(Retorno.error5().resultado, r.resultado);
    // }
    // public void testComprarPasajeCategoria1Lleno() {
    // // Comprar todos los pasajes de primera clase (asumiendo 6 asientos
    // disponibles)
    // for (int i = 0; i < 6; i++) {
    // miSistema.comprarPasaje("12345678", "AA001", 1);
    // }
    // // Intentar comprar un pasaje de primera clase cuando ya están llenos
    // Retorno r = miSistema.comprarPasaje("12345678", "AA001", 1);
    // assertEquals(Retorno.ok().resultado, r.resultado); // Debe ir a la cola de
    // espera
    // }
    //
    // @Test
    // public void testComprarPasajeCategoria2Lleno() {
    // // Comprar todos los pasajes de clase económica (asumiendo 6 asientos
    // disponibles)
    // for (int i = 0; i < 6; i++) {
    // miSistema.comprarPasaje("12345678", "AA001", 2);
    // }
    // // Intentar comprar un pasaje de clase económica cuando ya están llenos
    // Retorno r = miSistema.comprarPasaje("12345678", "AA001", 2);
    // assertEquals(Retorno.ok().resultado, r.resultado); // Debe ir a la cola de
    // espera
    // }
    @Test
    public void testListarVuelos() {

        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 201);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 336);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarAvion("QF001", 150, "Qantas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("EK123", 300, "Emirates");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.crearVuelo("QF1234", "Qantas", "QF001", "Sydney", 1, 1, 2024, 66, 51);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("EK5678", "Emirates", "EK123", "Dubai", 2, 1, 2024, 69, 99);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.listarVuelos();
        assertEquals(Retorno.ok().resultado, r.resultado);
        assertEquals("QF1234-Qantas-QF001-Sydney-01/01/2024-66-51|\nEK5678-Emirates-EK123-Dubai-02/01/2024-69-99|", r.valorString);

    }
    @Test
    public void testPasajesDevueltos() {
        // Crear aerolíneas
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 201);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 336);
        assertEquals(Retorno.ok().resultado, r.resultado);

        // Registrar aviones
        r = miSistema.registrarAvion("QF001", 150, "Qantas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("EK123", 300, "Emirates");
        assertEquals(Retorno.ok().resultado, r.resultado);

        // Crear vuelos
        r = miSistema.crearVuelo("QF1234", "Qantas", "QF001", "Sydney", 1, 1, 2024, 66, 51);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("EK5678", "Emirates", "EK123", "Dubai", 2, 1, 2024, 69, 99);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("TUV6789","Laura Ortiz", 35);
        assertEquals(Retorno.ok().resultado, r.resultado);

        // Comprar y devolver pasajes
        r = miSistema.comprarPasaje("TUV6789", "QF1234", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("TUV6789", "QF1234");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.comprarPasaje("TUV6789", "EK5678", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);

        // Verificar pasajes devueltos
        r = miSistema.pasajesDevueltos("Qantas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        assertEquals("TUV6789-QF1234|", r.valorString);

        r = miSistema.vuelosDeCliente("TUV6789");
        assertEquals(Retorno.ok().resultado, r.resultado);
        assertEquals("EK5678-Dev|", r.valorString);
    }
     @Test
    public void testCrearClienteOK() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("AM11111", "Alfonso Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
             r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.error3().resultado, r.resultado);
    }

    @Test
    public void testListarClienteOK() {

        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("AM11111", "Alfonso Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.listarClientes();
        assertEquals("CB34555-Camila Barcos-54|\nAM11111-Alfonso Miguez-34|\nMF34111-Martina Fernandez-1|", r.valorString);
    }

    //Gestión de vuelos (No se incluyen en estas pruebas ERROR_1, ERRROR_2, ERROR_3, ERROR_4, ERROR_5, ERROR_6)
    @Test
    public void testCrearVueloOK() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR1() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error1().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR2() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Brasileras", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR3() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY200", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error3().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR4() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY221", "Brasil", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.error4().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR5A() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 2);
        assertEquals(Retorno.error5().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }
    
     @Test
    public void testCrearVueloERROR5B() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 5, 3);
        assertEquals(Retorno.error5().resultado, r.resultado);
    }
    
    @Test
    public void testCrearVueloERROR6() {
        //Creación de aerolineas
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 12);
        assertEquals(Retorno.error6().resultado, r.resultado);
    }
    

    @Test
    public void testListarVuelosOK() {
        //Creación de clientes
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aerolineas
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2222", "Aerolineas Argentinas", "FLY221", "Uruguay", 2, 10, 2024, 6, 9);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA3333", "Aerolineas Argentinas", "FLY221", "Uruguay", 5, 9, 2024, 3, 12);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.listarVuelos();
        assertEquals("AA1111-Aerolineas Argentinas-FLY221-0-0-15|\nAA2222-Aerolineas Argentinas-FLY221-0-0-15|\nAA3333-Aerolineas Argentinas-FLY221-0-0-15|", r.valorString);

        //Compra de pasajes
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA2222", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.listarVuelos();
        assertEquals("AA1111-Aerolineas Argentinas-FLY221-1-0-14|\nAA2222-Aerolineas Argentinas-FLY221-0-1-14|\nAA3333-Aerolineas Argentinas-FLY221-0-0-15|", r.valorString);
    }

    @Test
    public void testComprarPasajeOK() {
        //Creación de clientes
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aerolineas
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Compra de pasajes (hay disponible)
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);

    }

    @Test
    public void testDevolverPasajeOK() {
        //Creación de clientes
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aerolineas
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Compra de pasajes (hay disponible)
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Devolución de pasaje 
        r = miSistema.devolverPasaje("MF34111", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("CB34555", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testListarVuelosDeClientesOK() {

        //Creación de clientes
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aerolineas
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2222", "Aerolineas Argentinas", "FLY221", "Uruguay", 11, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA3333", "Aerolineas Argentinas", "FLY221", "Uruguay", 14, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);

        //Compra de pasajes (hay disponible)
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA2222", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA3333", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Devolución de pasaje (se deberían otorgar a los dos clientes que están esperando)
        r = miSistema.devolverPasaje("MF34111", "AA2222");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.vuelosDeCliente("MF34111");
        assertEquals("AA3333-CPR|\nAA2222-CPR|\nAA1111-CPR|\nAA2222-DEV|", r.valorString);

    }
    @Test
    public void testPasajesDevueltosOK() {

        //Creación de clientes
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aerolineas
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de aviones
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Creación de vuelos
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA9999", "Aerolineas Argentinas", "FLY221", "Uruguay", 8, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        //Compra de pasajes (hay disponible)
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA9999", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);

        //Devolución de pasaje
        r = miSistema.devolverPasaje("MF34111", "AA9999");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("VM32132", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("CB34555", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.pasajesDevueltos("Aerolineas Argentinas");
        assertEquals("MF34111-AA9999|\nVM32132-AA1111|\nCB34555-AA1111|", r.valorString);
    }
//
//    @Test
//    public void testVistaDeVueloOK() {
//
//        /* Esta prueba no es imprescindible validarla mediante pruebas unitarias, pudiendo hacer una impresión de pantalla con la vista
//        del avión, tal como se muestra en la letra del obligatorio */
//    }
}
