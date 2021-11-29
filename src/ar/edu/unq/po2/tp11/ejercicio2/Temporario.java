package ar.edu.unq.po2.tp11.ejercicio2;

public class Temporario extends Empleado{
	
	private boolean tieneHijosOEsposa = false;
	public Temporario(boolean tieneHijosOEsposa) {
		this.tieneHijosOEsposa = tieneHijosOEsposa;
		
	}
	public boolean getTieneHijosOEsposa() {
		return tieneHijosOEsposa;
	}
	@Override
	protected int extraPorSituacionFamiliar() {
		if(this.getTieneHijosOEsposa()) {return 100;}
		else {return 0;}
	}
	@Override
	protected int sueldoBasico() {
		return 1000;
	}
	@Override
	protected int pagoPorHora() {
		return 5;
	}
	
}
