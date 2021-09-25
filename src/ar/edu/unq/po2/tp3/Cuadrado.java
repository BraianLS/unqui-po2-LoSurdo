package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{

	public Cuadrado(Point punto, int lado) {
		super(punto, lado, lado);
	}
	
	@Override
	public String orientacionDeFigura(){
		return "Es un cuadrado,no posee orientacion o las posee ambas al mismo tiempo,usted elija";
	}
	
}
