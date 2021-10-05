package ar.edu.unq.po2.tp5;

public abstract class Factura implements Agencia,Pago {
		protected double precioBase;

		public double getPrecioBase() {
			return precioBase;
		}
		public void registrarPago(Factura factura){
			//TODO: ver que hacer acá
		}
		public void actualizarSituacion() {
			this.registrarPago(this);
		}
}
