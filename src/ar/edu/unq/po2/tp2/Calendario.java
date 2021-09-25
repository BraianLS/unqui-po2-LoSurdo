package ar.edu.unq.po2.tp2;

import java.util.Calendar;
import java.util.Date;

public class Calendario {
	
	
		public static int diferenciaDeAñosActual(Calendar fecha) {
		/*	No da un valor correcto en caso de borde*/
			return actualDate().get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
	} 
		public static Calendar actualDate() {
		
			return toCalendar(Calendar.getInstance().getTime());

	}
		public static Calendar toCalendar(Date date){ 
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal;
	}
	
}
