package ar.edu.unq.po2.tp6;

public class ActividadSemanal {
	
	private Deporte deportePracticado;
	private Dia diaDeLaSemana;
	private int horaInicio;
	private int duracion; // en horas
	
	
	public ActividadSemanal() {}
	public ActividadSemanal(Deporte deportePracticado, Dia diaDeLaSemana, int horaInicio, int duracion) {
		super();
		this.deportePracticado = deportePracticado;
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
	}

	public Deporte getDeportePracticado() {
		return deportePracticado;
	}

	public Dia getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public enum Dia{ LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
	
	public enum Deporte { 
		RUNNING{
			
			@Override
			public int getComplejidad() {
				return 1;
			}

		}, 
		
		FUTBOL{
			@Override
			public int getComplejidad() {
				return 2;
			}
				
		}, 
		
		BASKET{
			@Override
			public int getComplejidad() {
				return 2;
			}
			
		}, 
		
		TENNIS{
			@Override
			public int getComplejidad() {
				return 3;
			}
		}, 
		
		JABALINA{
			@Override
			public int getComplejidad() {
				return 4;
			}
		};
		abstract int getComplejidad();
	}
	
	public int getCostoActividadSemanal() {
		if((diaDeLaSemana == Dia.LUNES) || (diaDeLaSemana == Dia.MARTES) || (diaDeLaSemana == Dia.MIERCOLES) ) {
			return 500 + deportePracticado.getComplejidad() * 200;
		}
		else {
			return 1000 + deportePracticado.getComplejidad() * 200;
		}
	}
	@Override
	public String toString() {
		return "Deporte: " + deportePracticado + ". Dia: " + diaDeLaSemana
				+ " A LAS: " + horaInicio + " . Duración: " + duracion + " hora(s).";
	}
	
	
}
