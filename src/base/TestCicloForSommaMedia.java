package base;

import java.util.Scanner;

public class TestCicloForSommaMedia {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire valore iniziale x");
		int x = sc.nextInt();
		System.out.println("inserire valore finale y");
		int y = sc.nextInt();
		
		
		int somma = 0;
		float media = 0;
		 ;
		
		
		for (int i = x; i <= y;i++ ) {
			
			
			
			somma = i +somma;
		}
		
			media = (float)somma/((y - x)+1);
		
		System.out.println("la somma dei numeri è" +somma);
		System.out.println("la media dei numeri è" + (float) media);
		
		
		
			
			
		}
			
		
	}


