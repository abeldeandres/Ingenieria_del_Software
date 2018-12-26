package miPaquete;

import static org.junit.Assert.*;

public class Test {
	Sheet st = new Sheet();
	@org.junit.Test
	public void testAñadirCeldas() throws MiError {
		
		st.set("A1", "Hola");
		assertEquals("Hola", st.get("A1"));
	}
	
	@org.junit.Test
	public void testAñadirCeldas2() throws MiError {
		st.set("A2", "Adios");
		assertEquals("Adios", st.get("A2"));
	}
	
	@org.junit.Test
	public void testAñadirCeldas3() throws MiError {
		st.set("A3", "Prueba");
		assertEquals("Prueba", st.get("A3"));
	}
	
	@org.junit.Test
	public void testNoEncontrado() throws MiError {
		assertEquals("", st.get("A4"));
	}
	
	@org.junit.Test
	public void testEvaluar() throws MiError {
		st.set("A5", "");
		assertEquals("", st.evaluate("A5"));
	}
	
	@org.junit.Test
	public void testEvaluar1() throws MiError {
		st.set("A5", "Hola");
		assertEquals("Hola", st.evaluate("A5"));
	}
	
	@org.junit.Test
	public void testEvaluar2() throws MiError {
		st.set("A5", "=789");
		assertEquals("789", st.evaluate("A5"));
	}
	
	@org.junit.Test
	public void testEvaluar3Subcelda() throws MiError {
		st.set("A6", "=A7");
		st.set("A7", "=10");
		assertEquals("10", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluar4Subcelda() throws MiError {
		st.set("A6", "=6+A7");
		st.set("A7", "=10");
		assertEquals("16", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluar5Subcelda() throws MiError {
		st.set("A6", "=6+A7+A7");
		st.set("A7", "=10");
		assertEquals("26", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluar6Subcelda() throws MiError {
		st.set("A6", "=5+A7");
		st.set("A7", "=10+A8");
		st.set("A8", "=5");
		assertEquals("20", st.evaluate("A6"));
	}
	@org.junit.Test
	public void testEvaluar7Resta() throws MiError {
		st.set("A6", "=5-A7");
		st.set("A7", "=10-A8");
		st.set("A8", "=5");
		assertEquals("0", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluar8Multiplicacion() throws MiError {
		st.set("A6", "=5*A7");
		st.set("A7", "=10*A8");
		st.set("A8", "=5");
		assertEquals("250", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluar8Division() throws MiError {
		st.set("A6", "=50/A7");
		st.set("A7", "=10/A8");
		st.set("A8", "=2");
		assertEquals("10", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarNegativo() throws MiError {
		st.set("A5", "=-789");
		assertEquals("-789", st.evaluate("A5"));
	}
	@org.junit.Test
	public void testEvaluarResta1() throws MiError {
		st.set("A6", "=5-A7");
		st.set("A7", "=8");
		assertEquals("-3", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarResta2() throws MiError {
		st.set("A6", "=5-A7");
		st.set("A7", "=-8");
		assertEquals("13", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarRestaMultiplicacion() throws MiError {
		st.set("A6", "=-5*-2");
		assertEquals("10", st.evaluate("A6"));
	}
	@org.junit.Test
	public void testEvaluarRestaDivision() throws MiError {
		st.set("A6", "=-10/-2");
		assertEquals("5", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarString() throws MiError {
		st.set("A6", "'Hola'");
		assertEquals("Hola", st.evaluate("A6"));
	}
	@org.junit.Test
	public void testEvaluarString2() throws MiError {
		st.set("A6", "='Hola' & A7");
		st.set("A7", "'Adios'");
		assertEquals("Hola Adios", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarString3() throws MiError {
		st.set("A6", "='Hola' & A7 & A8");
		st.set("A7", "'Adios'");
		st.set("A8", "'Buenas'");
		assertEquals("Hola Adios Buenas", st.evaluate("A6"));
	}
	
	
	@org.junit.Test
	public void testEvaluar3() throws MiError {
		st.set("A6", "=1*2+3");
		assertEquals("5", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarConEspacio() throws MiError {
		st.set("A6", "    =   1   *   2    +     3");
		assertEquals("5", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarSumas() throws MiError {
		st.set("A1", "=1+A2+A3"); //1+9+17
		st.set("A2", "=3+6"); // 9
		st.set("A3", "=A5"); //17
		st.set("A5", "=8+A2"); //8+9=17
		assertEquals("27", st.evaluate("A1"));
	}
	
	@org.junit.Test
	public void testEvaluarParentesis() throws MiError {
		st.set("A6", "=(6+(5-10))");
		assertEquals("1", st.evaluate("A6"));
	}
	
	@org.junit.Test
	public void testEvaluarParentesis2() throws MiError {
		st.set("A6", "=(B3+(5-10))");
		st.set("B3", "=7");
		assertEquals("2", st.evaluate("A6"));
	}
	
	
	
	
}
