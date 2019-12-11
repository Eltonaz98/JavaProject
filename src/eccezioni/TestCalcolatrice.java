package eccezioni;

import java.util.Scanner;

public class TestCalcolatrice {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Calcolatrice c = new Calcolatrice();
		
		System.out.println("*** CALCOLI ARITMETICI ***");
		
		System.out.println("Inserire il primo operatore");
		int x = sc.nextInt(); sc.nextLine();
		
		System.out.println("Inserire il secondo operatore");
		int y = sc.nextInt();sc.nextLine();		
		System.out.println("Inserire operazione da effettuare (+ , - , / , *)");
		String operatore = sc.nextLine();
		System.out.println("Hai chiesto di effettuare : " + x + operatore + y);
		
	   switch(operatore) {
	   case "+" : System.out.println("Risultato addizzione :  " + c.addizzione(x, y));
	   break;
	   
	   case "-" : System.out.println("Risultato sottrazzione :  " + c.sottrazzione(x, y));
	   break;
	   
	   case "/" : try{
		   System.out.println("Risultato divisione :  " + c.divisione(x, y)[0] + " Il resto è : " + c.divisione(x, y)[1]);
	   }catch (ArithmeticException e) {
		   System.out.println("Operazione non consentita ");
	   }
	   break;
	   
	   case "*" : System.out.println("Risultato moltiplicazione :  " + c.moltiplicazione(x, y));
	   break;
	   
	   default  : System.out.println("Operazione inesistente :  ");
	   }
	
	}
	

}
