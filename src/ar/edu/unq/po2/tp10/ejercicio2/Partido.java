package ar.edu.unq.po2.tp10.ejercicio2;

import java.util.ArrayList;

public class Partido {
		
		private String resultado;
		private ArrayList<String> contrincantes;
		private String deporte;
		
		public String getResultado() {
			return "El resultado del partido es: " + resultado;
		}
		public ArrayList<String> getContrincantes() {
			return contrincantes;
		}
		public String getDeporte() {

			return deporte;
		}
		
		public Partido(String resultado, ArrayList<String> contrincantes, String deporte) {
			super();
			this.resultado = resultado;
			this.contrincantes = contrincantes;
			this.deporte = deporte;
		}
		
		public boolean contienePalabraClave(String palabra) {
			return this.getCombinadoDePalabras().contains(palabra);
		}
		public ArrayList<String> getCombinadoDePalabras(){
			 ArrayList<String> listaDePalabrasDeBusqueda = new ArrayList<>();
			 listaDePalabrasDeBusqueda.addAll(contrincantes);
			 listaDePalabrasDeBusqueda.add(deporte);
			 return listaDePalabrasDeBusqueda;
		}
		
}
