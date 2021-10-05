package ar.edu.unq.po2.tp5;

public class FacturaImpuestos  extends Factura{
	private double tasaServicio;
	
	public void setTasaServicio(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	
	
	
	public FacturaImpuestos(double tasaServicio) {
		super();
		this.tasaServicio = tasaServicio;
	}



	@Override
	public double getPrecioBase() {
		return this.precioBase = tasaServicio;
	}

}
