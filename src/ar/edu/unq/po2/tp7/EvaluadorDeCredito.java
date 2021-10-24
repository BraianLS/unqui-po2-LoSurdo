package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class EvaluadorDeCredito {
		
	private ArrayList<SolicitudDeCredito> solicitudesDeCredito;
	
	public ArrayList<SolicitudDeCredito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}	
	public EvaluadorDeCredito() {
		super();
		this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		this.getSolicitudesDeCredito().add(solicitud);
	}
	public void procesarSolicitud(Banco banco, Cliente cliente) {
		SolicitudDeCredito solicitud = this.buscarSolicitud(cliente);
		if(this.esSolicitudValida(solicitud)) {
			banco.desembolsar(cliente,solicitud.getMonto());
		}
	}
	private SolicitudDeCredito buscarSolicitud(Cliente cliente) {
		return (SolicitudDeCredito) solicitudesDeCredito.stream().filter(p -> p.getCliente() == cliente);
	}
	private boolean esSolicitudValida(SolicitudDeCredito solicitud) {
		return solicitud.esSolicitudAprobable();
	}
	public ArrayList<SolicitudDeCredito> getListaSolicitudesAprobables() { //Retorna la lista de solicitudes aprobadas o una lista vacia en caso de que no haya
		
		ArrayList<SolicitudDeCredito> listaDeAprobados = new ArrayList<SolicitudDeCredito>();
		
		for(SolicitudDeCredito solicitud: this.getSolicitudesDeCredito()) {
			this.agregarAListaDeAprobadosSiCorresponde(listaDeAprobados, solicitud);
		}
		
		return listaDeAprobados;
	}
	private ArrayList<SolicitudDeCredito> agregarAListaDeAprobadosSiCorresponde(ArrayList<SolicitudDeCredito> lista, SolicitudDeCredito solicitud) {
		
		ArrayList<SolicitudDeCredito> listaDeAprobados = new ArrayList<SolicitudDeCredito>();
		
		if(this.esSolicitudValida(solicitud)) {
			listaDeAprobados.add(solicitud);
		}
		return listaDeAprobados;
	}
}
