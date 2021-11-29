package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10.ejercicio2.ConsultorResultado;
import ar.edu.unq.po2.tp10.ejercicio2.Partido;
import ar.edu.unq.po2.tp10.ejercicio2.SubscriptorConcreto;

class Ejercicio2Test {

		
	private ConsultorResultado observado;
	private SubscriptorConcreto interesadoParticular;
	private Partido partido1;
	
	@BeforeEach
	void setUp() throws Exception {
		observado = new ConsultorResultado();
		interesadoParticular = new SubscriptorConcreto();
		ArrayList<String> contrincantes = new ArrayList<String>();
		contrincantes.add("Giorgio");
		contrincantes.add("Joseph Jorstrat");
		contrincantes.add("Jonathan Jorial");
		partido1 = new Partido("Victoria 3 - 1", contrincantes, "Futbol");
	}

	@Test
	void testNotificar() {
		ArrayList<String> intereses = new ArrayList<String>();
		intereses.add("Giorgio");
		observado.subscribirse(interesadoParticular, intereses);
		observado.notificarALosInteresadosDe(partido1);
		assertEquals(partido1,interesadoParticular.getUltimoPartidoRecibido());
	}

}
