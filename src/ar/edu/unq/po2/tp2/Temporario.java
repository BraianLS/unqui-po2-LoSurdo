package ar.edu.unq.po2.tp2;

import java.util.Date;
import java.util.Calendar;

public final class Temporario extends Empleado{

	private Date fechaFinDesignacion;
	private int horasExtras;
	
	public Temporario() {
		// TODO Auto-generated constructor stub
	}


	public Temporario(String nombre, String direccion, String estadoCivil, Calendar fechaNacimiento, int sueldoBasico, Date fechaFinDesignacion, int horasExtras) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtras = horasExtras;
	}
	public Date getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}


	public int getHorasExtras() {
		return horasExtras;
	}

	public int calculoHorasExtras() {
		// TODO Auto-generated method stub
		return 40 * this.getHorasExtras(); 
	}
	


	@Override
	public int consultaSueldoBruto() {

		return this.getSueldoBasico() + this.calculoHorasExtras();
	}

	@Override
	public double retencionesAplicadas() {
		// TODO Auto-generated method stub
		return this.costeObraSocial() + this.costeAporteJubilatorio() ;
	}

	@Override
	protected double costeObraSocial() {
		
		return this.consultaSueldoBruto() * 0.10 + this.impuestoPorEdad();
	}

	private int impuestoPorEdad() {
		
		if (this.consultaEdad() > 50) {return 25;}
		else {return 0;}
	}


	@Override
	protected double costeAporteJubilatorio() {
		
		return this.consultaSueldoBruto() * 0.10 + 5 * this.getHorasExtras();
	}

	@Override
	public void consultaDeConceptos() {  //Hace falta convertir a strings los valores o ya automaticamente java lo hace?
		System.out.println("Sueldo Basico: " + this.getSueldoBasico());  
		System.out.println("Horas Extras: " + this.calculoHorasExtras());
		System.out.println("Obra Social : -" + this.costeObraSocial());
		System.out.println("Aportes Jubilatorios: -" + this.costeAporteJubilatorio());
	}

}
