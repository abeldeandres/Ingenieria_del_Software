package miPaquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Anagrama {
	public ArrayList<String> arrayPalabras = new ArrayList<String>();
	
	public boolean esAnagrama(String palabra, String anagramas){  
        if(palabra.length() != anagramas.length()){
            return false;
        }
        char[] chars = palabra.toCharArray();       
        for(char c : chars){
            int index = anagramas.indexOf(Character.toLowerCase(c));
            if(index != -1){
            	anagramas = anagramas.substring(0,index) + anagramas.substring(index +1, anagramas.length());
            }else{
                return false;
            }           
        }
        return anagramas.isEmpty();
    }
	
	public ArrayList<String> metodoAnagrama(String palabra) throws FileNotFoundException, IOException{
		leerFichero();
		ArrayList<String> ListadoAnagramas = new ArrayList<String>();
		for(int i=0; i<arrayPalabras.size(); i++){
			String minuscula=arrayPalabras.get(i).toLowerCase();
			if(esAnagrama(palabra,minuscula)&&arrayPalabras.get(i).compareTo(palabra)!=0){
				ListadoAnagramas.add(arrayPalabras.get(i));
			}
		}
		return ListadoAnagramas;
	}
	
	public void leerFichero() throws FileNotFoundException, IOException {
		String archivo = "C:\\wordlist.txt";
		String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            arrayPalabras.add(cadena);
        }
        //System.out.println(arrayPalabras.get(0));
        b.close();
    }

}
