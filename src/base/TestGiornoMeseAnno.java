package base;

import java.util.Scanner;

public class TestGiornoMeseAnno {

	
    private static Scanner sc;
	
	public static void main(String[] args ) {
		
		sc = new Scanner(System.in);
		
		int nr_giorno;
		System.out.print("Digitare un numero compreso tra 1 e 7: ");
		nr_giorno= sc.nextInt(); sc.nextLine();
		
		int nr_mese;
		System.out.print("Digitare un numero compreso tra 1 e 12: ");
		nr_mese= sc.nextInt(); sc.nextLine();
		
		int nr_anno;
		System.out.print("Digitare un anno: ");
		nr_anno= sc.nextInt(); sc.nextLine();
		
		System.out.println("Giorno " + nr_giorno + " " + "Mese " + nr_mese + " " + "Anno " + nr_anno);
		
		
		
		
		
		switch (nr_giorno) {
		
		case 1:
			System.out.println ("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default:
			System.out.println("Errore, i giorni della settimana sono 7");
			
			
			
		}
		
switch (nr_mese) {
		
		case 1:
			System.out.println ("Gennaio");
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
		default:
			System.out.println("Errore, i mesi sono 12");
			
			}
        
        
        switch (nr_anno %4) {
        
        case 0: 
        	System.out.println("Anno bisestile");
        	break;
        default:
        	System.out.println("Anno non bisestile");
        	break;
        	
        }

	}

}

