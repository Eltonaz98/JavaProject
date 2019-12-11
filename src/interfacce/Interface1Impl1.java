package interfacce;

public class Interface1Impl1 implements Interfaccia1{

	public void metodo1() {
		System.out.println("Io sono il metodo1 della classe Inrerface1Impl1");
		
	}

	public int metodo2() {
		
		return 25;
	}

	public String metodo3(int x, int y) {
		String s = "Totale = " + String.valueOf(x+y);
		return s;
	}

}
