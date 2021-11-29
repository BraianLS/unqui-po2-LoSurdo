package ar.edu.unq.po2.tp12.ejercicio1;

public class EstrategiaEncriptacionVocales implements EstrategiaEncriptacion{

	private ReemplazadorVocal reemplazador;


	public ReemplazadorVocal getReemplazador() {
		return reemplazador;
	}

	public void setReemplazador(ReemplazadorVocal reemplazador) {
		this.reemplazador = reemplazador;
	}


	@Override
	public String encriptar(String texto) {
		reemplazador = new EncriptadorVocal();
		return reemplazador.reemplazarTodasLasVocales(texto);
	}


	@Override
	public String desencriptar(String texto) {
		reemplazador = new DesencriptadorVocal();
		return reemplazador.reemplazarTodasLasVocales(texto);
	}

}
