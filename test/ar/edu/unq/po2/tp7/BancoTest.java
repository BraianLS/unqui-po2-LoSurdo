package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco bancoPata;
	private Cliente cliente1;
	private Cliente cliente2;
	private PropiedadInmobiliaria propiedadDuplex;
	private PropiedadInmobiliaria propiedadCasa;

	@BeforeEach
	void setUp() throws Exception {
		bancoPata = new Banco();
		cliente1 = new Cliente("Javier","Rodriguez","Alberti 284",37,7000,bancoPata);
		cliente2 = new Cliente("Analia","Tenaglia","Calle Falsa 123",64,19000,bancoPata);
		propiedadDuplex = new PropiedadInmobiliaria("Un hermoso departamento","Castro Barros 100", 150000);
		propiedadCasa = new PropiedadInmobiliaria("Una hermosa casa","Calle Falsa 123", 120000);
	}

	@Test
	void agregarClienteTest() {
		bancoPata.agregarCliente(cliente1);
		bancoPata.agregarCliente(cliente2);
		ArrayList<Cliente> esperado = new ArrayList<Cliente>();
		esperado.add(cliente1);
		esperado.add(cliente2);
		assertEquals(esperado, bancoPata.getGestionClientes().getListaDeClientes());
		assertEquals(2, bancoPata.getGestionClientes().getListaDeClientes().size());
	}
	
	@Test
	void solicitarCreditoHipotecarioTest() {
		cliente1.solicitarCreditoHipotecario(1000, 3, propiedadDuplex);
		cliente2.solicitarCreditoHipotecario(2000, 14, propiedadCasa);
		assertEquals(2, bancoPata.getEvaluador().getSolicitudesDeCredito().size());

	}
	@Test
	void solicitarCreditoPersonalTest() {
		cliente1.solicitarCreditoPersonal(2000, 2);
		cliente2.solicitarCreditoPersonal(28000, 1);
		assertEquals(2, bancoPata.getEvaluador().getSolicitudesDeCredito().size());

	}
	@Test
	void solicitudesDeCreditosVariadas() {
		cliente1.solicitarCreditoPersonal(2000, 2);
		cliente2.solicitarCreditoPersonal(28000, 10);
		cliente1.solicitarCreditoHipotecario(1000, 3, propiedadDuplex);
		cliente2.solicitarCreditoHipotecario(2000, 14, propiedadCasa);
		assertEquals(4, bancoPata.getEvaluador().getSolicitudesDeCredito().size());

	}
	@Test
	void getMontoTotalADesembolsarTest() {
		cliente1.solicitarCreditoPersonal(2000, 20);
		cliente1.solicitarCreditoHipotecario(1000, 3, propiedadDuplex);
		cliente2.solicitarCreditoHipotecario(2000, 14, propiedadCasa);
		assertEquals(1000, bancoPata.getMontoTotalADesembolsar());

	}
}
