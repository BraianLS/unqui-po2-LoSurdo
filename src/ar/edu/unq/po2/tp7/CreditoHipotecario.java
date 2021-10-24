package ar.edu.unq.po2.tp7;

public class CreditoHipotecario extends SolicitudDeCredito{
	
	public CreditoHipotecario(Cliente cliente, int monto, int plazo, PropiedadInmobiliaria propiedad) {

		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
		this.propiedad = propiedad;
	}
	private PropiedadInmobiliaria propiedad;
	@Override
	protected boolean esSolicitudAprobable() {
		// TODO Auto-generated method stub
		return	!this.excedeElPorcentajeDeIngresosMensualesRequerido() && 
				!this.excedeElPorcentajeDelValorFiscalRequerido() &&
				!this.excedeLaEdadRequerida();
	}
	private boolean excedeElPorcentajeDeIngresosMensualesRequerido() {
		return this.getMontoCuotaMensual() > this.getCliente().getNetoMensual() * 0.5;
	}
	
	private boolean excedeElPorcentajeDelValorFiscalRequerido() {
		return this.getMonto() > propiedad.getValorFiscal() * 0.7;
	}
	private boolean excedeLaEdadRequerida() {
		return this.getCliente().getEdad() + this.getPlazo()/12 > 65;
	}
}
