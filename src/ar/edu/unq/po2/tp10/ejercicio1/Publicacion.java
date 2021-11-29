package ar.edu.unq.po2.tp10.ejercicio1;

import java.util.ArrayList;

public class Publicacion {
	private String titulo;
	private String autores;
	private String filiacion;
	private String tipoDeArticulo;
	private String lugarPublicacion;
	private ArrayList<String> palabrasClaves;
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutores() {
		return autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	public Publicacion(String titulo, String autores, String filiacion, String tipoDeArticulo, String lugarPublicacion,
			ArrayList<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClaves = palabrasClaves;
	}

	public ArrayList<String> getCombinadoDePalabras() {
		 ArrayList<String> listaDePalabrasDeBusqueda = new ArrayList<>();
		 listaDePalabrasDeBusqueda.add(titulo);
		 listaDePalabrasDeBusqueda.add(autores);
		 listaDePalabrasDeBusqueda.add(filiacion);
		 listaDePalabrasDeBusqueda.add(tipoDeArticulo);
		 listaDePalabrasDeBusqueda.add(lugarPublicacion);
		 listaDePalabrasDeBusqueda.addAll(getPalabrasClaves());
		 return listaDePalabrasDeBusqueda;
	}

	public boolean contienePalabra(String palabra){
		return this.getCombinadoDePalabras().contains(palabra);
	}
}
