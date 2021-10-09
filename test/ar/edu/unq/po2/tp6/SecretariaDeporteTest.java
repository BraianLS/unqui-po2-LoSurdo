package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.ActividadSemanal.Deporte;
import ar.edu.unq.po2.tp6.ActividadSemanal.Dia;

class SecretariaDeporteTest {
	
	private ActividadSemanal futbol12;
	private ActividadSemanal futbol13;
	private ActividadSemanal jabalina17;
	private ActividadSemanal tennis20;
	private ActividadSemanal basket19;
	private ActividadSemanal running22;
	private SecretariaDeporte municipio;
	
	@BeforeEach
	void setUp() throws Exception {
		
		futbol12 = new ActividadSemanal(Deporte.FUTBOL,Dia.LUNES,12,2);
		futbol13 = new ActividadSemanal(Deporte.FUTBOL,Dia.JUEVES,13,1);
		jabalina17 = new ActividadSemanal(Deporte.JABALINA,Dia.DOMINGO,17,4);
		tennis20 = new ActividadSemanal(Deporte.TENNIS,Dia.VIERNES,20,1);
		basket19 = new ActividadSemanal(Deporte.BASKET,Dia.VIERNES,19,1);
		running22 = new ActividadSemanal(Deporte.RUNNING,Dia.MIERCOLES,22,2);
		
		municipio = new SecretariaDeporte();
		municipio.agregarActividad(futbol12);
		municipio.agregarActividad(futbol13);
		municipio.agregarActividad(jabalina17);
		municipio.agregarActividad(tennis20);
		municipio.agregarActividad(basket19);
		municipio.agregarActividad(running22);
	}
	
	@Test
	void getActividadesFutbolTest() {
	//	List<ActividadSemanal> esperado = Array.asList(futbol12,futbol13);
		List<ActividadSemanal> esperado = new ArrayList<ActividadSemanal>();
		esperado.add(futbol12);
		esperado.add(futbol13);
		assertEquals(esperado, municipio.getActividadesFutbol());

	}
	@Test
	void getCantidadHorasTotaltesTest() {
		assertEquals(11, municipio.getCantidadHorasTotales());
	}
	@Test
	void getActividadesDeComplejidadTest() {
		List<ActividadSemanal> esperado = new ArrayList<ActividadSemanal>();
		esperado.add(jabalina17);
		assertEquals(esperado , municipio.getActividadesDeComplejidad(4));
	}
	/*
	@Test
	void getActividadDeMenorCostoTest() {
		assertEquals(futbol12 , municipio.getActividadDeMenorCosto(Deporte.FUTBOL));
	}
	*/
	
	@Test
	void imprimirActividadesTest() {
		municipio.imprimirActividades();
	}

}
