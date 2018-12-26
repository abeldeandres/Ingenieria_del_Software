package paquete;

import static org.junit.Assert.*;



public class Test {
	Buscaminas busca = new Buscaminas();
	@org.junit.Test
	public void testStringAMatriz() {
		String cadena="*.....*.....";
		char [][] numeros = {{'*','.','.','.'}, {'.','.','*','.'}, {'.','.','.','.'}};
		assertEquals(numeros,busca.stringAmatriz(cadena));
	}
	@org.junit.Test
	public void testMatrizAString() {
		String cadena="*.....*.....";
		int [][] numeros = {{-1,2,1,1}, {1,2,-1,1}, {0,1,1,1}};
		assertEquals("-121112-110111",busca.matrizAstring(numeros));
	}
	
	@org.junit.Test
	public void testBuscaminas1() {
		String cadena="*.....*.....";
		assertEquals("*211\n12*1\n0111",busca.leerString(cadena));
	}
	
	@org.junit.Test
	public void testBuscaminas2() {
		String cadena="*.....*....*";
		assertEquals("*211\n12*2\n012*",busca.leerString(cadena));
	}
	
	
	
	
}
