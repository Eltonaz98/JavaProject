package inheritance;

import java.util.Scanner;

public class TestIscritti {
	
	 

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("  ________________ ");
		System.out.println(" |                |");
		System.out.println(" |    Registro    |");
		System.out.println(" |    Palestra    |");
		System.out.println(" |________________|");
		
		
;		Iscritti socio = new Iscritti("Alessandro","19/11/2019", 250,50);
		Iscritti socio1 = new Iscritti("Paolo","15/9/2019", 250);
		Iscritti socio2 = new Iscritti("Alessandro","19/11/2019", 250,40);
		SociBase sb = new SociBase("Franco", "19/11/2019", 250, 30);
		SociVip sv = new SociVip("Claudio", "15/11/2019", 300, 60);
		
		
		socio.stampa();
		socio1.stampa();
		socio2.stampa();
		sb.stampa();
		sv.stampa();
			
		}
		
			
		}
		
		
		
		
	


