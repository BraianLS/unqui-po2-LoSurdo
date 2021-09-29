package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
			
			double descuento = 10;
			
			public double getDescuento() {
				return descuento;
			}

			public void setDescuento(double descuento) {
				this.descuento = descuento;
			}

			
			
			public ProductoPrimeraNecesidad() {
				super();
			}

			public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
				super(nombre, precio, precioCuidado);
			}

			public ProductoPrimeraNecesidad(String nombre, double precio) {
				super(nombre, precio);
			}

			public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
				super(nombre, precio, precioCuidado);
				this.descuento = descuento;
			}

			@Override
			public double getPrecio() {
				
				return this.getPrecioBase() * (0.01 * (100 - descuento));
				}
			
			private double getPrecioBase() {
				return precio;
			}
}
