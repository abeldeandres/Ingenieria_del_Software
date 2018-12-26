package paquete;

public class LCD {
	public static String displayLCD(int numero){
		// TODO Auto-generated method stub
				String cadena="";
				cadena=String.valueOf(numero);
				int numeroDeCaracteres = cadena.length();
				int[][][]caracteres = new int[numeroDeCaracteres][3][3];
				int[][] uno = {{0,0,0}, {0,0,1}, {0,0,1}};
				int[][] dos = {{0,1,0}, {0,1,1}, {1,1,0}};
				int[][] tres = {{0,1,0}, {0,1,1}, {0,1,1}};
				int[][] cuatro = {{0,0,0}, {1,1,1}, {0,0,1}};
				int[][] cinco = {{0,1,0}, {1,1,0}, {0,1,1}};
				int[][] seis = {{0,1,0}, {1,1,0}, {1,1,1}};
				int[][] siete = {{0,1,0}, {0,0,1}, {0,0,1}};
				int[][] ocho = {{0,1,0}, {1,1,1}, {1,1,1}};
				int[][] nueve = {{0,1,0}, {1,1,1}, {0,1,1}};
				int[][] cero = {{0,1,0}, {1,0,1}, {1,1,1}};
				int i, j, k;

				for(i=0; i<numeroDeCaracteres; i++){
				if(cadena.charAt(i)=='1') caracteres[i] = uno;
				else if(cadena.charAt(i)=='2') caracteres[i] = dos;
				else if(cadena.charAt(i)=='3') caracteres[i] = tres;
				else if(cadena.charAt(i)=='4') caracteres[i] = cuatro;
				else if(cadena.charAt(i)=='5') caracteres[i] = cinco;
				else if(cadena.charAt(i)=='6') caracteres[i] = seis;
				else if(cadena.charAt(i)=='7') caracteres[i] = siete;
				else if(cadena.charAt(i)=='8') caracteres[i] = ocho;
				else if(cadena.charAt(i)=='9') caracteres[i] = nueve;
				else if(cadena.charAt(i)=='0') caracteres[i] = cero;
				}
				String salida="";
				for (j = 0; j < 3; j++) {
					for (i = 0; i < numeroDeCaracteres; i++) {
						for (k = 0; k < 3; k++) {
							if (caracteres[i][j][k] == 1) {
								if (k == 1) salida+="_";
								else salida+="|";
							}
							else salida+=" ";
						}
						salida+=" ";
					}
					salida+="\n";
				}
				return salida;
	}
	
	public static void main(String[] args) {
		System.out.println(displayLCD(22));
	}


}
