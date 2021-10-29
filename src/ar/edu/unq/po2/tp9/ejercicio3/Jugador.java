package ar.edu.unq.po2.tp9.ejercicio3;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.Point;


public class Jugador {

	private ArrayList<Personaje> listaDePersonajes = new ArrayList<Personaje>();
	
	public void movilizarTodoHacia(Point punto) {
		listaDePersonajes.stream().forEach( p -> p.caminar(punto));
	}
	
}
