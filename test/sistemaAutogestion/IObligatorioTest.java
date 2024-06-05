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
//    @Test
//    public void testListarVuelos() {
//
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 201);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 336);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarAvion("QF001", 150, "Qantas");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("EK123", 300, "Emirates");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.crearVuelo("QF1234", "Qantas", "QF001", "Sydney", 1, 1, 2024, 66, 51);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearVuelo("EK5678", "Emirates", "EK123", "Dubai", 2, 1, 2024, 69, 99);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.listarVuelos();
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        assertEquals("QF1234-Qantas-QF001-Sydney-01/01/2024-66-51|\nEK5678-Emirates-EK123-Dubai-02/01/2024-69-99|", r.valorString);
//
//    }

}
