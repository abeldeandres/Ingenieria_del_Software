package miPaquete;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intervalo inter1 = new Intervalo("[",0,4,"]");
		Intervalo inter2 = new Intervalo("[",1,20,"]");
		Intervalo inter3=inter2.Interseccion(inter1);
		System.out.println(""+inter3.getPrimero()+","+inter3.getSegundo());
	}

}
