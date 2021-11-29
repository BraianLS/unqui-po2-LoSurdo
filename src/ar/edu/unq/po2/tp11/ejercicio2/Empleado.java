package ar.edu.unq.po2.tp11.ejercicio2;


// template method: esta es la abstract class o esqueleto.

public abstract class Empleado {
		
		private int dineroDepositado = 0;
		private int horasTrabajadas = 0;
		private double porcentajeAporte = 0.13;
		
		
		private int getHorasTrabajadas() {
			return horasTrabajadas;
		}

		public int getDineroDepositado() {
			return dineroDepositado;
		}
		
		public void agregarDinero(double cantidad) {
			dineroDepositado += cantidad;
		}
		
		public double sueldo() {
			return this.getSueldoBruto() - this.aportes();
		}
		private double getSueldoBruto() {
			return this.pagoPorHora() * this.getHorasTrabajadas() + this.sueldoBasico() + this.extraPorSituacionFamiliar();
		}

		private double aportes() {
			return this.getSueldoBruto() * porcentajeAporte;
		}

		// Estos son los hook methods, podrian retornar una variable que luego pueda setearse para cambiar los valores en las subclases,pero el ejercicio no lo requeria
		// hook
		protected int extraPorSituacionFamiliar() {
			
			return 0;
		}
		// hook
		protected int sueldoBasico() {
	
			return 0;
		}
		// debido a que los empleados de Planta no se les calcula el sueldo por su pago por hora,entonces tambien es un hook
		protected  int pagoPorHora() {
			
			return 0;
		}
}
