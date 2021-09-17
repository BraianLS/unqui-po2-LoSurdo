package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Empresa {
	
		private String nombre;
		private int cuit;
		private Collection<Empleado> empleados = new ArrayList<Empleado>();
		private int montoTotal;
 /* No sé si en estos casos es realmente necesario volver a crear el constructor empresa sin parametros si nunca se usará*/		
		public Empresa() { 
			
		} /* Acá no se muy bien si vá Collection<Empleado> o Empleado[] como tipo de la lista de empleados*/
		public Empresa(String nombre,int cuit, Collection<Empleado> empleados) {
			this.nombre = nombre;
			this.cuit = cuit;
			this.empleados = empleados;
		}  // Lo hice como un retorno de un valor númerico, si lo que querian era un string que dijera el monto total bruto es: + montoTotal ,mis disculpas por no entenderlos
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
				// hacer un nuevo recibo de haberes para ese empleado
			}
			
		}
		private void crearReciboSueldoPara(Empleado empleado, Date fechaDeHoy) {
			ReciboDeHaberes reciboHaber = new ReciboDeHaberes(empleado,fechaDeHoy);
		}
}
