package factories;

import dataAccess.Customer;
import dataAccess.DataAccessSingleton;
import exceptions.NonExistingCustomer;

public class CustomerFactory {
	
	static DataAccessSingleton objeto;

	static public void definirObjectoAccesoABD
		(DataAccessSingleton objetoInyectado) {
		objeto = objetoInyectado;
	}
	
	static public void updateCustomerBalance(int id) throws NonExistingCustomer {
		Customer myCustomer = objeto.getCustomer(id);
		if (myCustomer == null)
			throw new NonExistingCustomer();
		else
			myCustomer.updateBalance();
	}
	
}
