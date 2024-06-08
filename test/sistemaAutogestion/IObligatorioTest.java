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

    @Test
    public void testCrearAerolineaOK() {
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Singapore Airlines", "Singapur", 12);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testCrearAerolineaERROR1() {
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 55);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 99);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Qantas", "Australia", 23);
        assertEquals(Retorno.error1().resultado, r.resultado);
        r = miSistema.crearAerolinea("British Airways", "Reino Unido", 64);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testCrearAerolineaERROR2() {
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 0);
        assertEquals(Retorno.error2().resultado, r.resultado);
        r = miSistema.crearAerolinea("Qantas", "Australia", -3);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    public void testCrearAerolineaERRORV2() {
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 1);
        assertEquals(Retorno.error2().resultado, r.resultado);
        r = miSistema.crearAerolinea("Qantas", "Australia", 1);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    @Test
    public void testEliminarAerolineaOK() {
        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Air New Zealand", "Nueva Zelanda", 35);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAerolinea("Qatar Airways");
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testEliminarAerolineaERROR1() {
        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAerolinea("TAM Airlines");
        assertEquals(Retorno.error1().resultado, r.resultado);
    }
    //////////////////////////////////////////////////////////////////////////

    @Test
    public void testEliminarAerolineaERROR2() {
        Retorno r = miSistema.crearAerolinea("Qatar Airways", "Qatar", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Turkish Airlines", "Turquía", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAerolinea("Qatar Airways");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarAvion("QA345", 9, "Turkish Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAerolinea("Turkish Airlines");
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    @Test
    public void testRegistrarAvionOK() {
        Retorno r = miSistema.crearAerolinea("Qantas", "Australia", 7);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Emirates", "Emiratos Árabes Unidos", 23);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("QF345", 15, "Qantas");
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testRegistrarAvionERROR1() {
        Retorno r = miSistema.crearAerolinea("American C", "Costa Rica", 6);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("LATAM", "Suecia", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Paises Bajos Airlines", "Paises Bajos", 13);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarAvion("AA345", 33, "Paises Bajos Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("AA700", 90, "Paises Bajos Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("AA345", 21, "Paises Bajos Airlines");
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    @Test
    public void testRegistrarAvionERROR2() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 3, "Ethiopian Airlines");
        assertEquals(Retorno.error2().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 14, "Ethiopian Airlines");
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    @Test
    public void testRegistrarAvionERROR3() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 20, "Air Canada");
        assertEquals(Retorno.error3().resultado, r.resultado);
    }

    @Test
    public void testEliminarAvionOK() {
        Retorno r = miSistema.crearAerolinea("Bali Airlines", "India", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thurin", "Ushuaia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 21, "Thurin");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("TG800", 33, "Bali Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAvion("Bali Airlines", "TG800");
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    @Test
    public void testEliminarAvionERROR1() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 24, "Ethiopian Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("TG800", 27, "Thai Airways");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAvion("Gol Brasil", "ET345");
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    @Test
    public void testEliminarAvionERROR2() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 33, "Ethiopian Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("TG800", 39, "Thai Airways");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.eliminarAvion("Ethiopian Airlines", "YY111");
        assertEquals(Retorno.error2().resultado, r.resultado);

    }

    @Test
    public void testListarAerolineas() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Cathay Pacific", "Hong Kong", 35);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Qantas", "Australia", 40);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.listarAerolineas();
        assertEquals(
                "Cathay Pacific-Hong Kong-35|\nEthiopian Airlines-Etiopía-15|\nQantas-Australia-40|\nThai Airways-Tailandia-25|", r.valorString);
    }

    ///////////////////////////////////////////////////////////////// creado por nos
    @Test
    public void testListarAerolineasVacio() {
        Retorno r = miSistema.listarAerolineas();
        assertEquals("", r.valorString);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testListarAvionesDeAerolinea() {
        Retorno r = miSistema.crearAerolinea("Ethiopian Airlines", "Etiopía", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Thai Airways", "Tailandia", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET345", 15, "Ethiopian Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("ET311", 24, "Ethiopian Airlines");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("TG563", 45, "Thai Airways");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.listarAvionesDeAerolinea("Ethiopian Airlines");
        assertEquals("ET311-24|\nET345-15|", r.valorString);

    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testListarAvionesDeAerolineaVacia() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.listarAvionesDeAerolinea("Aerolineas Argentinas");
        assertEquals("", r.valorString);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testRegistrarClienteOK() {
        Retorno r = miSistema.crearSistemaDeGestion();
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("ABC1234", "Juan Perez", 30);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("DEF5678", "Maria Gomez", 25);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testRegistrarClienteERROR1() {
        Retorno r = miSistema.crearSistemaDeGestion();
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("GHI9012", "Carlos Lopez", -5);
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testRegistrarClienteERROR2() {
        Retorno r = miSistema.crearSistemaDeGestion();
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("JKL345", "Ana Fernandez", 20);
        assertEquals(Retorno.error2().resultado, r.resultado);

        r = miSistema.registrarCliente("MNOPQRS1", "Pedro Martinez", 40);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

//    ///////////////////////////////////////////////////////////////// creado por nos
    @Test
    public void testRegistrarClienteERROR3() {
        Retorno r = miSistema.crearSistemaDeGestion();
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("TUV6789", "Laura Ortiz", 35);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.registrarCliente("TUV6789", "Sofia Gonzalez", 28);
        assertEquals(Retorno.error3().resultado, r.resultado);
    }
//

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
        assertEquals("CB34555-Camila Barcos-54|\nAM11111-Alfonso Miguez-34|\nMF34111-Martina Fernandez-1|\n",
                r.valorString);
    }

    @Test
    public void testCrearVueloOK() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR1() {

        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR2() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Brasileras", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR3() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY200", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.error3().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR4() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY221", "Brasil", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.error4().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR5A() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 2);
        assertEquals(Retorno.error5().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR5B() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 5, 3);
        assertEquals(Retorno.error5().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testCrearVueloERROR6() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY300", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 12, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2341", "Aerolineas Argentinas", "FLY300", "Brasil", 1, 11, 2024, 6, 12);
        assertEquals(Retorno.error6().resultado, r.resultado);
    }

    @Test
    public void testListarVuelosOK() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 15, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
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
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testComprarPasajeERROR1() {
        Retorno r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testComprarPasajeERROR2() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1155", 1);
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testMostrarVistaVueloOK() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("ES99231", "Estela Silva", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CM27455", "Clara Martin", 15);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("GV99882", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("ES99231", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CM27455", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("GV99882", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("ES99231", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CM27455", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.vistaDeVuelo("AA1111");
        assertEquals("\n"
                + "  ***********************************\n"
                + "           *** PRIMERA ***         \n"
                + "*  CM27455  *  ES99231  *  GV99882  *  \n"
                + " ***********************************\n"
                + "\n"
                + "           *** Economica ***         \n"
                + "*  CM27455  *  ES99231  *  GV99882  *  \n"
                + " ***********************************\n"
                + "*  CB34555  *  VM32132  *  MF34111  *  \n"
                + " ***********************************\n", r.valorString);

    }

    @Test
    public void testDevolverPasajeOK() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("MF34111", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("CB34555", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testDevolverPasajeERROR1() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("MF34122", "AA1111");
        assertEquals(Retorno.error1().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testDevolverPasajeERROR2() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("MF34111", "AA2222");
        assertEquals(Retorno.error2().resultado, r.resultado);
    }

    /////////////////////////////////////////////////////////////////// creado por
    /////////////////////////////////////////////////////////////////// nos
    @Test
    public void testDevolverPasajeERROR3() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("MF34111", "AA1111");
        assertEquals(Retorno.error3().resultado, r.resultado);
    }

    @Test
    public void testListarVuelosDeClientesOK() {

        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA2222", "Aerolineas Argentinas", "FLY221", "Uruguay", 11, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA3333", "Aerolineas Argentinas", "FLY221", "Uruguay", 14, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA2222", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA3333", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("MF34111", "AA2222");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.vuelosDeCliente("MF34111");
        assertEquals("AA3333-CPR|\nAA2222-CPR|\nAA1111-CPR|\nAA2222-DEV|", r.valorString);

    }

    @Test
    public void testPasajesDevueltosOK() {
        Retorno r = miSistema.registrarCliente("MF34111", "Martina Fernandez", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("VM32132", "Veronida Miguez", 34);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("CB34555", "Camila Barcos", 54);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarCliente("GV99882", "Gerardo Vercias", 19);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearAerolinea("Aerolineas Argentinas", "Argentina", 10);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.registrarAvion("FLY221", 9, "Aerolineas Argentinas");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA1111", "Aerolineas Argentinas", "FLY221", "Uruguay", 10, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.crearVuelo("AA9999", "Aerolineas Argentinas", "FLY221", "Uruguay", 8, 12, 2024, 6, 3);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("VM32132", "AA1111", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("CB34555", "AA1111", 2);
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.comprarPasaje("MF34111", "AA9999", 1);
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.devolverPasaje("MF34111", "AA9999");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("VM32132", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);
        r = miSistema.devolverPasaje("CB34555", "AA1111");
        assertEquals(Retorno.ok().resultado, r.resultado);

        r = miSistema.pasajesDevueltos("Aerolineas Argentinas");
        assertEquals("MF34111-AA9999|\nVM32132-AA1111|\nCB34555-AA1111|", r.valorString);
    }

    @Test
    public void testVistaDeVueloOK() {

        /*
         * Esta prueba no es imprescindible validarla mediante pruebas unitarias,
         * pudiendo hacer una impresión de pantalla con la vista
         * del avión, tal como se muestra en la letra del obligatorio
         */
    }
}
