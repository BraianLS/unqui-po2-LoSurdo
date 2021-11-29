package ar.edu.unq.po2.tp10.ejercicio2;

public class SubscriptorConcreto implements Subscriptor{
		
		private Partido ultimoPartidoRecibido = null; //Para poder testear

		public Partido getUltimoPartidoRecibido() {
			return ultimoPartidoRecibido;
		}
		public void setUltimoPartidoRecibido(Partido ultimoPartidoRecibido) {
			this.ultimoPartidoRecibido = ultimoPartidoRecibido;
		}
		@Override
		public void notificar(Partido partido) {
			System.out.println(partido.getResultado() + " .En el deporte: " + partido.getDeporte());
			this.setUltimoPartidoRecibido(partido);
		}
		
		
}
