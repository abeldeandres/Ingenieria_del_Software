package miPaquete;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	Anagrama anagrama = new Anagrama();
	

	

	@org.junit.Test
	public void test1() {
		 assertTrue(anagrama.esAnagrama("word", "wrdo"));
	}
	
	@org.junit.Test
	public void test2() {
	     assertTrue(anagrama.esAnagrama("mary", "army"));
	}
	
	@org.junit.Test
	public void test3Lista() throws FileNotFoundException, IOException {
		List<String> lista = new ArrayList<String>();
		lista.add("amen");
		lista.add("mane");
		lista.add("mean");
	     assertEquals(lista,anagrama.metodoAnagrama("name"));
	}
	
	@org.junit.Test
	public void test3ListaMayusculas() throws FileNotFoundException, IOException {
		List<String> lista = new ArrayList<String>();
		lista.add("wander");
		lista.add("warden");
		lista.add("warned");
	     assertEquals(lista,anagrama.metodoAnagrama("Andrew"));
	}


}
