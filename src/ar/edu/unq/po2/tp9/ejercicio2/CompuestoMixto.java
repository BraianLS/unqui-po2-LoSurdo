package ar.edu.unq.po2.tp9.ejercicio2;

import java.util.ArrayList;

public class CompuestoMixto implements Cultivo{

	private ArrayList<Cultivo> listaDeCultivos = new ArrayList<Cultivo>();
	
	@Override
	public double getGananciaAnual() {
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnual() / 4; //Divide por 4 debido a que los cultivosMixtos se dividen en 4
		}
		return gananciaAnual;
	}
// No me gusta la idea de tener que filtrar por tipo de dato o por interfaz...aunque tampoco me gusta mucho la actual que eleg�,pero no se me ocurre una mejor.
	@Override
	public double getGananciaAnualSoja() {
		// TODO Esto en la otra alternativa deberia filtrar la lista de cultivos en solo los que sean de soja o mixtos pero solo sumando la parte de soja
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnualSoja() / 4; //Divide por 4 debido a que los cultivosMixtos se dividen en 4
		}
		return gananciaAnual;
	}

	@Override
	public double getGananciaAnualTrigo() {
		// TODO Esto en la otra alternativa deberia filtrar la lista de cultivos en solo los que sean de trigo o mixtos pero solo sumando la parte de trigo
		double gananciaAnual = 0;
		for (Cultivo cultivo : listaDeCultivos) 
		{ 
			gananciaAnual += cultivo.getGananciaAnualTrigo() / 4; //Divide por 4 debido a que los cultivosMixtos se dividen en 4
		}
		return gananciaAnual;
	}
	

}
