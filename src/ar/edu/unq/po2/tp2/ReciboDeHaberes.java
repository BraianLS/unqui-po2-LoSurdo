package ar.edu.unq.po2.tp2;

import java.util.Calendar;

public class ReciboDeHaberes {
	// me pareci? buena idea hacer un atributo llamado empleado de tipo Empleado, y esta forma que permitir que se rellenen los dem?s atributos automaticamente
		private Empleado empleado;
		private String nombre = getEmpleado().getNombre(); 
		private String direccion = getEmpleado().getDireccion(); 
		private Calendar fechaDeEmision = Calendario.actualDate();
		private int sueldoBruto = getEmpleado().consultaSueldoBruto(); 
		private double sueldoNeto = getEmpleado().consultaSueldoNeto(); 
			
		public ReciboDeHaberes() {}
	/*	Si consigo estos datos del empleado, no necesito inicializar estas variables colocando los
	 *  valores manualmente en su creacion, pero no s? cual de las 2 formas seria "la correcta".
	 */
	//	public ReciboDeHaberes(Empleado empleado, String nombre, String direccion, Calendar fechaDeEmision, int sueldoBruto,double sueldoNeto) {
		public ReciboDeHaberes(Empleado empleado) {
		/* el constructor de eclipse me lo genera con un llamado a la superclase,
		no s? en que ocaciones ser? necesario realizar esto cuando la clase creada no hereda de nadie m?s */
			super();
			this.empleado = empleado;
		//	this.nombre = nombre;        
		//	this.direccion = direccion;
		//	this.fechaDeEmision = fechaDeEmision;
		//	this.sueldoBruto = sueldoBruto;
		//	this.sueldoNeto = sueldoNeto;
		}
		public Empleado getEmpleado() {
			return empleado;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Calendar getFechaDeEmision() {
			return fechaDeEmision;
		}
		public void setFechaDeEmision(Calendar fechaDeEmision) {
			this.fechaDeEmision = fechaDeEmision;
		}
		public int getSueldoBruto() {
			return sueldoBruto;
		}
		public void setSueldoBruto(int sueldoBruto) {
			this.sueldoBruto = sueldoBruto;
		}
		public double getSueldoNeto() {
			return sueldoNeto;
		}
		public void setSueldoNeto(double sueldoNeto) {
			this.sueldoNeto = sueldoNeto;
		}
		public void desgloceConceptos() {
			this.getEmpleado().consultaDeConceptos();
		}
		

		
}