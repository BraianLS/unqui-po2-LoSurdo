package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
		private Point esquinaSuperiorIzquierda;
		private int alto;
		private int ancho;
		
		public Point getEsquinaSuperiorIzquierda() {
			return esquinaSuperiorIzquierda;
		}

		public void getEsquinaSuperiorIzquierda(Point punto) {
			this.esquinaSuperiorIzquierda = punto;
		}

		public int getAlto() {
			return alto;
		}

		public void setAlto(int alto) {
			this.alto = alto;
		}

		public int getAncho() {
			return ancho;
		}

		public void setAncho(int ancho) {
			this.ancho = ancho;
		}
		
		public Rectangulo(Point punto, int alto, int ancho) {
			super();
			this.esquinaSuperiorIzquierda = punto;
			this.alto = alto;
			this.ancho = ancho;
			this.crearFormaGeometrica();
		}
		
		private void crearFormaGeometrica() {
			this.getEsquinaInferiorIzquierda();
			this.getEsquinaSuperiorDerecha();
			this.getEsquinaInferiorDerecha();
			
		}

		public Point getEsquinaInferiorIzquierda() {
			
			return esquinaSuperiorIzquierda.sumarPuntos(new Point(0, -this.getAlto()));
			
		}
		public Point getEsquinaSuperiorDerecha() {
			
			return esquinaSuperiorIzquierda.sumarPuntos(new Point(this.getAncho(), 0));
			
		}
		public Point getEsquinaInferiorDerecha() {
			
			return esquinaSuperiorIzquierda.sumarPuntos(new Point(this.getAncho(), -this.getAlto()));
			
		}

		public void reubicarEsquinaSuperiorIzquierdaEn(Point punto) {
			this.getEsquinaSuperiorIzquierda(punto);
			this.crearFormaGeometrica();
		}
		
		public int area() {
			return this.getAlto() * this.getAncho();
		}
		public int perimetro() {
			return this.getAncho() * 2 + this.getAlto() * 2;
		}
		public String orientacionDeFigura(){
			if(this.getAlto() > this.getAncho()) {return "Es vertical";}
			else {return "Es horizontal";}
		}
}
