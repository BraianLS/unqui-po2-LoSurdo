package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectanguloPrueba = new Rectangulo(new Point(0,1),2,3);
	/*
	@BeforeEach
	public void setUp() throws Exception {
		
	}*/
	@Test
	void testCrearRectangulo() {
		Point esperado = new Point(0,1);
		Point actual = rectanguloPrueba.getEsquinaSuperiorIzquierda();
		assertEquals( esperado.getX() , actual.getX());
		assertEquals( esperado.getY() , actual.getY());
		
		esperado = new Point(0,-1);
		actual = rectanguloPrueba.getEsquinaInferiorIzquierda();
		assertEquals( esperado.getX() , actual.getX());
		assertEquals( esperado.getY() , actual.getY());
		
		esperado = new Point(3,1);
		actual = rectanguloPrueba.getEsquinaSuperiorDerecha();
		assertEquals( esperado.getX() , actual.getX());
		assertEquals( esperado.getY() , actual.getY());

		esperado = new Point(3,-1);
		actual = rectanguloPrueba.getEsquinaInferiorDerecha();
		assertEquals( esperado.getX() , actual.getX());
		assertEquals( esperado.getY() , actual.getY());
	}
	@Test
	void testAreaRectangulo() {
		assertEquals( 6 , rectanguloPrueba.area());
	}
	@Test
	void testPerimetroRectangulo() {
		assertEquals( 10 , rectanguloPrueba.perimetro());
	}
	@Test
	void testOrientacion() {
		assertEquals( "Es horizontal" , rectanguloPrueba.orientacionDeFigura());
	}
	@Test
	void testOrientacionVertical() {
		Rectangulo rectVertical = new Rectangulo(new Point(0,1),3,2);
		assertEquals( "Es vertical" , rectVertical.orientacionDeFigura());
	}
}
