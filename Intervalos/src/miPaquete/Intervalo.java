package miPaquete;

public class Intervalo implements Comparable<Intervalo> {
	
	String s1,s2;
	int primero,segundo;
	

	public Intervalo(String string, int i, int j, String string2) {
		// TODO Auto-generated constructor stub
		this.s1=string;
		this.primero=i;
		this.segundo=j;
		this.s2=string2;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public int getPrimero() {
		return primero;
	}

	public void setPrimero(int primero) {
		this.primero = primero;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public boolean contiene(Intervalo inter2) {
		// TODO Auto-generated method stub
		if((primero<=inter2.getPrimero()) && (segundo>=inter2.getSegundo()))
			return true;
		return false;
	}
	
	public Intervalo Interseccion(Intervalo inter2){
		int prim;
		int seg;
		if(this.getPrimero()>=inter2.getPrimero() && this.getPrimero()<=inter2.getSegundo()){
			prim=this.getPrimero();
			if(this.getSegundo()>inter2.getSegundo()){
				seg=inter2.getSegundo();
			}else{
				seg=this.getSegundo();
			}
		}else if(this.getPrimero()<inter2.getPrimero()){
			prim=inter2.getPrimero();
			if(this.getSegundo()<=inter2.getSegundo()){
				seg=this.getSegundo();
			}
			else{
				seg=inter2.getSegundo();
			}
		}else{
			prim=0;
			seg=0;
		}
		return new Intervalo("[",prim,seg,"]");
	}
	
	public int compareTo(Intervalo inter1){
		if(this.getPrimero()==inter1.getPrimero()&&this.getSegundo()==inter1.getSegundo()) return 0;
		else if(this.getPrimero()>inter1.getPrimero()) return 1;
		else return -1;
		
	}
	

}
