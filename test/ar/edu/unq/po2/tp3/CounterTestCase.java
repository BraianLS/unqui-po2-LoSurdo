package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
		counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		counter.addNumber(1542);
		counter.addNumber(4564);
		counter.addNumber(45000);
		counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
		int amount = counter.cantidadImpares();
	// I check the amount is the expected one
		assertEquals(9, amount);
	}
	@Test
	public void testPares() {
		int amount = counter.cantidadPares();
		assertEquals(5, amount);
	}
	@Test
	public void testDigitOf() {
		int amount = counter.digitsOf(100);
		assertEquals(3, amount);
	}
	@Test
	public void testNumeroAListaDeDigitos() {
		List<Integer> actual = counter.listaDeDigitosDe(3001);
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(3);
		esperado.add(0);
		esperado.add(0);
		esperado.add(1);
		assertEquals(esperado,actual);
		
	}
	@Test
	public void testListaDeListasDeDigitosDe() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(3045);
		lista.add(451);
		List<List<Integer>> esperado = counter.listaDeListasDeDigitosDe(lista);
		List<List<Integer>> actual = new ArrayList<List<Integer>>();
		actual.add(Arrays.asList(3));
		actual.add(Arrays.asList(3,0,4,5));
		actual.add(Arrays.asList(4,5,1));
		assertEquals(esperado, actual);
		
	}
	@Test
	public void testListaDeCantidadDeParesDe() {
		List<List<Integer>> lista = new ArrayList<List<Integer>>();
		lista.add(Arrays.asList(3));
		lista.add(Arrays.asList(3,0,4,5));
		lista.add(Arrays.asList(4,5,1));
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(0);
		esperado.add(2);
		esperado.add(1);
		List<Integer> actual = counter.listaDeCantidadDeParesDe(lista);
		assertEquals(esperado, actual);
		
	}
	@Test
	public void testMaximoDeLaLista() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(2);
		lista.add(1);
		int esperado = 2;
		int actual = counter.maximoDeLaLista(lista);
		assertEquals(esperado, actual);
		
	}
	public void testIndexDelNumeroConMasPares() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(2);
		lista.add(1);
		int esperado = 2;
		int actual = counter.maximoDeLaLista(lista);
		assertEquals(esperado, actual);
		
	}
	@Test
	public void testIndexOf() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(2);
		lista.add(1);
		int index = lista.indexOf(1);
		assertEquals(2, index);
		int valor = lista.get(index);
		assertEquals(1, valor);
	}
	
	@Test
	public void testNumeroConMayorCantidadDePares() {
		int number = counter.numeroConMayorCantidadDePares(counter.getArregloDeEnteros());
		assertEquals(45000, number);
	}
	@Test
	public void testMultiplosDe() { //divisores de 8 
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(1);
		esperado.add(2);
		esperado.add(4);
		esperado.add(8);
		List<Integer> actual = counter.multiploDe(8);
		assertEquals(esperado, actual);
	}
	@Test
	public void testMultiploMasAltoDe() { 
		int esperado = -1;
		int actual = counter.multiploMasAltoDe(1000,6);
		assertEquals(esperado, actual);
	}
}
