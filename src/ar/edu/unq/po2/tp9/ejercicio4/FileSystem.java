package ar.edu.unq.po2.tp9.ejercicio4;

import java.util.Calendar;

public interface FileSystem {
	/**
	* Retorna el total ocupado en disco del receptor. Expresado en *cantidad de bytes.
	*/
	public int totalSize();
	/**
	* Imprime en consola el contenido indicando el nombre del elemento
	* e indentandolo con tantos espacios como profundidad en la estructura.
	*/
	public void printStructure();
	/**
	* Elemento mas nuevo
	*/
	public FileSystem lastModified();
	/** Elemento mas antiguo
	*/
	public FileSystem oldestElement();
	public Calendar getFecha();
	
	public void agregarArchivo(FileSystem archivo);
	public void eliminarArchivo(FileSystem archivo);
	
}
