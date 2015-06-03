package Muebles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMuebles {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Muebles mueble = new Muebles();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Muebles.mostrarMuebles("sillon");
		Muebles.mostrarMuebles("sofa");
		Muebles.mostrarMuebles("silla");
	}

}
