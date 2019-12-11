package base;


import java.util.Scanner;



public class TestCicloForFizzBuzz {
	
	public static void main (String[]args) {

		int  y = 100;
		for(int i = 1 ; i <= 100; i++ ) {
			if(i%3 == 0)
				System.out.println("Fizz");
			if(i%5 == 0)
				System.out.println("Buzz");
			if(i%5 == 0 && i%3 == 0)
				System.out.println("Fizz Buzz");
			else System.out.println(i);
			
			
			
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("inserire numero da 1 a 100");  
//		int numero = sc.nextInt();
//		
//		if (numero%3 == 0) 
//			System.out.println("Fizz");
//		if (numero%5 == 0) 
//			System.out.println("Buzz");
//				
//		Con Scanner e if
				
	}

}

