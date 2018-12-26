package dataAccess;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void ProcesaCorrectamenteOrdenValida() {
		Order o = new Order(100.0,true, false);
		Vector<Order> vo= new Vector<Order>();
		vo.add(o);
		Customer c=new Customer(1,100.0,vo);
		//tener una orden de 100 
		c.updateBalance();
		//balance del cliente es 0
		assertEquals(0.0,c.getBalance(),0.001);
	}
	
	@Test
	public void NoProcesaOrdenValida() {
		Order o = new Order(100.001,false, true);
		Vector<Order> vo= new Vector<Order>();
		vo.add(o);
		Customer c=new Customer(1,100.0,vo);
		//tener una orden de 100 
		c.updateBalance();
		//balance del cliente es 0
		assertEquals(100.0,c.getBalance(),0.001);
	}
	
	//El borra este metodo siguiente	
	@Test
	public void identificaYNoProcesaOrdenValida() {
		Order o = new Order(100.001,true, true);
		Vector<Order> vo= new Vector<Order>();
		vo.add(o);
		Customer c=new Customer(1,100.0,vo);
		//tener una orden de 100 
		c.updateBalance();
		//balance del cliente es 0
		assertEquals(100.0,c.getBalance(),0.001);
	}
	
	@Test
	public void detectaOrdenInvalida() {
		Order o = new Order(100.001,true, true);
		Customer c=new Customer(1,100.0,null);
		assertFalse(c.checkOrderAttributes(o));
	}

}
