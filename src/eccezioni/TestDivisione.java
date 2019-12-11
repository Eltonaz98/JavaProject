package eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDivisione {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, result = 0, resto = 0;
		
		try {
		System.out.println(" Inserire x ");
		x = sc.nextInt();
		System.out.println(" Inserire y ");
		y = sc.nextInt();
		} catch (InputMismatchException d) {
			System.out.println("Il valore inserito deve essere numerico");
		}
		
		
		try {
		result = x / y;
		resto = x % y;
		} catch (ArithmeticException e) {
			System.out.println("Divisione per 0 non consentita."
					         + " Impostazione del valore forzato a 1");
			y = 1;
			result = x / y;
		} finally { System.out.println("*** ECCEZZIONE CATTURATA ***");
		
		}
		
		
		
		System.out.println("Il risultato di " + x + " : " + y + " è " + result + " con l' avanzo di " + resto);
		
	

	}
}
