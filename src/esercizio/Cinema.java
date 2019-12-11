package esercizio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Cinema extends Persona {

	boolean xxx=true;
	static Scanner sc=new Scanner(System.in);

	public Cinema() {
	}

	public boolean controllo(String x) {
		if (x.contentEquals("si")) { 
			System.out.println("Prego può accedere, buon divertimento!\n");
		}else if (x.contentEquals("no"))
			System.out.println("Arrivederci ");
		return xxx;
	}

	public void metodoCheckAge() throws AgeException {
		if (this.getEta() < 18) throw new AgeException ("Ingresso vietato, " + getNome() + " è troppo giovane! ");
		else if (this.getEta() >= 90) throw new AgeException ("Ingresso vietato, " + getNome() + " è troppo anziano! ");

	}

	public void metodoInserimento() {

		ArrayList a = new ArrayList();
		System.out.println("Io sono il metodo inserimento prenotazione\n ");
		do {

				System.out.println("Inserire il nome della persona ");
				setNome(sc.nextLine());

				System.out.println("Inserire l'età della persona ");
				setEta(sc.nextInt()); sc.nextLine();

				System.out.println("Inserire il posto assegnato ");
				setPosto(sc.nextInt()); sc.nextLine();
				
				System.out.println("Per continuare premi invio, altrimenti scrivi stop");
				setNome(sc.nextLine());
				
				try {
					metodoCheckAge();
				}catch (AgeException e) {
					System.out.println(e.getMessage());
				}
				if(getNome().equalsIgnoreCase("stop")) {
					System.out.println("Arrivederci"); break;
					}
				a.add(getNome());
				a.add(getEta());
				a.add(getPosto());
				
			}while(true);
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
	}

	public void metodoModifica() {
		System.out.println("Io sono il metodo modifica prenotazione ");

	}

	public void metodoCancella() {
		System.out.println("Io sono il metodo cancella prenotazione ");

	}

	public void metodoVisualizza() {
		System.out.println("Io sono il metodo visualizza prenotazione ");

	}

	public void metodoVisualizzaTutto() {
		System.out.println("Io sono il metodo visualizza tutte le prenotazioni ");

	}

	public void metodoProgrammaCinema() {
		System.out.println("Io sono il metodo programma cinema ");

	}





}
