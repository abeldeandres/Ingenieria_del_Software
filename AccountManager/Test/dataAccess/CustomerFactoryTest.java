package dataAccess;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.NonExistingCustomer;
import factories.CustomerFactory;

public class CustomerFactoryTest {

	@Test
	public void cliente1TieneBalanceCeroDespuesDeProcesamiento() throws NonExistingCustomer {
		DataAccessSingletonDouble d = new DataAccessSingletonDouble();
		CustomerFactory.definirObjetoAccesoABD(d);
		CustomerFactory.updateCustomerBalance(1);
		assertEquals(0,d.getCustomer(1).getBalance(),0.001);
	}

}
