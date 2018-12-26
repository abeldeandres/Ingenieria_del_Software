package dataAccess;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Vector;

import org.junit.Test;

public class DataAccessSingletonTest {


	
	@Test
	public void seRetornaElCliente1(){
		DataAccessSingletonDouble dtest = new DataAccessSingletonDouble();
		Customer c = dtest.getCustomer(1);
		assertEquals(1,c.getId());
	}

}
