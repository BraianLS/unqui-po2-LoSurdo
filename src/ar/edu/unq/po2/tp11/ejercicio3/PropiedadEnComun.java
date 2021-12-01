package ar.edu.unq.po2.tp11.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PropiedadEnComun extends Filter{
	
	
	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		Map<String, WikipediaPage> infoBoxDePage = page.getInfobox();
		List<String> keys = new ArrayList<>(infoBoxDePage.keySet());
		Stream<WikipediaPage> paginas = wikipedia.stream().filter(p -> this.mismaPropiedadEnComun(keys, p.getInfobox()));
		return paginas.collect(Collectors.toList());
	}

	private boolean mismaPropiedadEnComun(List<String> keys, Map<String, WikipediaPage> map) {
		
		for(String key : keys) {
			if(map.containsKey(key)) {
				return true;
				}
			}
		return false;
		
	}

	
}
 