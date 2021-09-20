package ar.edu.unq.po2.tp2;

public final class Contratado extends Empleado{
	private int numeroContrato;
	private String medioDePago;  //p.Ej: cheque o transferencia bancaria a cuenta personal
	@Override
	protected int consultaSueldoBruto() {

		return this.getSueldoBasico();
	}
	@Override
	protected double retencionesAplicadas() {

		return 50;
	}
	@Override
	protected double costeObraSocial() {

		return 0;
	}
	@Override
	protected double costeAporteJubilatorio() {

		return 0;
	}
	@Override
	protected void consultaDeConceptos() {
		System.out.println("Sueldo Basico: " + this.getSueldoBasico());  
		System.out.println("Gastos Administrativos Contractuales -" + this.retencionesAplicadas());
		
	}
}
