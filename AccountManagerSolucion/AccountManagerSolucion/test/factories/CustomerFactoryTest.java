package factories;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Vector;

import org.junit.Test;

import dataAccess.Customer;
import dataAccess.DataAccessSingletonDouble;
import exceptions.NonExistingCustomer;

public class CustomerFactoryTest {
	
	Customer c = new Customer(1, 100.0, null);
	
	@Test
	public void processExistingCustomer() throws NonExistingCustomer {
		DataAccessSingletonDouble d = new DataAccessSingletonDouble();
		CustomerFactory.definirObjectoAccesoABD(d);
		CustomerFactory.updateCustomerBalance(1);
		assertEquals(100.0, c.getBalance(), 0.001);
	}
	
	@Test(expected = NonExistingCustomer.class)
	public void sendExceptionOnNonExistingCustomer() throws NonExistingCustomer {
		DataAccessSingletonDouble d = new DataAccessSingletonDouble();
		CustomerFactory.definirObjectoAccesoABD(d);
		CustomerFactory.updateCustomerBalance(2);
	}

}
