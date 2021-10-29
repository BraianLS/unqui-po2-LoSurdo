package ar.edu.unq.po2.tp9.ejercicio3;

import ar.edu.unq.po2.tp3.Point;

public class Ingeniero implements Personaje {
	
	private int cantidadLajas;
	public int getCantidadLajas() {
		return cantidadLajas;
	}

	public void setCantidadLajas(int cantidadLajas) {
		this.cantidadLajas = cantidadLajas;
	}
	
	public Ingeniero() {
		super();
		this.cantidadLajas = 10;
	}

	public Ingeniero(int cantidadLajas) {
		super();
		this.cantidadLajas = cantidadLajas;
	}


	@Override
	public void caminar(Point punto) {
		while(!this.llegoAlPunto(punto)) {
			this.caminarFormaCorta(punto);
		}
	}
	private boolean llegoAlPunto(Point punto) {
		// TODO se encarga de determinar si llego al punto o todavia no. No lo coloco en la interfaz porque me molesta java
		return false;
	}
	private void caminarFormaCorta(Point punto) {
		if(this.getCantidadLajas() > 0) {
			this.construirCamino(punto);
		}
		else {this.caminarNormalmente(punto);}
	}

	private void caminarNormalmente(Point punto) {
		// TODO Se encarga de caminar normalmente si no tiene lajas.
		
	}

	private void construirCamino(Point punto) {
		// TODO Se encarga de ir caminando de la forma mas corta y construir el camino e ir dejando las lajas a medida que pasa(si es que no habia otra laja antes)
		
		
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
