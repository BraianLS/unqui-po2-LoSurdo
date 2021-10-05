package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaServiciosTest {

	private FacturaServicios luz;
	private FacturaServicios gas;

	@BeforeEach
	void setUp() throws Exception {
		luz = new FacturaServicios(8,15000);
		gas = new FacturaServicios(120,2000);
	}
	
	@Test
	void cajaMontoTotalTest() {
		
		assertEquals(120000,luz.getPrecioBase()); 
		assertEquals(240000,gas.getPrecioBase());
	}

}
