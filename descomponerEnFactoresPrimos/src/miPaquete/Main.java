package miPaquete;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimerFactors pf= new PrimerFactors();
		List<Integer> lista = pf.generate(2);
		for(int x=0;x<lista.size();x++) {
			  System.out.println(lista.get(x));
			}
	}

}
