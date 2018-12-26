package miPaquete;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StatisticsParameterizedTest {
	

	@Parameters(name = "Test {index} : Average.calcularMedia({0}) = {1}")
	public static Collection<Object[]> myData() {
		return Arrays.asList(new Object[][] { {new double[] {2,1}, 1.5},
									   		  {new double[] {3,3}, 3}, 
									   		 });
	}
	
	private double[] n;
	private double result;
	
	public StatisticsParameterizedTest (double[] n, double result) {
		this.n = n;
		this.result = result;
	}
	
	@Test
	public void checkValue(){
		assertEquals(result, Statistics.calcularMedia(n),0.01);
	}
}
