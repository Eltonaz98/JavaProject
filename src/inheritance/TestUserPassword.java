package inheritance;

import java.util.Scanner;

public class TestUserPassword {

	public static void main(String[] args) {
		
		String userOut, pwdOut;
		userOut= "timo";
		pwdOut= "omit";
		
		Scanner tastiera=new Scanner(System.in);
		
		System.out.println("Digitare Exit per uscire ");
		System.out.println("---------");
		
		do {
		System.out.println("Inserire lo User ");
		String userIn=tastiera.nextLine();
		System.out.println("Inserire la password ");
		String pwdIn=tastiera.nextLine();
		
		if ((userIn.equalsIgnoreCase(userOut)) && (pwdIn.equalsIgnoreCase(pwdOut))) {
		System.out.println("I dati corrispondono, funziona");
		} else System.out.println("I dati non corrispondono , ricontrolla");
		} while(true);
		
	
		
	
		
		
		

	}

}
