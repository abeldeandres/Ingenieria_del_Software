package dataAccess;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testCorrectInstantiation() {
		Order o = new Order(100.0, true, true);
		assertEquals(100.0, o.getAmount(),0.01);
		assertTrue(o.isValid());
		assertTrue(o.wasProcessed());
		/* 
		 * El caso se compone de 3 asserciones
		 * */
		
	}

}
