package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pago{
		
		protected String nombre;
		protected double precioBase;
		protected int stock;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getPrecioBase() {
			return precioBase;
		}
		public void setPrecioBase(double precioBase) {
			this.precioBase = precioBase;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public void actualizarSituacion() {
			this.setStock(this.getStock() - 1);
		}
		
}
