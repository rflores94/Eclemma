package Bisiesto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBisiesto {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMostrarSiBiesto() {
		Bisiesto.mostrarSiBisiesto(1600);//Divisible por4, por 100 y por 400. Bisiesto
		Bisiesto.mostrarSiBisiesto(1996);//Divisible entre 4 y No divisible por 100. Bisiesto
		Bisiesto.mostrarSiBisiesto(1995);//No divisible por 4. No bisiesto
		Bisiesto.mostrarSiBisiesto(2100);//Divisible por 4 y por 100 pero No entre 400. No bisiest0
		Bisiesto.mostrarSiBisiesto(1670);//No divisible entre 4. No bisiesto
	}

}
