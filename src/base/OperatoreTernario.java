package base;

public class OperatoreTernario {

	public static void main(String[]args) {
	
		int x, y = 1, z = 6;
				
				x = y > z ? 1 : -1;   // se y è maggiore di z stampa 1 se è minore stampa -1
			System.out.println(x);
			
			metodo1(((y > z) && (z == 6)) ? metodo11() : metodo22());
					
	}
	
	private static void metodo1(String s) {
		System.out.println(s);
		
	}

    private static String metodo11() {
	return "pippo";
	
}
    private static String metodo22() {
    	return "pluto";
    	
    }

}

