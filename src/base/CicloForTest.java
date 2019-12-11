package base;

import java.util.Scanner;

public class CicloForTest {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("inserire valore iniziale");
		int val = sc.nextInt();
		System.out.println("numero finale");
		int n_cicli = sc.nextInt();
		System.out.println("inserire da incrementare ");
		int incr = sc.nextInt();
		
		for (int x = val ; x <= n_cicli  ;x = x + incr)
		System.out.println("il valore è" +  x );
		
		
		
		
		
	}
	

}
