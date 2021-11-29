package ar.edu.unq.po2.tp12.ejercicio1;

public class Desencriptador {

	public String desencriptar(String texto, EstrategiaEncriptacion strategy) {

		return strategy.desencriptar(texto);
		
	}

}
