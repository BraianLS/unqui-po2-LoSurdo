package ar.edu.unq.po2.tp10.ejercicio1;

import java.util.ArrayList;

public class Publisher {

	public ArrayList<Interesado> subscriptores;
	public ArrayList<Publicacion> listaDePublicaciones; 
	//la idea es tener esta lista para implementar un mensaje de busqueda de todas las publicaciones de un cierto tag y así el subscriptor puede solicitarlas.
	
	public Publisher() {
		super();
		this.subscriptores = new ArrayList<Interesado>();
		this.listaDePublicaciones = new ArrayList<Publicacion>();
	}
	public ArrayList<Interesado> getSubscriptores() {
		return subscriptores;
	}
	public ArrayList<Publicacion> getListaDePublicaciones() {
		return listaDePublicaciones;
	}
	public void subscribirse(Interesado interesado) {
		subscriptores.add(interesado);
	}
	public void deSubscribirse(Interesado interesado) {
		subscriptores.remove(interesado);
	}
	public void agregarPublicacion(Publicacion publicacion){
		listaDePublicaciones.add(publicacion); // Por si alguien quiere recibir todas las publicaciones de X tipo
		this.notificarALosInteresadosDe(publicacion);
	}

	public ArrayList<Publicacion> getPublicacionesDe(String palabraClave){
		return (ArrayList<Publicacion>) listaDePublicaciones.stream().filter( p -> p.contienePalabra(palabraClave));
	} //Ver como solucionar el problema de este stream cast
	
	public void notificarALosInteresadosDe(Publicacion publicacion){
		for(Interesado interesado : this.getSubscriptores()){
			this.verificarInteresado(interesado,publicacion);
		}
	}
	private void verificarInteresado(Interesado interesado, Publicacion publicacion){
		if(interesado.meInteresa(publicacion)){
			interesado.notificarNuevaPublicacion(publicacion);
		}
	}
}
