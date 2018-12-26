package dataAccess;

import java.text.ParseException;
import java.util.Vector;

public class DataAccessSingleton {
	private Vector <Customer> customers;
	private static DataAccessSingleton instance;
	
	// Singleton access method
	public static DataAccessSingleton getInstance() {
		if (instance != null)
			return instance;
		else {
			instance = new DataAccessSingleton();
			return instance;
		}	
	}
	
	// Constructor
	public DataAccessSingleton() {
		try {
			customers = fakeDatabaseLoader();
		} catch (ParseException e) {
			// Recovery code. Do not care about it. It will be improved in forthcoming releases
			e.printStackTrace();
		}
	}

	// Returns a customer by id
	public Customer getCustomer(int id) {
		for(Customer customer:customers) {
			if(customer.getId() == id)
				return customer;
		}
		return null;
	}
	
	// We will not use a real database. This method simulates that data are loaded
	// into the container class DataAccess. As there is no database, there are no updates
	
	//Debemos quitar el private del metodo para poder testearlo, por lo tanto lo dejaremos con visibilidad
	//a nivel de paquete.
	  Vector <Customer> fakeDatabaseLoader() throws ParseException {
		/*
		Order one_1 = new Order(100.0, true, false);
		Order one_2 = new Order(50.055, true, false);
		Order one_3 = new Order(25.0, false, false);
		Order one_4 = new Order(-25.0, true, true);
		
		Order two_1 = new Order(100.0, true, false);
		Order two_2 = new Order(50.055, true, false);
		Order two_3 = new Order(25.0, false, false);
		Order two_4 = new Order(-25.0, true, true);
		
		Vector <Order> orders = new Vector<Order>();
		
		orders.add(one_1);
		orders.add(one_2);
		orders.add(one_3);
		orders.add(one_4);
		
		Customer one = new Customer(1, 100.0, orders);
		
		orders = new Vector<Order>();
		
		orders.add(two_1);
		orders.add(two_2);
		orders.add(two_3);
		orders.add(two_4);
		
		Customer two = new Customer(2, 100.0, orders);
		
		Vector <Customer> customers = new Vector <Customer>();
		
		customers.add(one);
		customers.add(two);
		
		return customers;*/
		 return null;
	}
	
}
