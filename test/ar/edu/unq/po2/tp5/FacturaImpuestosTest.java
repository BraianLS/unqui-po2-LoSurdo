package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaImpuestosTest {

	private FacturaImpuestos arba;
	private FacturaImpuestos infraccionNoVotar;

	@BeforeEach
	void setUp() throws Exception {
		arba = new FacturaImpuestos(8700);
		infraccionNoVotar = new FacturaImpuestos(50);
	}
	
	@Test
	void cajaMontoTotalTest() {
		
		assertEquals(8700,arba.getPrecioBase());
		assertEquals(50,infraccionNoVotar.getPrecioBase());
	}

}
