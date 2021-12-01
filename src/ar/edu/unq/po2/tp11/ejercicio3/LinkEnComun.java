package ar.edu.unq.po2.tp11.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkEnComun extends Filter{

	
	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		List<WikipediaPage> linksPaginaIndividual = page.getLinks();
		Stream<WikipediaPage> paginas = wikipedia.stream().filter(p -> this.mismoLinkEnComun(linksPaginaIndividual, p.getLinks()));
		return paginas.collect(Collectors.toList());
	}

	private boolean mismoLinkEnComun(List<WikipediaPage> linksPaginaIndividual, List<WikipediaPage> wikipedia) {
		
		return wikipedia.stream().anyMatch(p -> this.contieneAlgunLinkIgual(p.getLinks(), linksPaginaIndividual));
		
		
	}

	private boolean contieneAlgunLinkIgual(List<WikipediaPage> linksPaginas, List<WikipediaPage> linksPaginaIndividual) {
		
		for(WikipediaPage link : linksPaginaIndividual) {
			if(linksPaginas.contains(link)) {
				return true;
			};
		}
		return false;
	}

}
