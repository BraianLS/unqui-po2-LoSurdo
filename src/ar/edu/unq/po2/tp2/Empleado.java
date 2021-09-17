package ar.edu.unq.po2.tp2;

import java.util.Calendar;
import java.util.Date;


public abstract class Empleado {
		
		protected String nombre;
		protected String direccion;
		protected String estadoCivil; // Soltero o Casado
		protected Calendar fechaNacimiento;
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
		public Calendar getFechaNacimiento() {
			return fechaNacimiento;
		}
		public int getSueldoBasico() {
			return sueldoBasico;
		}
		
		public int consultaEdad() {
			/*	No da un valor correcto en caso de borde*/
			return this.ActualDate().get(Calendar.YEAR) - this.getFechaNacimiento().get(Calendar.YEAR);
		}
		private Calendar ActualDate() {
			
			return this.toCalendar(Calendar.getInstance().getTime());

		}
		public Calendar toCalendar(Date date){ 
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			  return cal;
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

