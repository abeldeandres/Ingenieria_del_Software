package dataAccess;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Vector;

import org.junit.Test;

public class DataAccessSingletonTest {

	@Test
	public void returnCustomer1() {
		DataAccessSingletonDouble dtest = new DataAccessSingletonDouble();
		Customer c = dtest.getCustomer(1);
		assertSame(1, c.getId());
	}
	
	@Test
	public void returnNull() {
		DataAccessSingletonDouble dtest = new DataAccessSingletonDouble();
		Customer c = dtest.getCustomer(2);
		assertNull(c);
	}
	
}
