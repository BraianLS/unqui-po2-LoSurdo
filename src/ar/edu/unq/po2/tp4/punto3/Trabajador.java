package ar.edu.unq.po2.tp4.punto3;

import java.util.ArrayList;

public class Trabajador {
		
		private ArrayList<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
		private double porcentajeImpuesto = 0.02; 
		
		
		public ArrayList<Ingreso> getIngresosPercibidos() {
			return ingresosPercibidos;
		}
		public void setIngresosPercibidos(ArrayList<Ingreso> ingresosPercibidos) {
			this.ingresosPercibidos = ingresosPercibidos;
		}
	
		public double getPorcentajeImpuesto() {
			return porcentajeImpuesto;
		}
		public void setPorcentajeImpuesto(double porcentajeImpuesto) {
			this.porcentajeImpuesto = porcentajeImpuesto;
		}
		
		public double getTotalPercibido() {
				return 0.0;
		}
		public double getMontoPercibido() {
			//	porcentajeImpuesto.stream().forEach(producto -> precioTotal += producto.getPrecio());;
				return 0.0;
		}
		public double getImpuestoAPagar() {
				return this.getMontoPercibido() * this.getPorcentajeImpuesto();
		}
}
