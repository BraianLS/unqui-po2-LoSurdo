package ar.edu.unq.po2.tp5;

public class Caja {
		private double montoTotal;

		public Caja() {
			super();
		}

		public double getMontoTotal() {
			return montoTotal;
		}
		
		public void setMontoTotal(double montoTotal) {
			this.montoTotal = montoTotal;
		}

		public void imprimirYResetearTotalAPagar() {
			System.out.println("Su monto total a pagar es: " + this.getMontoTotal());
			this.setMontoTotal(0);
		}
		
		public void registrar(Pago consumo) {
			
			this.setMontoTotal(this.getMontoTotal() + consumo.getPrecioBase());
			consumo.actualizarSituacion();
			
		}
		
		
		
}
