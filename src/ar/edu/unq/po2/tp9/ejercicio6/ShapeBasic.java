package ar.edu.unq.po2.tp9.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ShapeBasic extends ShapeShifter{
	/* Pensé en la necesidad de agregar este ShapeBasic para poder darle la distincion del otro al 
	 * tener una lista con el valor,y una profundidad
	
	*/
		
		private int deep = 0;
		private ArrayList<Integer> value;
		
		public int getDeep() {
			return deep;
		}

		public void setDeep(int deep) {
			this.deep = deep;
		}

		public ShapeBasic(Integer number) {
			super();
			this.value = new ArrayList<Integer>();
			value.add(number);
		}


		@Override
		public ShapeShifter compose(IShapeShifter shapeShifter) {
			ShapeShifter nuevoShape = new ShapeShifter();
			nuevoShape.addShapeShifter(this);
			nuevoShape.addShapeShifter(shapeShifter);
			return nuevoShape;
		}


		@Override
		public int deepest() {
			int deepest = deep;
			deep = 0;
			return deepest;
		}

		@Override
		public IShapeShifter flat() {
			return this;
		}


		@Override
		public List<Integer> values() {
			ArrayList<Integer> values = new ArrayList<Integer>();
			values = value;
			return values;
		}



		@Override
		public void addShapeShifter(IShapeShifter shape) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void removeShapeShifter(IShapeShifter shape) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setListaDeShapeShifters(ArrayList<IShapeShifter> lista) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public ArrayList<IShapeShifter> getListaDeShapeShifters() {
			ArrayList<IShapeShifter> comoLista = new ArrayList<IShapeShifter>();
			comoLista.add(this);
			return comoLista;
			
		}
		
	
}
