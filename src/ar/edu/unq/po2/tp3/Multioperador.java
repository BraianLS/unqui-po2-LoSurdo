package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
		
		private int valor;
		
		
		public int sumador(List<Integer> lista) {
			
			valor = 0;
			lista.stream().forEach((numero)->{
				valor = valor + numero;
			});
			return valor;
		}
		public int restador(List<Integer> lista) {
			
			valor = 0;
			lista.stream().forEach((numero)->{
				valor = valor - numero;
			});
			return valor;
		}
		public int multiplicador(List<Integer> lista) {
			
			valor = 0;
			lista.stream().forEach((numero)->{
				valor = valor * numero;
			});
			return valor;
		}
}
