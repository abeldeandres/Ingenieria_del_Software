package myPackage;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciParameterizedTest {

	private int n;
	private long result;
	
	public FibonacciParameterizedTest (int n, long result) {
		this.n = n;
		this.result = result;
	}
	
	@Parameters(name = "Test {index} : Fibonacci.calculate({1}) = {0}")
	public static Collection<Object[]> myData() {
		return Arrays.asList(new Object[][] { {0, 0},
									   		  {1, 1}, 
									   		  {10, 55},
									   		  {47, 2971215073L},
									   		  {92, 7540113804746346429L}});
	}
	
	@Test
	public void checkValue() throws InvalidNumberException {
		assertEquals(result, Fibonacci.calculate(n));
	}

}
