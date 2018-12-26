package miPaquete;

import java.util.ArrayList;
import java.util.List;

public class PrimerFactors {
	public List<Integer> generate(int n){
		List<Integer> lista = new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
            while(n%i==0){
                if(n!=1){
                	n=n/i;
                    lista.add(i);
                }
            }
        }
		return lista;
	}
}
