package ar.edu.unq.po2.tp9.ejercicio2;

public class Soja implements Cultivo{

	@Override
	public double getGananciaAnual() {

		return 300;
	}

	@Override
	public double getGananciaAnualSoja() {
		// TODO Auto-generated method stub
		return this.getGananciaAnual();
	}

	@Override
	public double getGananciaAnualTrigo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregar(Cultivo cultivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Cultivo cultivo) {
		// TODO Auto-generated method stub
		
	}

}
