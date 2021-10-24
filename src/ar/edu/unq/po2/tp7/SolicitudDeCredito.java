package ar.edu.unq.po2.tp7;

public abstract class SolicitudDeCredito {
	protected Cliente cliente;
	protected int monto;
	protected int plazo;
	public Cliente getCliente() {
		return cliente;
	}
	public int getMonto() {
		return monto;
	}
	public int getPlazo() {
		return plazo;
	}
	
	public double getMontoCuotaMensual() {
		return this.getMonto() / this.getPlazo();
	}
	protected abstract boolean esSolicitudAprobable();
}
