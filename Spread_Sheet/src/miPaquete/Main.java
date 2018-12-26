package miPaquete;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) throws MiError {
		// TODO Auto-generated method stub
		Sheet st = new Sheet();
		st.set("A6", "=(6+(5-10)+(5-1))");
		System.out.println(st.evaluate("A6"));

	}

}
