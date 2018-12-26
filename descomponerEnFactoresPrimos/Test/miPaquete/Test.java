package miPaquete;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
	PrimerFactors pf = new PrimerFactors();
	List<Integer> lista = new ArrayList<Integer>();
	
	private List<Integer> lista(int... entero){
		List<Integer> lista = new ArrayList<Integer>();
		for(int i : entero){
			lista.add(i);
		}
		return lista;
	}
	
	@org.junit.Test
	public void test() {
		assertEquals(lista(), pf.generate(1));
	}
	
	@org.junit.Test
	public void testTwo(){
		assertEquals(lista(2), pf.generate(2));
	}
	
	@org.junit.Test
	public void testThree(){
		assertEquals(lista(3), pf.generate(3));
	}
	
	@org.junit.Test
	public void testCuatro(){
		assertEquals(lista(2,2), pf.generate(4));
	}
	
	@org.junit.Test
	public void test115(){
		assertEquals(lista(5,23), pf.generate(115));
	}
	
	@org.junit.Test
	public void test220(){
		assertEquals(lista(2,2,5,11), pf.generate(220));
	}

}
