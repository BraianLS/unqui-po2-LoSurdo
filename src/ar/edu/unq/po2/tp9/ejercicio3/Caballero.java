package ar.edu.unq.po2.tp9.ejercicio3;

import ar.edu.unq.po2.tp3.Point;

public class Caballero implements Personaje{

	
	@Override
	public void caminar(Point punto) {
		while(!this.llegoAlPunto(punto)) {
			this.vigilarZona(punto);
		}
	}
	private boolean llegoAlPunto(Point punto) {
		// TODO se encarga de determinar si llego al punto o todavia no. No lo coloco en la interfaz porque me molesta java
		return false;
	}
	private void vigilarZona(Point punto) {
		this.moverseEnZigZag(punto);
	}
	private void moverseEnZigZag(Point punto) {
		//TODO: realiza la accion de moverse por zig zag logrando de esta forma controlar que no haya enemigos
	}
	@Override
	public void agregarPersonaje(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eliminarPersonaje(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}

}
