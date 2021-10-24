package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class GestionClientes {
	
	private ArrayList<Cliente> listaDeClientes;
	
	public ArrayList<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	
	
	public GestionClientes() {
		super();
		this.listaDeClientes = new ArrayList<Cliente>();
	}



	public void agregarCliente(Cliente cliente) {
		listaDeClientes.add(cliente);
	}
		
}
