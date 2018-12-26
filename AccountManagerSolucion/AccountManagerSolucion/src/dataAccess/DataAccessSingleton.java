package dataAccess;

import java.text.ParseException;
import java.util.Vector;

public class DataAccessSingleton {
   protected Vector <Customer> customers;
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
	Vector <Customer> fakeDatabaseLoader() throws ParseException {
		return null;
	}
	
}
