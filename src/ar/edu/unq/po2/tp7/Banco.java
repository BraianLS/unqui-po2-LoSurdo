package ar.edu.unq.po2.tp7;

public class Banco {


		private GestionClientes gestionClientes;
		private EvaluadorDeCredito evaluador;
		
		public GestionClientes getGestionClientes() {
			return gestionClientes;
		}

		public EvaluadorDeCredito getEvaluador() {
			return evaluador;
		}


		public Banco() {
			super();
			this.gestionClientes = new GestionClientes();
			this.evaluador = new EvaluadorDeCredito();
		}
		public void agregarCliente(Cliente cliente) {
			this.getGestionClientes().agregarCliente(cliente);
		}
		public void registrarSolicitudCredito(SolicitudDeCredito solicitud) {
				this.getEvaluador().agregarSolicitud(solicitud);
		}
		public void procesarSolicitud(Cliente cliente) {
			evaluador.procesarSolicitud(this, cliente);
		}
		public double getMontoTotalADesembolsar() {
			double montoTotal = 0;
			for(SolicitudDeCredito solicitud: this.getEvaluador().getListaSolicitudesAprobables()) {
				montoTotal += solicitud.getMonto();
			}
			return montoTotal;
		}
		
		public void desembolsar(Cliente cliente, double monto) {
			//Este metodo se encarga de dar el aviso de dar al cliente el monto en efectivo una vez que su credito fue aprobado.
			//Lo representaré con un println
			System.out.println("El credito solicitado por el cliente " + cliente + " con un valor de " + monto + " ha sido aprobado.");
		}
		
		
}
