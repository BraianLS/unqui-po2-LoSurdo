package ar.edu.unq.po2.tp3;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	List<Integer> arregloDeEnteros = new ArrayList<Integer>();
	//private int[] arregloDeEnteros = new int[] {1,2,3,4,5,6,7,8,9};
	
	public List<Integer> getArregloDeEnteros() {
		return arregloDeEnteros;
	}
	public void setArregloDeEnteros(List<Integer> arregloDeEnteros) {
		this.arregloDeEnteros = arregloDeEnteros;
	}
	
	public int cantidadPares() {
		int cantidad = 0;
		for (int numero:arregloDeEnteros) {
			if(this.daResto0De(numero)) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	//En vez de repetir codigo(porq seria muy similar al de cantidadPares, se me ocurrio hacerlo asi)
	public int cantidadImpares() {
		return arregloDeEnteros.size() - this.cantidadPares();
	}

	private boolean daResto0De(int numero) {
		return numero % 2 == 0;
	}
	public void addNumber(Integer i) {
		arregloDeEnteros.add(i);
		
	}
	// en vez de multiplos no querrá los divisores?? 
	public List<Integer> multiploDe(int number){
		List<Integer> multiplos = new ArrayList<Integer>();
		
		
		return multiplos;
		
	}
	
	public int digitsOf(int number) {
		int length = (int) (Math.log10(number) + 1);
		return length;
	}
	


	public List<Integer> listaDeDigitosDe(int number){ //Solución muy a lo intro de programacion jeje
		List<Integer> lista = new ArrayList<Integer>();
		int cantDigit  = this.digitsOf(number);
		int divisor = (int) (Math.pow(10, (cantDigit - 1)));
		int contador = cantDigit;
		int númeroADividir = number;
		int digito = 0;
		while (contador != 0){
			digito = númeroADividir / divisor;
			númeroADividir = númeroADividir - (digito * divisor);
			divisor = divisor / 10;
			lista.add(digito);
			contador--;
		}
		return lista;
	}
	
	public List<List<Integer>> listaDeListasDeDigitosDe(List<Integer> listaDeInteger){
		List<List<Integer>> lista = new ArrayList<List <Integer>>();
		for(Integer number:listaDeInteger ) {
			//ver si es necesario convertir la lista de Integers to int o si se hace automatico
			
			lista.add(this.listaDeDigitosDe(number));
		}
		return lista;
	}
	public List<Integer> listaDeCantidadDeParesDe(List<List<Integer>> listaDeListaDeNumeros) {
		
		List<Integer> lista = new ArrayList<Integer>();
		for(List<Integer> listaDeDigitos:listaDeListaDeNumeros ) {
			lista.add(this.cantidadPares(listaDeDigitos));
		}
		
		return lista; 

	}
	private int cantidadPares(List<Integer> lista) {
		int cantidad = 0;
		for (int numero:lista) {
			if(this.daResto0De(numero)) {
				cantidad += 1;
			}
		}
		return cantidad;
	}//recibe una lista de numeros integers
	private int indexDeLaListaConNumeroConMasPares(List<Integer> lista) {
		int maximo = this.maximoDeLaLista(this.listaDeCantidadDeParesDe(listaDeListasDeDigitosDe(lista)));
		return (this.listaDeCantidadDeParesDe(listaDeListasDeDigitosDe(lista))).indexOf(maximo);

	}
	
	public int maximoDeLaLista(List<Integer> lista) {
		int maximo = 0;
		for (Integer numero:lista) {
			maximo = Math.max(maximo, numero);
		}
		
		return maximo;
	}
	
	public int numeroConMayorCantidadDePares(List<Integer> lista) {

		return lista.get(indexDeLaListaConNumeroConMasPares(lista));
	}
}
