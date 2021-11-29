package ar.edu.unq.po2.tp11.ejercicio2;

public class Planta extends Empleado {

	private int cantidadHijos = 0;
	
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	public Planta(int cantidadHijos) {
		super();
		this.cantidadHijos = cantidadHijos;
	}
	
	@Override
	protected int extraPorSituacionFamiliar() {
		return this.getCantidadHijos() * 150;
	}
	@Override
	protected int sueldoBasico() {
		return 3000;
	}

}
