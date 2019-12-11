package base;

public class TestCicloFor {
	
	public static void main(String[] args) {
		
		for (int i=1;i<=100;i++) {
			
			if (i>=20 && i<=50) continue;
			if (i > 75) break;
			System.out.println("Il valore di i è " + i);
			
			if (i%2==0) {
			System.out.println(" >>>>> ciao");
	      	} else System.out.println();
		}
		
		System.out.println("***FINE***");

     }
}
