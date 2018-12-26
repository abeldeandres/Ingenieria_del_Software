package paquete;

public class Sudoku {
	public static int verify(String candidateSolution){
		int[][] matriz =new int[9][9];
		String[] msg=candidateSolution.split(",");
		int i=0;
		for (int k=0; k<9;k++){
			for(int j=0;j<9;j++){
				matriz[k][j]= Integer.parseInt(msg[i]);
				i++;			
			}
		}
		
		int tamañoMatriz = matriz.length;
	    
	    // Comprobamos que el string esta relleno de numeros entre 0 y 9 (obviamente positivos)
	    if (!comprobarNumerosPositivosYMenoresDe10(matriz))
	    {
	      return -1;
	    }
	    
	    // Comprobamos que los sub-cuadrados no contienen valores duplicados
	    for (int filaBase = 0; filaBase < tamañoMatriz; filaBase += 3)
	    {
	      for (int columnaBase = 0; columnaBase < tamañoMatriz; columnaBase += 3)
	      {
	        if (!comprobarCuadrado(matriz, filaBase, columnaBase))
	        {
	          return -2;
	        }
	      }
	    }
	    
	    // Comprobamos que las filas no contienen valores duplicados
	    for (int fila = 0; fila < tamañoMatriz; ++fila)
	    {
	      if (!comprobarFila(matriz, fila))
	      {
	        return -3;
	      }
	    }
	    
	    // Comprobamos que las columnas no contienen valores duplicados
	    for (int col = 0; col < tamañoMatriz; ++col)
	    {
	      if (!comprobarColumna(matriz, col))
	      {
	        return -4;
	      }
	    }
	    
	    
	    // Devolvemos 0 si todo ha ido bien
	    return 0;



	}
	
	private static boolean comprobarNumerosPositivosYMenoresDe10(int[][] matriz){
		for (int n = 0; n < 9;n++){//Columnas
			 for(int z = 0;z < 9;z++){//Filas
				 if(matriz[n][z]<0 ||matriz[n][z] >10){
					 return false;
				 }			  
			 }
		} 
		return true;
	}
	
	 private static boolean comprobarFila(int[][] matriz, int fila)
	  {
	    final int tamaño = matriz.length;
	    boolean[] encontrado = new boolean[tamaño];
	    for (int col = 0; col < tamaño; ++col)
	    {
	      int index = matriz[fila][col] - 1;
	      if (!encontrado[index])
	      {
	    	  encontrado[index] = true;
	      }
	      else
	      {
	        // Si se encuentra algun elemento repetido en la fila, devolvemos false
	        return false;
	      }
	    }
	    
	    // En caso contrario devolvemos true
	    return true;
	  }
	 
	 private static boolean comprobarColumna(int[][] matriz, int columna)
	  {
	    final int tamaño = matriz.length;
	    boolean[] encontrado = new boolean[tamaño];
	    for (int fila = 0; fila < tamaño; ++fila)
	    {
	      int index = matriz[fila][columna] - 1;
	      if (!encontrado[index])
	      {
	    	  encontrado[index] = true;
	      }
	      else
	      {
	        // Si se encuentra algun elemento repetido devolvemos false
	        return false;
	      }
	    }
	    
	    // Si no se encuentra ningun elemento repetido devolvemos true
	    return true;
	  }
	 
	 private static boolean comprobarCuadrado(int[][] matriz, int filaBase, int columnaBase)
	  {
		int tamañoCuadrado=3;
	    boolean[] encontrado = new boolean[matriz.length];
	    for (int fila = filaBase; fila < (filaBase + tamañoCuadrado); ++fila)
	    {
	      for (int col = columnaBase; col < (columnaBase + tamañoCuadrado); ++col)
	      {
	        int index = matriz[fila][col] - 1;
	        if (!encontrado[index])
	        {
	        	encontrado[index] = true;
	        }
	        else
	        {
	          return false;
	        }
	      }
	    }
	    
	    return true;
	  }
	

}
