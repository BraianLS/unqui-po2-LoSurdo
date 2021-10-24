package ar.edu.unq.po2.tp7;

public class Cliente {
		
		private String nombre;
		private String apellido;
		private String direccion;
		private int edad;
		private double netoMensual;
		private Banco banco;
		
		
		
		
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}

		public String getDireccion() {
			return direccion;
		}

		public int getEdad() {
			return edad;
		}

		public double getNetoMensual() {
			return netoMensual;
		}

		public Banco getBanco() {
			return banco;
		}

		public Cliente(String nombre, String apellido, String direccion, int edad, double netoMensual, Banco banco) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			this.edad = edad;
			this.netoMensual = netoMensual;
			this.banco = banco;
		}
		public double getSueldoAnual() {
			
			return this.getNetoMensual() * 12;
		}
		public void solicitarCreditoPersonal(int monto, int plazo) {
			this.getBanco().registrarSolicitudCredito(new CreditoPersonal(this,monto,plazo));
		}
		public void solicitarCreditoHipotecario(int monto, int plazo, PropiedadInmobiliaria propiedad) {
			this.getBanco().registrarSolicitudCredito(new CreditoHipotecario(this,monto,plazo,propiedad));
		}
}
