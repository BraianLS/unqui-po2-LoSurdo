package ar.edu.unq.po2.tp9.ejercicio2;

public class Trigo implements Cultivo{

	@Override
	public double getGananciaAnual() {

		return 300;
	}

	@Override
	public double getGananciaAnualTrigo() {
		// TODO Auto-generated method stub
		return this.getGananciaAnual();
	}

	@Override
	public double getGananciaAnualSoja() {
		// TODO Auto-generated method stub
		return 0;
	}

}
