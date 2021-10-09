package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.ActividadSemanal.Deporte;
import ar.edu.unq.po2.tp6.ActividadSemanal.Dia;
import ar.edu.unq.po2.tp6.Dermatologo.ColorLesion;

class ActividadSemanalTest {

	private ActividadSemanal futbol12;
	private ActividadSemanal futbol13;
	private ActividadSemanal jabalina17;
	@BeforeEach
	void setUp() throws Exception {
		futbol12 = new ActividadSemanal(Deporte.FUTBOL,Dia.LUNES,12,2);
		futbol13 = new ActividadSemanal(Deporte.FUTBOL,Dia.JUEVES,13,1);
		jabalina17 = new ActividadSemanal(Deporte.JABALINA,Dia.DOMINGO,17,4);
	}

	@Test
	void deportePracticadoTest() {
		assertEquals(Deporte.FUTBOL, futbol12.getDeportePracticado());
		assertEquals(Deporte.FUTBOL, futbol13.getDeportePracticado());
		assertEquals(Deporte.JABALINA, jabalina17.getDeportePracticado());

	}
	@Test
	void complejidadTest() {
		assertEquals(1, Deporte.RUNNING.getComplejidad());
		assertEquals(2, Deporte.FUTBOL.getComplejidad());
		assertEquals(2, Deporte.BASKET.getComplejidad());
		assertEquals(3, Deporte.TENNIS.getComplejidad());
		assertEquals(4, Deporte.JABALINA.getComplejidad());
	}
	@Test
	void duracionTest() {
		assertEquals(2, futbol12.getDuracion());
		assertEquals(1, futbol13.getDuracion());
		assertEquals(4, jabalina17.getDuracion());
	}
	@Test
	void costoTest() {
		assertEquals(900, futbol12.getCostoActividadSemanal());
		assertEquals(1400, futbol13.getCostoActividadSemanal());
		assertEquals(1800, jabalina17.getCostoActividadSemanal());
	}
	@Test
	void toStringTest() {
		System.out.println(futbol12.toString());
	}
}
