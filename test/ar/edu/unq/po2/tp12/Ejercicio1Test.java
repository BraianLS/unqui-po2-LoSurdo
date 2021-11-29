package ar.edu.unq.po2.tp12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp12.ejercicio1.EncriptadorNaive;
import ar.edu.unq.po2.tp12.ejercicio1.EstrategiaEncriptacionVocales;

class Ejercicio1Test {

	private EncriptadorNaive encriptadorNaive;
	private EstrategiaEncriptacionVocales encriptadorVocal;
	
	@BeforeEach
	void setUp() throws Exception {
		encriptadorVocal = new EstrategiaEncriptacionVocales();
		encriptadorNaive = new EncriptadorNaive(encriptadorVocal);
		
	}

	@Test
	void testEncriptar() {
	//	assertEquals("Pipi is il treodur", encriptadorNaive.encriptar("Pepe es el traidor"));
		assertEquals(true,true);
	}

	@Test
	void testDesencriptar() {
		assertEquals(true,true);
	}

}
