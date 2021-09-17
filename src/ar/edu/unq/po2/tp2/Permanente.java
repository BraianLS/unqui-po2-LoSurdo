package ar.edu.unq.po2.tp2;

import java.util.Date;

public final class Permanente extends Empleado{
	
	private int cantidadHijos;
	private int antig�edad; // en a�os
	
	public Permanente() {
		
	}

	public Permanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, int sueldoBasico, int cantidadHijos, int antig�edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.cantidadHijos = cantidadHijos;
		this.antig�edad = antig�edad;
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public int getAntig�edad() {
		return antig�edad;
	}
	
	@Override
	public int consultaSueldoBruto() {
		
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	private int salarioFamiliar() {
		
		return this.asignacionPorAntig�edad() + this.asignacionPorConyuge() + this.asignacionPorHijo();
	}
	
	private int asignacionPorConyuge() {
		
		if(this.getEstadoCivil() == "Casado") {return 100;}
		else return 0;
				
	}

	private int asignacionPorHijo() {
		
		return this.getCantidadHijos() * 150;
	}
	
	private int asignacionPorAntig�edad() {
		return 50 * this.getAntig�edad();
	}
	
	@Override
	public double retencionesAplicadas() {
		return this.costeObraSocial() + this.costeAporteJubilatorio();
	}

	@Override
	protected double costeObraSocial() {
		return this.consultaSueldoBruto() * 0.10 + this.getCantidadHijos() * 20;
	}

	@Override
	protected double costeAporteJubilatorio() {
		
		return this.consultaSueldoBruto() * 0.15;
	}

	@Override
	public void consultaDeConceptos() {
		System.out.println("Sueldo Basico: " + this.getSueldoBasico());  
		System.out.println("Asignacion por hijo: " + this.asignacionPorHijo());
		System.out.println("Asignacion por c�nyuje: " + this.asignacionPorConyuge());
		System.out.println("Asignacion por Antig�edad: " + this.asignacionPorAntig�edad());
		System.out.println("Coste Obra Social: -" + this.costeObraSocial());
		System.out.println("Aportes jubilatorios: -" + this.costeAporteJubilatorio());
	}
	
}
