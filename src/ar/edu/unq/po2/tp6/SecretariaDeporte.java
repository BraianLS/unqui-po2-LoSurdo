package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import ar.edu.unq.po2.tp6.ActividadSemanal.Deporte;

public class SecretariaDeporte {
		private int horasTotales = 0;
		private List<ActividadSemanal> actividadesDeLaSemana = new ArrayList<ActividadSemanal>();
		private Stream<ActividadSemanal> actividades = actividadesDeLaSemana.stream();
		
		public List<ActividadSemanal> getActividadesDeLaSemana() {
			return actividadesDeLaSemana;
		}

		public void agregarActividad(ActividadSemanal actividad) {
			actividadesDeLaSemana.add(actividad);
		}
		public List<ActividadSemanal> getActividadesFutbol(){
			return this.getActividadesde(Deporte.FUTBOL);
		}
/*		
		public List<ActividadSemanal> getActividadesFutbol(){
			return actividades.filter(actividad -> this.esFutbol(actividad)).collect(Collectors.toList());
		}
		private boolean esFutbol(ActividadSemanal actividad) {
			return actividad.getDeportePracticado() == Deporte.FUTBOL;
		}
*/

		public List<ActividadSemanal> getActividadesde(Deporte deporte){
			return actividades.filter(actividad -> this.esActividadDe(actividad,deporte)).collect(Collectors.toList());
		}
		private boolean esActividadDe(ActividadSemanal actividad, Deporte deporte) {
			return actividad.getDeportePracticado() == deporte;
		}
		public List<ActividadSemanal> getActividadesDeComplejidad(int complejidad){
			
			return actividades.filter(actividad -> actividad.getDeportePracticado().getComplejidad() == complejidad).collect(Collectors.toList());
		}
		public int getCantidadHorasTotales() {
			actividades.forEach(actividad -> horasTotales += actividad.getDuracion());

			return horasTotales;
		}
		public Optional<ActividadSemanal> getActividadDeMenorCosto(Deporte deporte) {

			return this.getActividadesde(deporte).stream().min(Comparator.comparing(ActividadSemanal::getCostoActividadSemanal)) ;
		//Me retorna un Optional<ActividadSemanal> ----------------->   PREGUNTAR!!!!!
	
		}
	/*	public Map<Deporte, ActividadSemanal> getActividadMasEconomica(Deporte deporte) {
			Map<Deporte, ActividadSemanal> actividadMasEconomica = actividades.collect(groupingBy(ActividadSemanal::getActividadDeMenorCosto(deporte)));
			
			return actividadMasEconomica;
		}
	*/
		public Map<Deporte, Optional<ActividadSemanal>> getMapActividadesMasEconomicas() {
			Map<Deporte, Optional<ActividadSemanal>> mapActividadMasEconomica = new HashMap<Deporte, Optional<ActividadSemanal>>();
			 Deporte deportes[] = Deporte.values();
			 for(Deporte deporte : deportes) {
				 mapActividadMasEconomica.put(deporte,this.getActividadDeMenorCosto(deporte));
			 }
			 
			return mapActividadMasEconomica;
			
		}
		public void imprimirActividades() {
			
			actividades.forEach(actividad -> System.out.println(actividad.toString()));
		}
}
