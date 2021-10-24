package ar.edu.unq.po2.tp7;

public class PropiedadInmobiliaria {
	
		private String descripcion;
		private String direccion;
		private double valorFiscal;
		
		public String getDescripcion() {
			return descripcion;
		}
		public String getDireccion() {
			return direccion;
		}
		public double getValorFiscal() {
			return valorFiscal;
		}
		public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
			super();
			this.descripcion = descripcion;
			this.direccion = direccion;
			this.valorFiscal = valorFiscal;
		}
		
		
}
