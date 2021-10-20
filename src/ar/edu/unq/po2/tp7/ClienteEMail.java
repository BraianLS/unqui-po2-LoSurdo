package ar.edu.unq.po2.tp7;


public class ClienteEMail {
	
	private ServidorPop servidor;
	private String nombreUsuario;
	private String passusuario;
	private CasillaDeCorreos casilla;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.casilla = new CasillaDeCorreos();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){ //Nota: Este metodo manda un mensaje a otro metodo que retorna una List<Correo> pero este metodo no lo utiliza,y no retorna nada.Entiendo que es a fin demostrativo y didactico, pero me parecio interesante remarcar el detalle. 
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

	public CasillaDeCorreos getCasilla() {
		return casilla;
	}
	

}