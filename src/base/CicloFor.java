package base;

public class CicloFor {
	
	public static void main(String[]args) {
		
		int x = 10, y = 10;
		for(int i = 1; i < 100; i++) {
			if (i >=  20 && i <= 50) continue;
			if (i> 75) break;
			System.out.print("il valore di i è " + i );
			if (i%2 == 0)
			System.out.println(" -----> Ciao" );
		    else System.out.println();
			
			
			
			
		}
		System.out.println("*** FINE ***");
		
	}
}
