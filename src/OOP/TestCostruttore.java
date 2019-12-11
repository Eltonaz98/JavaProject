package OOP;

public class TestCostruttore {
	int x;
	static int y;
	
	public TestCostruttore() {
		x = 10;
		System.out.println("io sono il costruttore");
		this.metodo1();
		System.out.println(x);
	}
	
	public static void main(String[]args) {
		System.out.println("Ciao");
		TestCostruttore tc = new TestCostruttore();
		System.out.println(tc);
		y = 100;
		
	}

	public void metodo1() {
		System.out.println("io sono il metodo 1");
		this.x = 20;
		System.out.println(x);
		for(int y = 0; y<10 ;y++) {
			System.out.println("Io sono Y e valgo" + y);
		}
	}
}
