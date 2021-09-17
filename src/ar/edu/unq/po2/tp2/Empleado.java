package ar.edu.unq.po2.tp2;

import java.util.Date;

public abstract class Empleado {
		
		protected String nombre;
		protected String direccion;
		protected String estadoCivil; // Soltero o Casado
		protected Date fechaNacimiento;
		protected int sueldoBasico;
		
		public String getNombre() {
			return nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public int getSueldoBasico() {
			return sueldoBasico;
		}
		
		public int consultaEdad() {
			/*	En algun momentó veré bien como funciona la clase Date y completaré este metodo, basicamente quiero realizar una resta entre fechas
			 */
			return 0;
		}
		public double consultaSueldoNeto() {
			return this.consultaSueldoBruto() - this.retencionesAplicadas();
		}
		protected abstract int consultaSueldoBruto();
		protected abstract double retencionesAplicadas();
		protected abstract double costeObraSocial();
		protected abstract double costeAporteJubilatorio();
		protected abstract void consultaDeConceptos();
		
}

