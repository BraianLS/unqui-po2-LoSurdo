package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
		private String nombre;
		private	String direccion;
		private	ArrayList<Producto> productos = new ArrayList<Producto>();
		private	Double precioTotal;
		public String getNombre() {
			return nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		
		public ArrayList<Producto> getProductos() {
			return productos;
		}
		public Supermercado() {
			super();
		}
		public Supermercado(String nombre, String direccion) {
			super();
			this.nombre = nombre;
			this.direccion = direccion;
		}
		public Integer getCantidadDeProductos() {

			return productos.size();
		}

		public Double getPrecioTotal() {
			// TODO Auto-generated method stub
			precioTotal = 0.0;
			productos.stream().forEach(producto -> precioTotal += producto.getPrecio());;
			return precioTotal;
		}
		public void agregarProducto(Producto producto) {
			productos.add(producto);
			
		}
		
		
}
