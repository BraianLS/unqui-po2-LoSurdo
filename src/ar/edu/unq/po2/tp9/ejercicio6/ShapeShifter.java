package ar.edu.unq.po2.tp9.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifter implements IShapeShifter{

	private int deep = 0;
	private ArrayList<IShapeShifter> listaDeShapeShifters; 
	
	public int getDeep() {
		return deep;
	}

	public void setDeep(int deep) {
		this.deep = deep;
	}
	
	public ArrayList<IShapeShifter> getListaDeShapeShifters() {
		return listaDeShapeShifters;
	}

	public void setListaDeShapeShifters(ArrayList<IShapeShifter> listaDeShapeShifters) {
		this.listaDeShapeShifters = listaDeShapeShifters;
	}

	public ShapeShifter() {
		super();
		this.listaDeShapeShifters = new ArrayList<IShapeShifter>();
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
		MaxSearcher maxSearcher = new MaxSearcher();
		int deepest = deep;
		for(IShapeShifter shape: listaDeShapeShifters) {
			shape.setDeep(this.getDeep() + 1);
			maxSearcher.add(shape.deepest());
		}
		deep = 0;
		deepest = maxSearcher.max();
		return deepest;
		
	}

	@Override
	public IShapeShifter flat() {
		if(this.deepest() >= 1) { //Esto todavia no hace lo que quiero que haga xD
				IShapeShifter nuevoShape = new ShapeShifter();
				for(IShapeShifter shape: listaDeShapeShifters) {
					for(IShapeShifter subShape: shape.getListaDeShapeShifters()) { //este FOR Each anidado quizas se podria separar en una subtarea,y mediante otra subtarea hacer que se concatenen las listas
						nuevoShape.addShapeShifter(subShape.flat()); 
					}
				}
			return nuevoShape; 
		}
		else{return this;}
	}
	@Override
	public List<Integer> values() { //este values se podria realizar utilizando flat para simplemente pedirle los values al nuevo shapeShifter que fue creado.
		ArrayList<Integer> values = new ArrayList<Integer>(); 
		 for(IShapeShifter shape: listaDeShapeShifters) {
			 for(Integer numero: shape.values()) {
				 values.add(numero);
			 }
		}
		return values;
	}
	@Override
	public void addShapeShifter(IShapeShifter shape) {
		listaDeShapeShifters.add(shape);
		
	}

	@Override
	public void removeShapeShifter(IShapeShifter shape) {
		listaDeShapeShifters.remove(shape);
		
	}
	
	

}
