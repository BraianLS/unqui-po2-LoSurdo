package ar.edu.unq.po2.tp4.punto3;

public class IngresoHorasExtras extends Ingreso {
		
		private int horasExtras;

		public int getHorasExtras() {
			return horasExtras;
		}

		public void setHorasExtras(int horasExtras) {
			this.horasExtras = horasExtras;
		}
		public IngresoHorasExtras() {
			super();
		}
		public IngresoHorasExtras(String mes, double montoPercibido, String concepto) {
			super(mes, montoPercibido, concepto);
		}
		public IngresoHorasExtras(String mes, double montoPercibido, String concepto, int horasExtras) {
			super(mes, montoPercibido, concepto);
			this.horasExtras = horasExtras;
		}

		@Override
		public double getMontoPercibido(){
			return 0.0;
		}
		@Override
		public double getIngresoPorHorasExtras(){
			return montoPercibido;
		}
		
}	
