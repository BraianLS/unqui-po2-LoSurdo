package ar.edu.unq.po2.tp9.ejercicio4;

import java.util.Calendar;

public class Archivos implements FileSystem{
		private String nombre;
		private int tamaño;
		private Calendar fechaModificacion;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		@Override
		public int totalSize() {
			return tamaño;
		}
		public Calendar getFecha() {
			return fechaModificacion;
		}
		@Override
		public void printStructure() {
			System.out.println(" " + this.getNombre() + " ");
			
		}
		@Override
		public FileSystem lastModified() {
			return this;
		}
		@Override
		public FileSystem oldestElement() {
			return this;
		}
		@Override
		public void agregarArchivo(FileSystem archivo) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void eliminarArchivo(FileSystem archivo) {
			// TODO Auto-generated method stub
			
		}
		
}
