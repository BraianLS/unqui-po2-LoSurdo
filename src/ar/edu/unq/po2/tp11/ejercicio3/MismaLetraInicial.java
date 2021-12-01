package ar.edu.unq.po2.tp11.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MismaLetraInicial extends Filter{
	
	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		char primeraLetra = this.getPrimerLetraDe(page);
		Stream<WikipediaPage> paginas = wikipedia.stream().filter(p -> this.mismaLetraEnComun(primeraLetra, p));
		return paginas.collect(Collectors.toList());
		
	}
	
	private boolean mismaLetraEnComun(char letra, WikipediaPage page) {
		return letra == this.getPrimerLetraDe(page);
	}
	private char getPrimerLetraDe(WikipediaPage page) {
		return page.getTitle().charAt(0);
	}
}
