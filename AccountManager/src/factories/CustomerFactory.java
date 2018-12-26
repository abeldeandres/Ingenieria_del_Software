package factories;

import dataAccess.Customer;
import dataAccess.DataAccessSingleton;
import exceptions.NonExistingCustomer;



public class CustomerFactory {
	//NO hay forma para que pueda probarlo sin usar una base de datos de produccion.
	
	
	static DataAccessSingleton objeto;
	//Definimos un metodo estatico que va a ser public y void
	public static void definirObjetoAccesoABD(DataAccessSingleton objetoInyectado){
		//El singleton no va a ser necesario, aunque utilizaremos el objeto singleton. El singleton en si mismo
		//puede ser deshechado. Utilizaremos el objeto singleton como si no lo fuera.
		objeto=objetoInyectado;
	}
	static public void updateCustomerBalance(int id) throws NonExistingCustomer {
		Customer myCustomer = DataAccessSingleton.getInstance().getCustomer(id);
		if (myCustomer == null)
			throw new NonExistingCustomer();
		else
			myCustomer.updateBalance();
	}
	/*
	 * Ahora sustituimos la dependencia por el objeto que creamos anteriormente.Por lo tanto
	 * ya no utilizamos el Singleton
	 */
	static public void updateCustomerBalance1(int id) throws NonExistingCustomer {
		Customer myCustomer = objeto.getCustomer(id);
		if (myCustomer == null)
			throw new NonExistingCustomer();
		else
			myCustomer.updateBalance();
	}
	
}
