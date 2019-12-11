package esercizio;

import java.io.EOFException;
import java.util.Scanner;

import eccezioni.AgeException;
import eccezioni.Cinema;

public class TestCinema2 {

	public static void main(String[]args) throws AgeException {

		Scanner sc = new Scanner(System.in);

		Cinema2 p = new Cinema2();

		Persona2[] elencop = new Persona2[10];
        for(int i = 0 ; i < elencop.length;i++) {
        	elencop[i]= new Persona2();
        }


		int scelta = 0;
		int npe = 0;
		int npm = 0;
		int npo = 0;
		int nposto;

		do {
			System.out.println("*********************");
			System.out.println("***REGISTRO CINEMA***");
			System.out.println("*********************");
			System.out.println("1*** Inserimento ****");
			System.out.println("2**** Modifica ******");
			System.out.println("3***** Lettura ******");
			System.out.println("4** Cancellazzione **");
			System.out.println("5* Visualizza posti**");
			System.out.println("6* Programmazzione **");
			System.out.println("7****** Exit ********");
			System.out.println("*********************");
			
            scelta = sc.nextInt();
			System.out.println("Hai scelto l' opzione numero : " + scelta);
			if (scelta == 1) {
				do { System.out.println("Inserisci posto (Max 10) : " );
				nposto= sc.nextInt()-1;
				sc.nextLine();
					System.out.println("Come ti chiami? ");
				elencop[nposto].setNome( sc.nextLine());
				npe++;
				
				System.out.println("Quanti anni hai? ");
				elencop[nposto].setEtà(sc.nextInt());
				sc.nextLine();
				
                System.out.println("Vuoi terminare ? " );
				if(sc.nextLine().equalsIgnoreCase("Stop")) {
					System.out.println(" Buona Visione!!");
					break;
					
				}
				
				}while(true);
			}
			else if (scelta == 2) {
				System.out.println("modifica prenotazione");
				p.Modifica();
				
			}
			else if (scelta == 3) { 
				System.out.println("Visualizza prenotazione");
			}
			else if (scelta == 4) {
				System.out.println("Cancella prenotazione" );
				p.Cancellazzione();
			}
			else if ( scelta == 5) {
				System.out.println("Visualizza posto prenotato");
			}
			else if (scelta == 6) {
				System.out.println("Programmazzione film");
				
			}
			else if (scelta == 7) {
				System.out.println("Buona Visione e arrivederci!");
				break;
			}
			else { System.out.println("Numero non valido " + " Inserire un numero tra l' 1 e il 7");
			scelta = 0;
			}  p.Controllouscità();

		}while (p.cexit.equalsIgnoreCase("si"));

       


		


       


		System.out.println("Numero di persone nel cinema : " + (npe));
//		System.out.println("Numero di persone minorenni : " + npm);
//		System.out.println("Numero di persone over 90 : " + npo);
	}


}
