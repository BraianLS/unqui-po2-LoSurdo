package ar.edu.unq.po2.tp11.ejercicio3;

import java.util.List;

public abstract class Filter {

	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return this.aplicarFiltro(page, wikipedia);
	}

	protected abstract List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> wikipedia);
	
}
