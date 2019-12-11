package eccezioni;

import java.util.Scanner;

public class TestException {
	
	private static Scanner tastiera;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Quanti elementi deve contenere l'array ");
		int x=sc.nextInt();
		int[] numeri = new int[x];
		
		
		for (int i=0; i<numeri.length; i++) {
		
			numeri[i]=sc.nextInt();
			System.out.println(numeri[i]);
			}
			
		
	}

}
