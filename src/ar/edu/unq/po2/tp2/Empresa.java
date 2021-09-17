package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {
	
		private String nombre;
		private int cuit;
		private Collection<Empleado> empleados = new ArrayList<Empleado>();
 /* No sé si en estos casos es realmente necesario volver a crear el constructor empresa sin parametros si nunca se usará*/		
		public Empresa() { 
			
		} /* Acá no se muy bien si vá Collection<Empleado> o Empleado[] como tipo de la lista de empleados*/
		public Empresa(String nombre,int cuit, Collection<Empleado> empleados) {
			this.nombre = nombre;
			this.cuit = cuit;
			this.empleados = empleados;
		}
		public int consultaMontoTotalBruto() {
			// TODO Auto-generated method stub
		}
		public int consultaMontoTotalNeto() {
			// TODO Auto-generated method stub
		}
		public int consultaMontoTotalRetenciones() {
			// TODO Auto-generated method stub
		}
		public void liquidarSueldos() {
			// TODO Auto-generated method stub
			
		}
}
