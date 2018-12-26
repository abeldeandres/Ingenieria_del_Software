package miPaquete;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test1() {
		Intervalo inter1 = new Intervalo("[",1,1,"]");
		Intervalo inter2 = new Intervalo("[",1,1,"]");
		assertTrue(inter1.contiene(inter2));
	}
	
	@org.junit.Test
	public void test2() {
		Intervalo inter1 = new Intervalo("[",1,2,"]");
		Intervalo inter2 = new Intervalo("[",1,4,"]");
		assertTrue(inter2.contiene(inter1));
	}
	
	@org.junit.Test
	public void test3() {
		Intervalo inter1 = new Intervalo("[",1,2,"]");
		Intervalo inter2 = new Intervalo("[",0,2,"]");
		assertTrue(inter2.contiene(inter1));
	}
	
	@org.junit.Test
	public void testDiferenciaMayor() {
		Intervalo inter1 = new Intervalo("[",0,2,"]");
		Intervalo inter2 = new Intervalo("[",1,3,"]");
		Intervalo interRes = new Intervalo("[",1,2,"]");
		assertEquals(0,interRes.compareTo(inter2.Interseccion(inter1)));
	}
	
	@org.junit.Test
	public void testDiferenciaMenor() {
		Intervalo inter1 = new Intervalo("[",0,2,"]");
		Intervalo inter2 = new Intervalo("[",-2,2,"]");
		Intervalo interRes = new Intervalo("[",0,2,"]");
		assertEquals(0,interRes.compareTo(inter2.Interseccion(inter1)));
	}
	
	@org.junit.Test
	public void testDiferencia() {
		Intervalo inter1 = new Intervalo("[",0,4,"]");
		Intervalo inter2 = new Intervalo("[",1,2,"]");
		Intervalo interRes = new Intervalo("[",1,2,"]");
		assertEquals(0,interRes.compareTo(inter2.Interseccion(inter1)));
	}

}
