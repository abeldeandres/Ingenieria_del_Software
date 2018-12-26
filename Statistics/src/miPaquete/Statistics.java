package miPaquete;

public class Statistics {
	public static double calcularMedia(double[] a){
		double media=0;
		for (int i=0; i<a.length;i++){
			media=media+a[i];
		}
		media=media/a.length;
		return media;
	}
	
	public static double calcularVarianza(double[] a){
		double media=calcularMedia(a);
		double varianza=0;
		for(int i = 0 ; i<a.length; i++){
			   double rango;
			   rango = Math.pow(a[i]-media,2f);
			   varianza = varianza + rango;
			  }
		return varianza;
	}
	
	public static String histograma(double[] v) { 
        int[] rep = new int[v.length]; 
        String concatenacion="";
        for (int i = 0; i < v.length; i++) {
            int ca = 0; 
            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) {
                    ca++;
                }
            }
            if (rep[i] == 0) { 
                concatenacion+=v[i]+": ";
            	//System.out.print(v[i] + ": ");
                for (int k = 0; k < ca; k++) {
                	concatenacion=concatenacion+"*";
                }
                concatenacion+="\n";
                //System.out.println();
            }
            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) {
                    rep[j]++; 
                }
            }
        }
        return concatenacion;
	
	}
}