package ar.edu.unq.po2.tp12.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ReemplazadorVocal {
	
	ArrayList<String> vocales = new ArrayList<String>(
		    Arrays.asList("a", "e", "i" , "o", "u"));
	
	
	
	public final String reemplazarTodasLasVocales(String texto) {
		String textoNuevo = "caca";

		for(char c: this.convertirACaracteres(texto)) {
			
		//	textoNuevo.concat(this.reemplazarSiCorresponde(String.valueOf(c)));
			String charComoString = "" + c;
			textoNuevo.concat(charComoString);
		//	textoNuevo.concat(this.reemplazarSiCorresponde(charComoString));
		}
		char c = 'a';
		String charComoString = "" + c;
		return textoNuevo;
		
	}
	
	
	private char[] convertirACaracteres(String texto) { //Otra opcion es usar char[] caracteres = str.toCharArray()
		char[] caracteres = new char[texto.length()];
		for (int i = 0; i < texto.length(); i++) {
			caracteres[i] = texto.charAt(i);
        }
		return caracteres;
	}


	public final String reemplazarSiCorresponde(String vocal) {
		if(esVocal(vocal)) {
			return this.reemplazarVocales(vocal);
		}
		else {
			return vocal;
		}
	}
	
	public final String reemplazarVocales(String vocal) {
			int indexCambiado = this.cambiarIndex(vocal);
			indexCambiado = this.evaluarUltimo(indexCambiado);
			return vocales.get(indexCambiado);
		
		
	}

	protected abstract int evaluarUltimo(int index);

	protected abstract int cambiarIndex(String vocal);

	private boolean esVocal(String vocal) {

		return vocales.contains(vocal);
		
	}
	
}
