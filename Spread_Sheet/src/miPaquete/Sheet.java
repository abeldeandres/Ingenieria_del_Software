package miPaquete;

import java.util.ArrayList;

public class Sheet {
	ArrayList<Cell> arrayCeldas = new ArrayList<Cell>();

	public String get(String cell){
		boolean bandera=false;
		int i=0;
		String contenido="";
		while (!bandera && i<arrayCeldas.size()){		
			if(arrayCeldas.get(i).getCell().equals(cell)){
				bandera=true;
				contenido=arrayCeldas.get(i).getContents();
			}
			i++;
		}
		return contenido;
	}



	public void set(String cell, String contents){
		Cell celda = new Cell(cell,contents);
		arrayCeldas.add(celda);
	}


	public String evaluate(String cell) throws MiError{
		String contenidoFinal="";
		String cadenaContenido="";
		boolean negativo=false;
		boolean string=false;	
		cadenaContenido=get(cell);
		cadenaContenido=cadenaContenido.replaceAll("\\s+","");


		if (cadenaContenido=="") return "";
		if(cadenaContenido.indexOf("=-")!=-1){
			StringBuilder sb = new StringBuilder(cadenaContenido);
			sb.deleteCharAt(1);
			cadenaContenido = sb.toString();
			negativo=true;
		}
		if(cadenaContenido.indexOf("(")!=-1 && cadenaContenido.indexOf(")")!=-1){
			int par2=0;
			int par1=0;
			par1=cadenaContenido.indexOf("(");
			par2=cadenaContenido.lastIndexOf(")");
			String resultado;
			String celda1=cell+(int)(Math.random()*10000+1);
			String substring=cadenaContenido.substring(par1,par2+1);
			set(celda1,"="+cadenaContenido.substring(par1+1,par2));
			cadenaContenido=cadenaContenido.replace(substring, "");
			resultado=evaluate(celda1);		
			StringBuilder sb = new StringBuilder(cadenaContenido);     	        
	        sb.insert(par1, resultado); // insert(offSet, characterString)
	        cadenaContenido=sb.toString();
		}

		if(cadenaContenido.charAt(0)=='='){
			if(cadenaContenido.indexOf("*")==-1 && cadenaContenido.indexOf("+")==-1 && cadenaContenido.indexOf("-")==-1
					&& cadenaContenido.indexOf("/")==-1 && cadenaContenido.indexOf("%")==-1 && cadenaContenido.indexOf("&")==-1){
				if(negativo==true){
					if(Character.isDigit(cadenaContenido.charAt(1))){
						int i=1;
						String concat="-";
						while((i<cadenaContenido.length())&&(Character.isDigit(cadenaContenido.charAt(i)))){
							concat+=cadenaContenido.charAt(i);
							i++;
						}
						return concat;
					}else{
						throw new MiError("No existe una celda negativa"); 
					}
				}else{
					if(Character.isDigit(cadenaContenido.charAt(1))){
						int i=1;
						String concat="";
						while((i<cadenaContenido.length())&&(Character.isDigit(cadenaContenido.charAt(i)))){
							concat+=cadenaContenido.charAt(i);
							i++;
						}
						return concat;
					}
					else{
						//buscamos una celda
						String contenidoSubcelda="";
						for(int i=1; i<cadenaContenido.length();i++){
							contenidoFinal+=cadenaContenido.charAt(i);
						}
						return evaluate(contenidoFinal);				
					}
				}
			}
			else{
				
				
				int j=1;
				boolean encontrado=false;
				while(!encontrado){
					if(cadenaContenido.charAt(j)=='+' || cadenaContenido.charAt(j)=='-' ||
							cadenaContenido.charAt(j)=='*' || cadenaContenido.charAt(j)=='/' 
							|| cadenaContenido.charAt(j)=='%' || cadenaContenido.charAt(j)=='&' ){
						encontrado=true;
						if(negativo){
							StringBuilder str = new StringBuilder(cadenaContenido);
							str.insert(1, '-');
							cadenaContenido=str.toString();
							j++;
						}
						int numero1, numero2,resultado;
						String Snumero1="";
						String Snumero2="";
						String celda1=cell+(int)(Math.random()*10000+1);
						String celda2=cell+(int)(Math.random()*10000+1);
						if(!esCadena(cadenaContenido.substring(1,j))){
							set(celda1,"="+cadenaContenido.substring(1,j));	
						}else{
							set(celda1,""+cadenaContenido.substring(1,j));	
						}
						if(!esCadena(cadenaContenido.substring(j+1,cadenaContenido.length()))){
							set(celda2,"="+cadenaContenido.substring(j+1,cadenaContenido.length()));
						}else{
							set(celda2,""+cadenaContenido.substring(j+1,cadenaContenido.length()));
						}				
						Snumero1=evaluate(celda1);
						Snumero2=evaluate(celda2);
						switch (cadenaContenido.charAt(j)) {
						case '+':
							numero1=Integer.parseInt(Snumero1);		
							numero2=Integer.parseInt(Snumero2);
							try {
								resultado=numero1+numero2;
								contenidoFinal=""+resultado;
							} catch (Exception e) {
								System.out.println("#Error");
							}

							//numero1+
							break;
						case '-':
							numero1=Integer.parseInt(Snumero1);		
							numero2=Integer.parseInt(Snumero2);
							try {
								resultado=numero1-numero2;
								contenidoFinal=""+resultado;
							} catch (Exception e) {
								System.out.println("#Error");
							}	
							//numero1-
							break;
						case '*':
							numero1=Integer.parseInt(Snumero1);		
							numero2=Integer.parseInt(Snumero2);
							try {
								resultado=numero1*numero2;
								contenidoFinal=""+resultado;
							} catch (Exception e) {
								System.out.println("#Error");
							}				
							//numero1*
							break;
						case '/':
							numero1=Integer.parseInt(Snumero1);		
							numero2=Integer.parseInt(Snumero2);
							try {
								resultado=numero1/numero2;
								contenidoFinal=""+resultado;
							} catch(Exception e) {
								System.out.println("#Error");
							}		
							//numero1/
							break;
						case '&':						
							contenidoFinal=""+Snumero1+" "+Snumero2;
							//numero1/
							break;
						default:
							System.out.println("error" );
							break;
						}
						return contenidoFinal;

					}
					j++;
				}
			}

		}else{
			if(esCadena(cadenaContenido)){
				StringBuilder sb = new StringBuilder(cadenaContenido);
				sb.deleteCharAt(0);
				sb.deleteCharAt(cadenaContenido.length()-2);
				cadenaContenido = sb.toString();
				return cadenaContenido;
			}
			return get(cell);
		}
		return cadenaContenido;
	}
	private boolean esCadena(String string){
		if((string.charAt(0)=='\'') && (string.charAt(string.length()-1)=='\'')){
			return true;
		}else return false;
	}
}

