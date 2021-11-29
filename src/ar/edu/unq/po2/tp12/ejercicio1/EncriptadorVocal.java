package ar.edu.unq.po2.tp12.ejercicio1;

public class EncriptadorVocal extends ReemplazadorVocal{

	
	
	@Override
	protected int cambiarIndex(String vocal) {
		return vocales.indexOf(vocal)  + 1;
	}

	@Override
	protected int evaluarUltimo(int index) {
		if(index >= 5) {
			return 0;
		}
		else {return index;}
	}

	
}
