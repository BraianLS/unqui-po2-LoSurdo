package ar.edu.unq.po2.tp9.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public interface IShapeShifter {
	public IShapeShifter compose(IShapeShifter shapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	public void addShapeShifter(IShapeShifter shape);
	public void removeShapeShifter(IShapeShifter shape);
	public void setDeep(int i);
	public int getDeep();
	public void setListaDeShapeShifters(ArrayList<IShapeShifter> lista);
	public ArrayList<IShapeShifter> getListaDeShapeShifters();

}
