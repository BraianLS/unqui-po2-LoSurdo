package ar.edu.unq.po2.tp2;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Permanente prueba = new Permanente("felipe","Cacatua 34","Soltero",new GregorianCalendar(2001,3,19),4000,2,4);
		System.out.println(prueba.consultaEdad());
	}

}
