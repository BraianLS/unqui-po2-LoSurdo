package ar.edu.unq.po2.tp9.ejercicio3;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.Point;

public class Ejercito implements Personaje {

	private ArrayList<Personaje> listaDePersonajes;
	
	@Override
	public void caminar(Point punto) {
		for (Personaje personaje : listaDePersonajes) { 
			personaje.caminar(punto);
		}
		
	}

	@Override
	public void agregarPersonaje(Personaje personaje) {
		listaDePersonajes.add(personaje);
		
	}

	@Override
	public void eliminarPersonaje(Personaje personaje) {
		listaDePersonajes.remove(personaje);
		
	}

}
