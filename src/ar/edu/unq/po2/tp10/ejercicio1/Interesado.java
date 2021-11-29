package ar.edu.unq.po2.tp10.ejercicio1;

import java.util.ArrayList;

public interface Interesado {

	public ArrayList<String> getCamposDeInteres();
	public boolean meInteresa(Publicacion publicacion);
	public void notificarNuevaPublicacion(Publicacion publicacion);
}
