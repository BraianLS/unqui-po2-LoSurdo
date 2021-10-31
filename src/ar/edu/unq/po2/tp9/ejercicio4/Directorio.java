package ar.edu.unq.po2.tp9.ejercicio4;

import java.util.ArrayList;
import java.util.Calendar;

import ar.edu.unq.po2.tp2.Calendario;


public class Directorio implements FileSystem{
	private String nombre;
	private Calendar fechaCreacion;
	private ArrayList<FileSystem> archivosDeSistema;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha() {
		return fechaCreacion;
	}
	
	
	public Directorio(String nombre) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = Calendario.actualDate();
		this.archivosDeSistema = new ArrayList<FileSystem>();
	}

	@Override
	public int totalSize() {
		int peso = 0;
		for (FileSystem archivo : archivosDeSistema) { 
			peso += archivo.totalSize();
		}
		return peso;
	}
	@Override
	public void printStructure() {
		for(FileSystem file: archivosDeSistema) {
			System.out.println(" " + this.getNombre() + " ");
			file.printStructure();
		}
		
	}
	@Override
	public FileSystem lastModified() { //Se podria hacer un throw exception si el directorio está vacio,sino devolver el propio directorio(pero no creo que sea lo esperado)
		FileSystem elemento = null;
		for(FileSystem file: archivosDeSistema) {
			elemento = this.elementoMasNuevo(elemento,file);
		}
		return elemento;
	}
	@Override
	public FileSystem oldestElement() {
		
		FileSystem elemento = null;
		for(FileSystem file: archivosDeSistema) {
			elemento = this.elementoMasViejo(elemento,file);
		}
		return elemento;
	}
	private FileSystem elementoMasNuevo(FileSystem elemento1, FileSystem elemento2) {

		// Retorna el elemento mas nuevo entre dos elementos dados
		return elemento2;
	}
	private FileSystem elementoMasViejo(FileSystem elemento1, FileSystem elemento2) {

		// Retorna el elemento mas viejo entre dos elementos dados
		return elemento2;

	}

	@Override
	public void agregarArchivo(FileSystem archivo) {
		archivosDeSistema.add(archivo);
		
	}

	@Override
	public void eliminarArchivo(FileSystem archivo) {
		archivosDeSistema.remove(archivo);
		
	}
}
