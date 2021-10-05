package ar.edu.unq.po2.tp4.punto3;

public class Ingreso {
		
		protected String mes;
		protected double montoPercibido;
		protected String concepto;
		public String getMes() {
			return mes;
		}
		public void setMes(String mes) {
			this.mes = mes;
		}
		public double getMontoPercibido() {
			return montoPercibido;
		}
		public void setMontoPercibido(double montoPercibido) {
			this.montoPercibido = montoPercibido;
		}
		public String getConcepto() {
			return concepto;
		}
		public void setConcepto(String concepto) {
			this.concepto = concepto;
		}
		public Ingreso() {
			super();
		}
		public Ingreso(String mes, double montoPercibido, String concepto) {
			super();
			this.mes = mes;
			this.montoPercibido = montoPercibido;
			this.concepto = concepto;
		}
		public double getIngresoPorHorasExtras() {
			return 0.0;
		}
		
}
