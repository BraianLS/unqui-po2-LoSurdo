package ar.edu.unq.po2.tp10.ejercicio1;

import java.util.ArrayList;


public class InteresadoConcreto implements Interesado{
	
	private ArrayList<String> camposDeInteres;
	private Publicacion publicacionActualRecibida; // para testear que funcione 
	
	public Publicacion getPublicacionActualRecibida() {
		return publicacionActualRecibida;
	}

	public InteresadoConcreto() {
		super();
		this.camposDeInteres = new ArrayList<String>();
	}

	@Override
	public ArrayList<String> getCamposDeInteres() {
		return camposDeInteres;
	}

	@Override
	public boolean meInteresa(Publicacion publicacion) {
		for(String palabraClave : this.getCamposDeInteres()){ 
			if(publicacion.contienePalabra(palabraClave)){  //Me gustaria meter esto en una subtarea,pero me obliga a colocar un return en todos los estados,y yo no quiero hacer eso, solo quiero que retorne si encontro la palabra
				return publicacion.contienePalabra(palabraClave);
			}
		}
		return false;
	}

	@Override
	public void notificarNuevaPublicacion(Publicacion publicacion){
		//El comportamiento especifico de este interesado será hacer un println del titulo de la publicacion
		System.out.println("El titulo de la publicacion de nuestro interes es: " + publicacion.getTitulo());
		publicacionActualRecibida = publicacion; // para testear algo en los asserts
	}

	public void agregarInteres(String interes) {
		camposDeInteres.add(interes);
	}
	public void eliminarInteres(String interes) {
		camposDeInteres.remove(interes);
	}
}
