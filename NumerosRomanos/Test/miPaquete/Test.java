package miPaquete;

import static org.junit.Assert.*;

public class Test {
	NumerosRomanos nr= new NumerosRomanos();
	@org.junit.Test	
	public void test10() {
		assertEquals("X",nr.IntegerToRoman(10));
	}
	
	@org.junit.Test	
	public void test8() {
		assertEquals("VIII",nr.IntegerToRoman(8));
	}
	
	@org.junit.Test	
	public void test402() {
		assertEquals("CDII",nr.IntegerToRoman(402));
	}

}
