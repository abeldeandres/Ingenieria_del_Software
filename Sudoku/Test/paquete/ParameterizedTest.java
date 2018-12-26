package paquete;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedTest {
	

	@Parameters(name = "Test {index} : Sudoku.verify({0}) = {1}")
	public static Collection<Object[]> myData() {
		return Arrays.asList(new Object[][] { {new String("6,3,2,7,8,1,9,4,5,4,8,7,5,9,6,2,1,3,5,1,9,2,4,3,8,7,6,8,6,4,3,5,2,7,9,1,7,5,1,9,6,8,3,2,4,2,9,3,1,7,4,6,5,8,9,4,5,6,3,7,1,8,2,1,7,6,8,2,5,4,3,9,3,2,8,4,1,9,5,6,7"), 0},
									   		  {new String("-6,3,2,7,8,1,9,4,5,4,8,7,5,9,6,2,1,3,5,1,9,2,4,3,8,7,6,8,6,4,3,5,2,7,9,1,7,5,1,9,6,8,3,2,4,2,9,3,1,7,4,6,5,8,9,4,5,6,3,7,1,8,2,1,7,6,8,2,5,4,3,9,3,2,8,4,1,9,5,6,7"), -1},
									   		  {new String("6,5,2,7,8,1,9,4,5,4,8,7,5,9,6,2,1,3,5,1,9,2,4,3,8,7,6,8,6,4,3,5,2,7,9,1,7,5,1,9,6,8,3,2,4,2,9,3,1,7,4,6,5,8,9,4,5,6,3,7,1,8,2,1,7,6,8,2,5,4,3,9,3,2,8,4,1,9,5,6,7"),-2},
									   		  {new String("6,8,2,7,8,1,9,4,5,4,3,7,5,9,6,2,1,3,5,1,9,2,4,3,8,7,6,8,6,4,3,5,2,7,9,1,7,5,1,9,6,8,3,2,4,2,9,3,1,7,4,6,5,8,9,4,5,6,3,7,1,8,2,1,7,6,8,2,5,4,3,9,3,2,8,4,1,9,5,6,7"), -3},
									   		  {new String("6,2,3,7,8,1,9,4,5,4,8,7,5,9,6,2,1,3,5,1,9,2,4,3,8,7,6,8,6,4,3,5,2,7,9,1,7,5,1,9,6,8,3,2,4,2,9,3,1,7,4,6,5,8,9,4,5,6,3,7,1,8,2,1,7,6,8,2,5,4,3,9,3,2,8,4,1,9,5,6,7"),-4},
									   		 });
	}
	
	private String n;
	private int result;
	
	public ParameterizedTest (String n, int result) {
		this.n = n;
		this.result = result;
	}
	
	@Test
	public void checkValue(){
		assertEquals(result, Sudoku.verify(n));
	}
}
