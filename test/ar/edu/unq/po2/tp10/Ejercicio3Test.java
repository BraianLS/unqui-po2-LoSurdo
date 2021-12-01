package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11.ejercicio3.LinkEnComun;
import ar.edu.unq.po2.tp11.ejercicio3.MismaLetraInicial;
import ar.edu.unq.po2.tp11.ejercicio3.PropiedadEnComun;

class Ejercicio3Test {

	private MismaLetraInicial mismaLetra;
	private LinkEnComun linkComun;
	private PropiedadEnComun propiedadComun;
	
	@BeforeEach
	void setUp() throws Exception {
		mismaLetra = new MismaLetraInicial();
		linkComun = new LinkEnComun();
		propiedadComun = new PropiedadEnComun();
	}

	@Test
	void testGetSimilarPagesMismaLetra() {
		fail("Not yet implemented");
	}

}
