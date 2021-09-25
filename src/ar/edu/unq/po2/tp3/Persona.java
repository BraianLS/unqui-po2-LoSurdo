package ar.edu.unq.po2.tp3;

import java.util.Calendar;
import java.util.Date;

import ar.edu.unq.po2.tp2.Calendario;

public class Persona {
		
		private String nombre;
		private Date fechaNacimiento;
		
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		
		public Persona(String nombre, Date fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
		}
		public int consultaEdad() {
			/*	No da un valor correcto en caso de borde*/
			return Calendario.diferenciaDeAñosActual(Calendario.toCalendar(this.getFechaNacimiento()));
		}
		public boolean menorQue(Persona persona) {
				
			return this.consultaEdad() < persona.consultaEdad();
		}
}
