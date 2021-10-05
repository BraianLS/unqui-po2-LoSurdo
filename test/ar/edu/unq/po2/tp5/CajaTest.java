package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTest {
	
	private Caja caja;
	private ProductoCooperativa arroz;
	private ProductoTradicional detergente;
	private ProductoTradicional mayoliva;
	private ProductoTradicional chorizo;
	private ProductoTradicional bondiola;
	private FacturaImpuestos arba;
	private FacturaServicios gas;
	
	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoCooperativa("Arroz", 18.9d,4,10);
		detergente = new ProductoTradicional("Detergente", 75d,15);
		mayoliva = new ProductoTradicional("Mayonesa Oliva",60d,20);
		chorizo = new ProductoTradicional("Chorizos el Destor",150,1000);
		bondiola = new ProductoTradicional("Bondiola Ahumada Cerranito",100,900);
		arba = new FacturaImpuestos(2000);
		gas = new FacturaServicios(10,30);
		caja = new Caja();
	}
	
	@Test
	void cajaMontoTotalTest() {
		caja.registrar(arroz);
		assertEquals(17.01,caja.getMontoTotal(),1);//probando el funcionamiento de los margenes de error
		
		caja.registrar(detergente);
		assertEquals(92.01,caja.getMontoTotal(),0.0000000000001);
		
		caja.registrar(mayoliva);
		assertEquals(152.01,caja.getMontoTotal(),0.0000000000001);
		
	}
	@Test
	void pagoDeCuentasYProductosTest() {
		caja.registrar(chorizo);
		caja.registrar(chorizo);
		caja.registrar(bondiola);
		caja.registrar(arba);
		caja.registrar(gas);
		
		assertEquals(2700,caja.getMontoTotal());
		assertEquals(998, chorizo.getStock());
		assertEquals(899, bondiola.getStock());
	}

}
