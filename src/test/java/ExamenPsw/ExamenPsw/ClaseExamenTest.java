package ExamenPsw.ExamenPsw;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ClaseExamenTest {
	public ClaseExamen test;
	public List listaTest;
	
	@Before
	public void setUp() throws Exception {
		test = new ClaseExamen();
		listaTest = new ArrayList();
	}

	@Test
	public void test() {
		listaTest.add(2);
		listaTest.add(3);
		assertEquals(listaTest, test.primos(6));
	}
	
	@Test
	public void test1() {
		listaTest.add(5);
		listaTest.add(5);
		assertEquals(listaTest, test.primos(25));
	}
	
	@Test 
	public void test2() {
		listaTest.add(13);
		assertEquals(listaTest, test.primos(13));
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testInvalid() {
		test.primos(1);
	}
	

}
