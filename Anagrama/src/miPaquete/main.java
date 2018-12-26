package miPaquete;

import java.io.IOException;
import java.util.ArrayList;

public class main {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Anagrama anagrama = new Anagrama();
		ArrayList<String> ListadoFinal = new ArrayList<String>();
		ListadoFinal=anagrama.metodoAnagrama("warden");
		for(int i=0; i<ListadoFinal.size();i++){
			System.out.println(ListadoFinal.get(i));
		}
	}

}
