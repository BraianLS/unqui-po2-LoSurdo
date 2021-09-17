package ar.edu.unq.po2.tp2;

import java.util.Date;

public class ReciboDeHaberes {
	// me pareció buena idea hacer un atributo llamado empleado de tipo Empleado, y esta forma que permitir que se rellenen los demás atributos automaticamente
		private Empleado empleado;
		private String nombre = getEmpleado().getNombre(); 
		private String direccion = getEmpleado().getDireccion(); 
		private Date fechaDeEmision;
		private int sueldoBruto = getEmpleado().consultaSueldoBruto(); 
		private double sueldoNeto = getEmpleado().consultaSueldoNeto(); 
			
		public ReciboDeHaberes() {}
	//	Si consigo estos datos del empleado, no necesito inicializar estas variables colocando los valores manualmente en su creacion, pero no sé cual de las 2 formas seria "la correcta".
	//	public ReciboDeHaberes(Empleado empleado, String nombre, String direccion, Date fechaDeEmision, int sueldoBruto,double sueldoNeto) {
		public ReciboDeHaberes(Empleado empleado, Date fechaDeEmision) {
		/* el constructor de eclipse me lo genera con un llamado a la superclase,
		no sé en que ocaciones será necesario realizar esto cuando la clase creada no hereda de nadie más */
			super();
			this.empleado = empleado;
		//	this.nombre = nombre;        
		//	this.direccion = direccion;
			this.fechaDeEmision = fechaDeEmision;
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
		public Date getFechaDeEmision() {
			return fechaDeEmision;
		}
		public void setFechaDeEmision(Date fechaDeEmision) {
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