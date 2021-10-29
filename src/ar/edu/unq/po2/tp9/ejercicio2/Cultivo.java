package ar.edu.unq.po2.tp9.ejercicio2;

public interface Cultivo extends TrigoInterface,SojaInterface{
		
		public double getGananciaAnual();
		
		public void agregar(Cultivo cultivo);
		public void eliminar(Cultivo cultivo);
}
