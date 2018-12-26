package paquete;

public class Buscaminas {
	public static String leerString(String cadena){
		int n=4;
		int m=3;
		int i=0;
		char [][] matriz=stringAmatriz(cadena);
		int [][] matrizNum=new int [m][n];
		for (int k=0; k<m;k++){
			for(int j=0;j<n;j++){
				if(matriz[k][j]=='*'){
					matrizNum[k][j]=-1;
					if(k+1<m && matriz[k+1][j]!='*'){
						matrizNum[k+1][j]+=1;
					}
					if(k-1>-1 && matriz[k-1][j]!='*'){
						matrizNum[k-1][j]+=1;
					}
					if(j-1>-1 && matriz[k][j-1]!='*'){
						matrizNum[k][j-1]+=1;
					}
					if(j+1<n && matriz[k][j+1]!='*'){
						matrizNum[k][j+1]+=1;
					}
					if(j-1>-1 && k-1>-1 && matriz[k-1][j-1]!='*'){
						matrizNum[k-1][j-1]+=1;
					}
					if(j-1>-1 && k+1<m && matriz[k+1][j-1]!='*'){
						matrizNum[k+1][j-1]+=1;
					}
					if(j+1<n && k-1>-1 && matriz[k-1][j+1]!='*'){
						matrizNum[k-1][j+1]+=1;
					}
					
					if(j+1<n && k+1<m && matriz[k+1][j+1]!='*'){
						matrizNum[k+1][j+1]+=1;
					}				
				}			
			}
		}
		return matrizAstring(matrizNum);
	}

	public static char[][] stringAmatriz(String cadena){
		int n=4;
		int m=3;
		char matriz[][]=new char [m][n];
		int i=0;
		for (int k=0; k<m;k++){
			for(int j=0;j<n;j++){
				matriz[k][j]= cadena.charAt(i);
				i++;			
			}
		}
		return matriz;
	}
	
	public static String matrizAstring(int[][] matriz){
		String cadena="";
		for (int y = 0; y < 3; y++) {
			if (y>0){
			 cadena+="\n";
			}
			for (int j = 0; j < 4; j++) {
				if(matriz[y][j]==-1){
					cadena+='*';
				}else{
					cadena+=matriz[y][j];
				}
			}
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="*.....*....*";
		System.out.println(leerString(cadena));


	}
}
