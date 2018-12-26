package paquete;

import static org.junit.Assert.*;

public class Test {
	LCD pruebas =new LCD();
	
	
	@org.junit.Test
	public void salidaCon2() {
		assertEquals(" _  \n _| \n|_  \n",pruebas.displayLCD(2));
	}
	
	@org.junit.Test
	public void salidaCon5() {
		assertEquals(" _  \n|_  \n _| \n",pruebas.displayLCD(5));
	}
	
	/*
	 * En las dos pruebas anteriores solo hemos tenido en cuenta los valores del 0 al 9
	 * es decir, un valor de mas de una cifra no funcionaria, solo cogeria la primera cifra.
	 * Ahora vamos a seguir la implementacion para añadirle mas funcionalidad (añadirle la posibilidad de
	 * poder escribir mas cifras).
	 */
	
	@org.junit.Test
	public void salidaCon50() {
		assertEquals(" _   _  \n|_  | | \n _| |_| \n",pruebas.displayLCD(50));
	} 
	
	@org.junit.Test
	public void salidaCon501() {
		assertEquals(" _   _      \n|_  | |   | \n _| |_|   | \n",pruebas.displayLCD(501));
	} 
	

}
