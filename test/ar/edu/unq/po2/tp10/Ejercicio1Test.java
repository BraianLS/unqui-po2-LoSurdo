package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10.ejercicio1.InteresadoConcreto;
import ar.edu.unq.po2.tp10.ejercicio1.Publicacion;
import ar.edu.unq.po2.tp10.ejercicio1.Publisher;


class Ejercicio1Test {
	
	private InteresadoConcreto interesado;
	private Publisher observado;
	private Publicacion publicacion1;
	private ArrayList<String> tags;
	
	@BeforeEach
	void setUp() throws Exception {
		interesado = new InteresadoConcreto();
		observado = new Publisher();
		tags = new ArrayList<String>();
		tags.add("Cuantica");
		tags.add("Fisica");
		tags.add("Computacion");
		tags.add("IA");
		publicacion1 = new Publicacion("Uso de la fisica cuantica para el desarrollo de IA en computacion Cuantica",
				"NombreGenerico","Universidad","Research Paper","China",tags);
	}

	@Test
	void testAgregarInteres() {
		interesado.agregarInteres("IA");
		assertTrue(interesado.getCamposDeInteres().contains("IA"));
	}

	@Test
	void testEliminarInteres() {
		interesado.agregarInteres("IA");
		interesado.eliminarInteres("IA");
		assertTrue(!interesado.getCamposDeInteres().contains("IA"));
	}
	@Test
	void testComportamientoDeInteresDeNuevoArticulo() {
		interesado.agregarInteres("IA");
		observado.subscribirse(interesado);
		observado.agregarPublicacion(publicacion1);
		assertEquals(publicacion1,interesado.getPublicacionActualRecibida());
	}
	
	
}
