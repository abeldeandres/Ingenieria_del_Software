package dataAccess;

import java.text.ParseException;
import java.util.Vector;

public class DataAccessSingletonDouble extends DataAccessSingleton {

	
	@Override
	 Vector<Customer> fakeDatabaseLoader() throws ParseException{
		Vector<Customer> vc = new Vector <Customer>();
		Order o = new Order(100.0, true, false);
		Vector<Order> vo = new Vector<Order>();
		vo.add(o);
		Customer c = new Customer(1,100.0,null);
		vc.add(c);
		return vc;
	}
}
