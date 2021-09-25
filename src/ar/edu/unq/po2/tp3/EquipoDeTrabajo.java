package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
		private String nombre;
		private ArrayList<Persona> integrantes = new ArrayList<Persona>();
		private int sumaTotal;
		
		public int promedioEdades() {
			integrantes.forEach(integrante -> sumaTotal += integrante.consultaEdad());
			return sumaTotal / integrantes.size();
		}
}
