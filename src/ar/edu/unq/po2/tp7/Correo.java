package ar.edu.unq.po2.tp7;

public class Correo {
	private String asunto;
	private String destinario;
	private String cuerpo;
	
	public Correo(String asunto, String destinario, String cuerpo) {
		super();
		this.asunto = asunto;
		this.destinario = destinario;
		this.cuerpo = cuerpo;
	}
	//agregué unos getters de cada uno por que considero que serian necesarios en esta representacion de un sistema de correos.

	public String getAsunto() {
		return asunto;
	}

	public String getDestinario() {
		return destinario;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
}