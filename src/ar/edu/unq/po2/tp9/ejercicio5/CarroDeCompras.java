package ar.edu.unq.po2.tp9.ejercicio5;

import java.util.ArrayList;

public class CarroDeCompras {
		
		private ArrayList<Product> products = new ArrayList<Product>();


		private void setElements(ArrayList<Product> products) {
			this.products = products;
		}
		
		public ArrayList<Product> getElements() {
			return products;
		}
		
		public int totalRounded() { 
			return (int) (this.total());
		}
		public float total() {
			float total = 0;
			for(Product producto: products) {
				total += producto.getPrice();
			}
			return total;
		}

		
}
