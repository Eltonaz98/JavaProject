package array;

import java.util.Random;
import java.util.Scanner;

public class TestArray {

	public static void main (String[]args) {


		int[] numericasuali = new int[10];
		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		


		//Ciclo per valorizzare l' array con numeri casuali compresi tra 1 e 20
		for(int i = 0; i < numericasuali.length; i++) numericasuali[i] = random.nextInt(20) + 1;
		

		int tentativi= 0;
		int trovanumero = 0;
		boolean vittoria = false;
		
				
		do {      //Acquisizione dati utente
			System.out.println("che numero vuoi cercare?"); 
			
			trovanumero = sc.nextInt();
			tentativi++;

			//Ciclo per cercare il numero inserito da tastiera nell' array dai numeri casuali

			for ( int x : numericasuali) {
				if(x == trovanumero) {
					System.out.println("Complimenti");
					System.out.println("numero tentativi : " + tentativi);
					vittoria=true;
					break;
				}
				
			}
			if(tentativi < 4  && vittoria == false)
			
			System.out.println("hai perso. numero di tentativi effettuati senza trovare numero : " + (tentativi));
				

		}while(!vittoria);
		
			System.out.println();
			//ciclo per la stampa dell' array dei numeri casuali
			System.out.println("**Stampa numeri casuali**");
			for(int i = 0; i < numericasuali.length; i++) {
				System.out.println((i+1) + " : " + numericasuali[i]);






				//		int[] numericasuali = new int[10];
				//		Random random = new Random();
				//		
				//		for(int i = 0; i < numericasuali.length; i++) numericasuali[i] = random.nextInt(100) + 1;
				//		System.out.println("**** STAMPA NUMERI CASUALI****");
				//		for(int i = 0; i < numericasuali.length; i++) System.out.println((i+1)+ ": " + numericasuali[i]);
				//		ARRAY NUMERI CASUALI||


				//		int[] array1 = new int[10];
				//		
				//		array1[0] = 7;
				//		array1[1] = 14;
				//		array1[2] = 21;
				//		array1[3] = 28;
				//		array1[4] = 35;
				//		array1[5] = 42;
				//		array1[6] = 49;
				//		array1[7] = 56;
				//		array1[8] = 63;
				//		array1[9] = 70;
				//		
				//		System.out.println("||| Tabellina del 7: |||");
				//		for(int x = 0; x < array1.length; x++)
				//	    System.out.println("7 x " + (x+1) + (" = ") + (array1[x]));
				//		
				//		System.out.print("\n");
				//		
				//		int[]array2 = {5,10,15,20,25,30,35,40,45,50};
				//		
				//		System.out.println("||| Tabellina del 5: |||");
				//		  for(int x = 0; x < array2.length; x++) {
				//			  System.out.println("5 x " + (x+1) + (" = ") + (array2[x]));
				//	}

			}
		}
	}
