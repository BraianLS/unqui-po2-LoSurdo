package ar.edu.unq.po2.tp9.ejercicio2;

import java.util.ArrayList;

public class PorcionProductiva {
	
	private ArrayList<Cultivo> listaDeCultivos = new ArrayList<Cultivo>();
	
	
	
	//Otra forma de hacer este metodo seria sumando la gananciaAnualTrigoTotal y gananciaAnualSojaTotal
	public double getGananciaAnualTotal() {
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnual();
		}
		return gananciaAnual;
	}

	
	/* Este son los metodos para obtener la ganancia anual total tanto de trigo como de soja,pero no se como 
	calcularlos sin recurrir a un filtro del tipo de dato o interfaz; o creando dos metodos 
	extra que cada uno retorne lo que debe retornar segun su situacion(explicado un poco más en
	las demás clases) */

	public double getGananciaAnualTrigoTotal() {
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnualTrigo();
		}
		return gananciaAnual;
	}
	public double getGananciaAnualSojaTotal() {
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnualSoja();
		}
		return gananciaAnual;
	}

}
