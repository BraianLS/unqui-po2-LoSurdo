package ar.edu.unq.po2.tp5;

public class FacturaServicios extends Factura{
	protected double costoPorUnidad;
	protected int cantidadUnidadesConsumidas;
	
	
	public FacturaServicios(double costoPorUnidad, int cantidadUnidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}


	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}


	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}


	public int getCantidadUnidadesConsumidas() {
		return cantidadUnidadesConsumidas;
	}


	public void setCantidadUnidadesConsumidas(int cantidadUnidadesConsumidas) {
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}

	@Override
	public double getPrecioBase() {
		return this.getCostoPorUnidad() * this.getCantidadUnidadesConsumidas();
	}
}
