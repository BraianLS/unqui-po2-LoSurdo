package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad lecheConMenosDescuento;
	private ProductoPrimeraNecesidad arroz;
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		lecheConMenosDescuento = new ProductoPrimeraNecesidad("Leche", 8d, false,11);
		arroz = new ProductoPrimeraNecesidad("Arrozcito Alegre", 18.9d, false,8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		assertEquals(7.12, lecheConMenosDescuento.getPrecio());
		assertEquals(17.388, (double)Math.round(arroz.getPrecio() * 100000d) / 100000d);
	}
	
}
