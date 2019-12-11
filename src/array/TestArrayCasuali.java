package array;

import java.util.Random;
import java.util.Scanner;

public class TestArrayCasuali {

	private static Scanner tastiera;

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeriCasuali = new int[10];
		int x, tentativi = 0;
		boolean indovinato=false;
		
		tastiera = new Scanner(System.in);

		//Ciclo per cercare il numero inserito da tastiera nell'array dei numeri casuali
		for(int i=0; i<numeriCasuali.length; i++) {
			numeriCasuali[i]= random.nextInt(100) + 1;
		}
		System.out.println("Indovina un numero da 1 a 100 (max 10 tentativi)");

		do {    System.out.println("Che numero vuoi cercare?");
		x = tastiera.nextInt();
		
		for(int elemento:numeriCasuali) { 
    		if (x==elemento) {
    			System.out.println("COMPLIMENTI!");
    			indovinato=true;
    			break;
		    }
		}
		if (!indovinato)  
			System.out.println("Errato, nuovo tentativo");
			tentativi++;
		} while (indovinato==false && tentativi < 10);
		if (tentativi>=10) 
		System.out.println ("hai superato il numero di tentativi");
		System.out.println ("Ci hai messo " + tentativi + " tentativi");
		
		
		




		System.out.println();

		//Ciclo per la stampa dell'array dei numeri casuali
		System.out.println("*** STAMPA NUMERI CASUALI ***");
		for(int i = 0; i< numeriCasuali.length; i++) 
			System.out.println ((i+1) + ": " + numeriCasuali[i]);
		}
	
	}


