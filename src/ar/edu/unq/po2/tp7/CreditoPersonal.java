package ar.edu.unq.po2.tp7;

public class CreditoPersonal extends SolicitudDeCredito{

	
	
	public CreditoPersonal(Cliente cliente, int monto, int plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}

	@Override
	protected boolean esSolicitudAprobable() {
		// TODO Auto-generated method stub
		return 	this.getCliente().getSueldoAnual() >= 15000 &&
				!this.excedeElPorcentajeDeIngresosMensualesRequerido();
	}
	
	private boolean excedeElPorcentajeDeIngresosMensualesRequerido() {
		return this.getMontoCuotaMensual() > this.getCliente().getNetoMensual() * 0.7;
	}
}
