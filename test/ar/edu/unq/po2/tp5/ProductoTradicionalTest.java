package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTradicionalTest {
	
	private ProductoTradicional detergente;
	private ProductoTradicional mayoliva;

	@BeforeEach
	void setUp() throws Exception {
		detergente = new ProductoTradicional("Detergente", 75d,15);
		mayoliva = new ProductoTradicional("Mayonesa Oliva",60d,20);
	}

	@Test
	void preciosProductosTest() {
		assertEquals(75, detergente.getPrecioBase());
		assertEquals(60, mayoliva.getPrecioBase());
	}
	@Test
	void stockActualizadoTest() {
		assertEquals(15, detergente.getStock());
		detergente.actualizarSituacion();
		assertEquals(14, detergente.getStock());
	}
}
