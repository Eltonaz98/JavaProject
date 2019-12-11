package base;

import java.util.Scanner;

public class TestSwitchGiornoMeseAnno {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire numero  da 1 a 7");
		int giorno = sc.nextInt();
		System.out.println("inserire numero da 1 a 12");
		int mese = sc.nextInt();
		System.out.println("inserire un anno");
		int anno = sc.nextInt();
		
		switch(giorno) {
		
		case 1:
			System.out.println("Lunedi");
			break;
		case 2:
			System.out.println("Martedi");
		    break;
		case 3: 
			System.out.println("mercoledi");
			break;
		case 4:
			System.out.println("giovedi");
			break;
		case 5:
			System.out.println("venerdi");
			break;
		case 6:
			System.out.println("sabato");
			break;
		case 7:
			System.out.println("domenica");
			break;
			
		
		}
		
		switch(mese) {
		
		case 1:
			System.out.println("Gennaio");
			break;
		case 2:
			System.out.println("Febbraio");
		    break;
		case 3: 
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Aprile");
			break;
		case 5:
			System.out.println("Maggio");
			break;
		case 6:
			System.out.println("Giugno");
			break;
		case 7:
			System.out.println("Luglio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Settembre");
		    break;
		case 10: 
			System.out.println("Ottobre");
			break;
		case 11:
			System.out.println("Novembre");
			break;
		case 12:
			System.out.println("Dicembre");
			break;
		
		
		}
		
		switch (anno%4) {
		 
		case 0:
			System.out.println("L' anno è bisestile");
			break;
		default:
			System.out.println("l'anno non è bisestile");
			break;
			
			
			}
		
		
		
	}
	
}
