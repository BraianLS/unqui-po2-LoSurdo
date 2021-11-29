package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.ejercicio6.IShapeShifter;
import ar.edu.unq.po2.tp9.ejercicio6.ShapeBasic;
import ar.edu.unq.po2.tp9.ejercicio6.ShapeShifter;

class ShapeShifterTest {
	private ShapeBasic a;
	private ShapeBasic b;
	private ShapeShifter c;
	private ShapeShifter d;
	private ShapeShifter e;
	private ShapeBasic tres;
	private ShapeBasic cinco;
	private ShapeBasic seis;
	private ShapeShifter f;
	@BeforeEach
	void setUp() throws Exception {
		a = new ShapeBasic(1);
		b = new ShapeBasic(2);
		tres = new ShapeBasic(3);
		cinco = new ShapeBasic(5);
		seis = new ShapeBasic(6);
		c = a.compose(b);
		d = tres.compose(c);
		e = cinco.compose(seis);
		f = d.compose(e);
		
	}

	@Test
	void deepestTest() {
		assertEquals(3, f.deepest());
		assertEquals(1, e.deepest());
		assertEquals(1, c.deepest());
		assertEquals(2, d.deepest());
		assertEquals(0, a.deepest());
		assertEquals(0, b.deepest());
	}
	@Test
	void flatTest() {
		IShapeShifter achatado = a.flat();
		assertEquals(0, achatado.deepest());
		achatado = c.flat();
		assertEquals(1, achatado.deepest()); 
		IShapeShifter achatado2 = f.flat();
		assertEquals(1, achatado2.deepest());
		assertEquals(3, f.deepest());

	}
	@Test
	void valuesTest() {
		ArrayList<Integer> esperado = new ArrayList<Integer>();
		esperado.add(1);
		assertEquals(esperado, a.values());
		esperado.add(2);
		assertEquals(esperado, c.values());
		esperado.add(0, 3);
		esperado.add(5);
		esperado.add(6);
		assertEquals(esperado, f.values());

	}

}
