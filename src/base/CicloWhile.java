package base;

public class CicloWhile {
	
	public static void main(String[]args) {
		
		int x = 10;
		
		while (x > 0) {                            // Ciclo while
			System.out.println(x);
			x--;
			
		}
		
		int y = 100;
		do {                                         // Ciclo do while
			System.out.println(y);
			y--;
		} while(y>= 50);
	}

}
