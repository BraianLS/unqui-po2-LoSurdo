package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoCooperativaTest{

	private ProductoCooperativa arroz;
	private ProductoCooperativa detergente;
	private ProductoCooperativa mayoliva;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoCooperativa("Arroz", 18.9d,4,10);
		detergente = new ProductoCooperativa("Detergente Cooperativo", 75d,15,15);
		mayoliva = new ProductoCooperativa("Mayonesa Oliva Cooperativo",60d,20,20);
	}

	@Test
	void descuentoProductosTest() {
		assertEquals(17.01, arroz.getPrecioBase(),0.00000000000001); //probando el funcionamiento de los margenes de error
		assertEquals(63,75, detergente.getPrecioBase());
		assertEquals(48, mayoliva.getPrecioBase());
	}

}
