package inheritance;

import java.util.Scanner;

public class TestAnimale {
	
	public static void main(String[]args) {
		
		String x;
		Animale a = new Animale();
		Cane c = new Cane();
		Gatto g = new Gatto();
		Cavallo h = new Cavallo();
		Lupo l = new Lupo();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println(" Inserisci l' animale che vuoi cercare" + " / Scrivi Esci per terminare la ricerca");
		x = sc.nextLine();
			if(x.equalsIgnoreCase("Cane")) {
				c.presentati();
				c.verso();
				}
			else if(x.equalsIgnoreCase("Gatto")) {
				g.presentati();
				g.verso();
				}
			else if(x.equalsIgnoreCase("Cavallo")) {
				h.presentati();
				h.verso();
				}
			else if(x.equalsIgnoreCase("Lupo")) {
				l.presentati();
				l.verso();
				}
			else if(x.equalsIgnoreCase("Esci" ))
				break;
			else System.out.println("Animale non presente nella fattoria");
		} while(true);
		
		
		
		
		
		
		
		
		
	}

}
