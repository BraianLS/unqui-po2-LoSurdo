package ar.edu.unq.po2.tp6;

import java.util.EnumMap;

public class Dermatologo {
		
		
	
		private EnumMap<ColorLesion,Integer> nivelPeligrosidad;
		
		public enum ColorLesion{ROJO("R"), GRIS("G"), AMARILLO("A"), MIEL("M");

		private ColorLesion(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		String abreviatura;
		}
		
		public void armarPeligrosidad() {
			nivelPeligrosidad = new EnumMap<ColorLesion, Integer>(ColorLesion.class);
			nivelPeligrosidad.put(ColorLesion.ROJO, 4);
			nivelPeligrosidad.put(ColorLesion.GRIS, 3);
			nivelPeligrosidad.put(ColorLesion.AMARILLO, 2);
			nivelPeligrosidad.put(ColorLesion.MIEL, 1);
		}
		public Integer getPeligrosidad(ColorLesion color) {
			return nivelPeligrosidad.get(color);
		}
		public int getOrden(ColorLesion color) {
			return color.ordinal();
		}
		public ColorLesion getNext(ColorLesion color) {
			return this.getOrden(color) < ColorLesion.values().length - 1
			         ? ColorLesion.values()[color.ordinal() + 1] //Nota para mi mismo: con el "?" puedes realizar una evaluacion de if-else sin recurrir a su estructura especifica
			                 : ColorLesion.values()[0]; 
		/* Con esto evaluamos la condicion de que mientras el ordinal del color dado por parametro no exceda el largo 
		 * del cual se compone la enumeracion, retornará el siguiente, pero en caso de que no sea así(porque ya 
		 * llego al ultimo) devolverá el de orden 0 es decir,el primero.
		 */
		}
}
