package ar.edu.unq.po2.tp4;

public class Producto {
	
		String nombre;
		double precio;
		boolean precioCuidado;
		
		
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public boolean esPrecioCuidado() {
			return precioCuidado;
		}

		public void setPrecioCuidado(boolean esPrecioCuidado) {
			this.precioCuidado = esPrecioCuidado;
		}

		public Producto() {
			super();
		}
		public Producto(String nombre, double precio) {
			super();
			this.nombre = nombre;
			this.precio = precio;
			this.precioCuidado = false;
		}
		public Producto(String nombre, double precio, boolean precioCuidado) {
			super();
			this.nombre = nombre;
			this.precio = precio;
			this.precioCuidado = precioCuidado;
		}
		public void aumentarPrecio(double valorAumento) {
			
			this.setPrecio(this.getPrecio() + valorAumento);
			
		}
		
		
}
