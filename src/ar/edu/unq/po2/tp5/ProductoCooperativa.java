package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
			
		private double descuento = 10;
		
		public double getDescuento() {
			return descuento;
		}
		public void setDescuento(double descuento) {
			this.descuento = descuento;
		}
		public ProductoCooperativa() {
			super();
		}
		public ProductoCooperativa(String nombre,double precioBase,int stock) {
			this.nombre = nombre;
			this.precioBase = precioBase;
			this.stock = stock;
		}
		public ProductoCooperativa(String nombre,double precioBase,int stock, double descuento) {
			this.nombre = nombre;
			this.precioBase = precioBase;
			this.stock = stock;
			this.descuento = descuento;
		}
		@Override
		public double getPrecioBase() {
			return this.precioBase * (0.01 * (100 - this.descuento));
		}
}
