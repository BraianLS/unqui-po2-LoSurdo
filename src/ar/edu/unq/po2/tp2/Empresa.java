package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {
	
		private String nombre;
		private int cuit;
		private Collection<Empleado> empleados = new ArrayList<Empleado>();
		private Collection<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();

 /* No s? si en estos casos es realmente necesario volver a crear el constructor empresa sin parametros si nunca se usar?*/		
		public Empresa() { 
			
		} /* Ac? no se muy bien si v? Collection<Empleado> o Empleado[] como tipo de la lista de empleados,pero como no parece que rompa estar? bien supongo*/
		public Empresa(String nombre,int cuit, Collection<Empleado> empleados) {
			this.nombre = nombre;
			this.cuit = cuit;
			this.empleados = empleados;
		}  
		
		public Collection<Empleado> getEmpleados() {
			return empleados;
		}
		public void setEmpleados(Collection<Empleado> empleados) {
			this.empleados = empleados;
		}
		public String getNombre() {
			return nombre;
		}
		public int getCuit() {
			return cuit;
		}
		// Lo hice como un retorno de un valor n?merico, si lo que querian era un string que dijera el monto total bruto es: + montoTotal ,mis disculpas por no entenderlos
		public int consultaMontoTotalBruto() {
			
			
			int montoTotalBruto = 0;
			for (Empleado empleado:empleados ) {
				montoTotalBruto += empleado.consultaSueldoBruto();
			}
			return montoTotalBruto;
			
		}
		
		public double consultaMontoTotalNeto() {
			double montoTotalNeto = 0;
			for (Empleado empleado:empleados ) {
				montoTotalNeto += empleado.consultaSueldoNeto();
			}
			return montoTotalNeto;
			
		
		}
		public double consultaMontoTotalRetenciones() {
			double retencionesTotales = 0;
			for (Empleado empleado:empleados ) {
				retencionesTotales += empleado.retencionesAplicadas();
			}
			return retencionesTotales;
			
		}
		public void liquidarSueldos() {
			
			for (Empleado empleado:empleados ) {
				
				recibos.add(new ReciboDeHaberes(empleado));
			}
			
		}
}
