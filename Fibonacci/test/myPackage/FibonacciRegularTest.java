package myPackage;

import static org.junit.Assert.*;

import myPackage.Fibonacci;

import org.junit.Ignore;
import org.junit.Test;


public class FibonacciRegularTest {

	@Test
	public void value_0_returns_0() throws InvalidNumberException {
		assertEquals(0, Fibonacci.calculate(0));
	}

	@Test
	public void value_1_returns_exception() throws InvalidNumberException {
		assertEquals(1, Fibonacci.calculate(1));
	}

	@Test
	public void value_10_returns_55() throws InvalidNumberException {
		assertEquals(55, Fibonacci.calculate(10));
	}
	
	@Test 
	public void value_47_returns_2971215073() throws InvalidNumberException {
		assertEquals(2971215073L, Fibonacci.calculate(47));
	}

	@Test
	public void value_92_returns_7540113804746346429() throws InvalidNumberException {
		assertEquals(7540113804746346429L, Fibonacci.calculate(92));
	}
	
	@Test (expected = InvalidNumberException.class )
	public void value_93_Throws_Exception() throws InvalidNumberException {
		Fibonacci.calculate(93);
	}
	
	@Test (expected = InvalidNumberException.class )
	public void value_Minus_1_Throws_Exception() throws InvalidNumberException {
		Fibonacci.calculate(-1);
	}
}
