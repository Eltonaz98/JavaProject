package esercizio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCinema {

	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws InputMismatchException{

		Cinema c = new Cinema();
		Persona p = new Persona();
		String[] persone = new String[4];
		int scelta=0;
		
		System.out.println("Il locale è a luci rosse? ");
		c.controllo(sc.nextLine());
		
		System.out.println("*** BENVENTO - INDIRIZZAMENTO AL GESTIONE CINEMA ***\n");
		System.out.println("-----------------------");

		do {
			System.out.println("Scegliere una delle seguent opzioni: ");
			System.out.println("1. Inserimento prenotazione ");
			System.out.println("2. Modifica prenotazione ");
			System.out.println("3. Cancellazione prenotazione ");
			System.out.println("4. Visualizza prenotazione ");
			System.out.println("5. Visualizza tutte le prenotazioni ");
			System.out.println("6. Programmazione Cinema ");
			System.out.println("7. Uscita ");

			try {
				scelta=sc.nextInt(); sc.nextLine();
				System.out.println("Hai scelto l'opzione\n " + scelta);
				if (scelta == 7) System.out.println("*** ARRIVEDERCI ***\n");		
				else if(scelta < 1 || scelta > 7) throw new InputMismatchException();
			} catch (InputMismatchException e) {
				System.out.println("Spiacente, devi scegliere una delle opzioni visualizzate\n-----------------------\n");
				sc.nextLine();
				continue;
			}

			switch (scelta) {
			case 1: c.metodoInserimento();
			break;
			case 2: c.metodoModifica();
			break;
			case 3: c.metodoCancella();
			break;
			case 4: c.metodoVisualizza();
			break;
			case 5: c.metodoVisualizzaTutto();
			break;
			case 6: c.metodoProgrammaCinema();
			break;}
		}while (scelta!=7);
		sc.close();

	}
}
