package ar.edu.unq.po2.tp10.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;

public class ConsultorResultado {

		private HashMap<Subscriptor, ArrayList<String>> subscriptores = new HashMap<Subscriptor, ArrayList<String>>();
		
		
		public HashMap<Subscriptor, ArrayList<String>> getSubscriptores() {
			return subscriptores;
		}
		public void subscribirse(Subscriptor interesado, ArrayList<String> informacionDeInteres) {
			subscriptores.put(interesado, informacionDeInteres);
		}
		public void deSubscribirse(Subscriptor interesado) {
			subscriptores.remove(interesado);
		}
		public void notificarALosInteresadosDe(Partido partido) {
			subscriptores.forEach((key,value) -> this.notificarSiCorresponde(key,value,partido));
		}
		private void notificarSiCorresponde(Subscriptor subscriptor, ArrayList<String> intereses, Partido partido) {
			if(this.correspondeNotificar(intereses,partido)) {
				subscriptor.notificar(partido);
			}
			
		}
		private boolean correspondeNotificar(ArrayList<String> intereses, Partido partido) {
			for(String interes : intereses) {
				return partido.contienePalabraClave(interes);
			}
			return false;
		}
}
