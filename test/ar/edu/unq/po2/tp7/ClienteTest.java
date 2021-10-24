package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Banco bancoPata;
	private Cliente cliente1;
	private Cliente cliente2;

	@BeforeEach
	void setUp() throws Exception {
		bancoPata = new Banco();
		cliente1 = new Cliente("Javier","Rodriguez","Calle Falsa 123",37,7000,bancoPata);
		cliente2 = new Cliente("Analia","Tenaglia","Alberti 284",29,19000,bancoPata);
	}

	@Test
	void getSueldoAnualTest() {
		assertEquals(84000,cliente1.getSueldoAnual());

	}

}
