package dataAccess;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void ProcessValidOrder() {
		Order o = new Order (100.0, true, false);
		Vector<Order> vo = new Vector<Order>();
		vo.add(o);
		Customer c = new Customer(1, 100.0, vo);
		c.updateBalance();
		assertEquals(0.0, c.getBalance(), 0.001);
	}
	
	@Test
	public void doNotProcessInvalidOrder() {
		Order o = new Order (100.001, false, true);
		Vector<Order> vo = new Vector<Order>();
		vo.add(o);
		Customer c = new Customer(1, 100.0, vo);
		c.updateBalance();
		assertEquals(100.0, c.getBalance(), 0.001);
	}
	
	@Test
	public void detectInvalidOrder() {
		Order o = new Order (100.001, true, true);
		Customer c = new Customer(1, 100.0, null);
		assertFalse(c.checkOrderAttributes(o));
	}

}
