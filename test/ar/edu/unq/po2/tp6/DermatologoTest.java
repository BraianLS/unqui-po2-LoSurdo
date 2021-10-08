package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Dermatologo.ColorLesion;

class DermatologoTest {
	
	private Dermatologo dermatologo;
	@BeforeEach
	void setUp() throws Exception {
		dermatologo = new Dermatologo();
		dermatologo.armarPeligrosidad();
	}

	@Test
	void armarPeligrosidadTest() {
		assertEquals(4, dermatologo.getPeligrosidad(ColorLesion.ROJO));
		assertEquals(3, dermatologo.getPeligrosidad(ColorLesion.GRIS));
		assertEquals(2, dermatologo.getPeligrosidad(ColorLesion.AMARILLO));
		assertEquals(1, dermatologo.getPeligrosidad(ColorLesion.MIEL));
	}
	@Test
	void getNextTest() {
		assertEquals(ColorLesion.GRIS, dermatologo.getNext(ColorLesion.ROJO));
		assertEquals(ColorLesion.AMARILLO, dermatologo.getNext(ColorLesion.GRIS));
		assertEquals(ColorLesion.MIEL, dermatologo.getNext(ColorLesion.AMARILLO));
		assertEquals(ColorLesion.ROJO, dermatologo.getNext(ColorLesion.MIEL));
		
	}

}
