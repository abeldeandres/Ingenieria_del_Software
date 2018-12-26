package miPaquete;

import static org.junit.Assert.*;

import org.junit.Test;




public class StatisticsRegularTest {
	
	
	@Test
	public void media1(){
		double[] arr = {3,3};
		assertEquals(3, Statistics.calcularMedia(arr),0.01);
	}
	
	@Test
	public void media2(){
		double[] arr = {1,2};
		assertEquals(1.5, Statistics.calcularMedia(arr),0.01);
	}
	
	@Test
	public void varianza1(){
		double[] arr = {3,3};
		assertEquals(0, Statistics.calcularVarianza(arr),0.01);
	}
	
	@Test
	public void varianza2(){
		double[] arr = {1,2};
		assertEquals(0.5, Statistics.calcularVarianza(arr),0.01);
	}
	
	@Test
	public void testHistograma(){
		double[] arr = {1,2};
		String str="1.0: *\n2.0: *\n";
		assertNotNull(Statistics.histograma(arr));
		assertEquals("", str, Statistics.histograma(arr));
	}

}
