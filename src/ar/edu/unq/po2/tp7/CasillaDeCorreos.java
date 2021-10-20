package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class CasillaDeCorreos {
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public CasillaDeCorreos() {
		super();
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}

	
	public int contarInbox(){
		return this.inbox.size();
	}

	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	

	
}
