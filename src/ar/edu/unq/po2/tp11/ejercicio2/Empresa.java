package ar.edu.unq.po2.tp11.ejercicio2;

import java.util.ArrayList;

public class Empresa {

		ArrayList<Empleado> listaDeEmpleados;

		public Empresa() {
			super();
			this.listaDeEmpleados = new ArrayList<Empleado>();
		}
		
		public void agregarEmpleado(Empleado empleado){
			listaDeEmpleados.add(empleado);
		}
		public void pagarSueldo(Empleado empleado) {
			empleado.agregarDinero(empleado.sueldo());
		}
		public void pagarSueldosATodos() {
			for(Empleado empleado: listaDeEmpleados) {
				this.pagarSueldo(empleado);
			}
		}
}
