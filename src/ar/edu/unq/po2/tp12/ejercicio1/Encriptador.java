package ar.edu.unq.po2.tp12.ejercicio1;

public class Encriptador {

	public String encriptar(String texto, EstrategiaEncriptacion strategy) {

		return strategy.encriptar(texto);
		
	}

	
		
}
