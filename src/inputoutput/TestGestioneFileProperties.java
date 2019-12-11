                                                           package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class TestGestioneFileProperties {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    GestioneFileProperties gfp = new GestioneFileProperties();

		int scelta = 0;
		do {
		System.out.println("***********************************");
		System.out.println("*****GESTIONE FILE PROPRERTIES*****");
		System.out.println("*******1.INSERIMENTO**************");
		System.out.println("**********2.LETTURA****************");
		System.out.println("**********3.USCITA*****************");
		System.out.println("***********************************");
		System.out.println("Digitare il numero associato alla funzione");
		scelta = sc.nextInt();
		System.out.println("Hai selezionato :" + scelta);
		
		
		if (scelta == 1) {
			System.out.println("Ha selezionato la modalità inserimento /  Digita Stop per terminare l' inserimento");
			gfp.Inserimento();
			
		} else if (scelta == 2) {
			System.out.println("Ha selezionato la modalità lettura ");
			gfp.Lettura();
		}else if (scelta == 3) {
			System.out.println("Grazie per aver utilizzato questo programma!!");
			break;
		}else { System.out.println("Numero non valido " + " Inserire un numero tra l' 1 e il 3");
		scelta = 0;
		}gfp.Controllouscità();
		}while (gfp.exit.equalsIgnoreCase("Si"));
			 	
		
	}


}
