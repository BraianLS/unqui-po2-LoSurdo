package ar.edu.unq.po2.tp12.ejercicio1;

public class EncriptadorNaive {

		private EstrategiaEncriptacion strategy; 


		public EstrategiaEncriptacion getStrategy() {
			return strategy;
		}
		public void setStrategy(EstrategiaEncriptacion strategy) {
			this.strategy = strategy;
		}
	
		
		
		public EncriptadorNaive(EstrategiaEncriptacion strategy) {
			super();
			this.strategy = strategy;
		}

		
		public String encriptar(String texto) {
			return strategy.encriptar(texto);
		}
		public String desencriptar(String texto) {
			return strategy.desencriptar(texto);
		}
}
