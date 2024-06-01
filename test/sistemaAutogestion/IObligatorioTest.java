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
//    @Test
//    public void testCrearAerolineaOK() {
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Singapore Airlines", "Singapur", 12);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testCrearAerolineaERROR1() {
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Qantas", "Australia", 23);
//        assertEquals(Retorno.error1().resultado, r.resultado);
//        r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testCrearAerolineaERROR2() {
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 0);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Qantas", "Australia", -3);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//    }
//
//    public void testCrearAerolineaERRORV2() {
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 1);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Qantas", "Australia", 1);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//    }
//
//    @Test
//    public void testEliminarAerolineaOK() {
//        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Air New Zealand", "Nueva Zelanda", 35);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAerolinea("Qatar Airways");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testEliminarAerolineaERROR1() {
//        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAerolinea("TAM Airlines");
//        assertEquals(Retorno.error1().resultado, r.resultado);
//    }
//////////////error
//
//    @Test
//    public void testEliminarAerolineaERROR2() {
//        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAerolinea("Qatar Airways");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarAvion("QA345", 9, "Turkish Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAerolinea("Turkish Airlines");
//        assertEquals(Retorno.error2().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarAvionOK() {
//        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 7);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 23);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("QF345", 15, "Qantas");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarAvionERROR1() {
//        Retorno r = miSistema.crearAerolinea("American C", "Costa Rica", 6);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("LATAM", "Suecia", 2);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Paises Bajos Airlines", "Paises Bajos", 13);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarAvion("AA345", 33, "Paises Bajos Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("AA700", 90, "Paises Bajos Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("AA345", 21, "Paises Bajos Airlines");
//        assertEquals(Retorno.error1().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarAvionERROR2() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 3, "Ethiopian Airlines");
//        assertEquals(Retorno.error2().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 14, "Ethiopian Airlines");
//        assertEquals(Retorno.error2().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarAvionERROR3() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 20, "Air Canada");
//        assertEquals(Retorno.error3().resultado, r.resultado);
//    }
//
//    @Test
//    public void testEliminarAvionOK() {
//        Retorno r = miSistema.crearAerolinea("Bali Airlines", "India", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thurin", "Ushuaia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 21, "Thurin");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("TG800", 33, "Bali Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAvion("Bali Airlines", "TG800");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testEliminarAvionERROR1() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 24, "Ethiopian Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("TG800", 27, "Thai Airways");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAvion("Gol Brasil", "ET345");
//        assertEquals(Retorno.error1().resultado, r.resultado);
//    }
//
//    @Test
//    public void testEliminarAvionERROR2() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 33, "Ethiopian Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("TG800", 39, "Thai Airways");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.eliminarAvion("Ethiopian Airlines", "YY111");
//        assertEquals(Retorno.error2().resultado, r.resultado);
//
//    }
//
//    @Test
//    public void testListarAerolineas() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Cathay Pacific", "Hong Kong", 35);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Qantas", "Australia", 40);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.listarAerolineas();
//        assertEquals("Cathay Pacific-Hong Kong-35|\nEthiopian Airlines-Etiopía-15|\nQantas-Australia-40|\nThai Airways-Tailandia-25|", r.valorString);
//    }
//
//    @Test
//    public void testListarAerolineasVacio() {
//        Retorno r = miSistema.listarAerolineas();
//        assertEquals("", r.valorString);
//    }
//
//    @Test
//    public void testListarAvionesDeAerolinea() {
//        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET345", 15, "Ethiopian Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("ET311", 24, "Ethiopian Airlines");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.registrarAvion("TG563", 45, "Thai Airways");
//        assertEquals(Retorno.ok().resultado, r.resultado);
//        r = miSistema.listarAvionesDeAerolinea("Ethiopian Airlines");
//        assertEquals("ET311-24|\nET345-15|", r.valorString);
//
//    }
//
//    @Test
//    public void testListarAvionesDeAerolineaVacia() {
//        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.listarAvionesDeAerolinea("Aerolineas Argentinas");
//        assertEquals("", r.valorString);
//    }
// @Test
//    public void testRegistrarClienteOK() {
//        Retorno r = miSistema.crearSistemaDeGestion();
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarCliente("ABC1234", "Juan Perez", 30);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarCliente("DEF5678", "Maria Gomez", 25);
//        assertEquals(Retorno.ok().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarClienteERROR1() {
//        Retorno r = miSistema.crearSistemaDeGestion();
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarCliente("GHI9012", "Carlos Lopez", -5);
//        assertEquals(Retorno.error1().resultado, r.resultado);
//    }
//
//    @Test
//    public void testRegistrarClienteERROR2() {
//        Retorno r = miSistema.crearSistemaDeGestion();
//        assertEquals(Retorno.ok().resultado, r.resultado);
//
//        r = miSistema.registrarCliente("JKL345", "Ana Fernandez", 20);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//
//        r = miSistema.registrarCliente("MNOPQRS1", "Pedro Martinez", 40);
//        assertEquals(Retorno.error2().resultado, r.resultado);
//    }

    @Test
    public void testRegistrarClienteERROR3() {
        Retorno r = miSistema.crearSistemaDeGestion();
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("TUV6789", "Laura Ortiz", 35);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("TUV6789", "Sofia Gonzalez", 28);
        assertEquals(Retorno.error3().resultado, r.resultado);
    }
}
