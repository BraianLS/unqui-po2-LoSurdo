package ar.edu.unq.po2.tp3;

public class Point {
		int x = 0;
		int y = 0;
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
		public Point() {
			super();
			this.x = 0;
			this.y = 0;
		}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public void moverPunto(int nuevaX, int nuevaY) {
			this.x = nuevaX;
			this.y = nuevaY;
		}
		
		public Point sumarPuntos(Point punto) {
			Point nuevoPunto = new Point(this.x + punto.getX(), this.y + punto.getY());
			return nuevoPunto;
		}
		
		
}
