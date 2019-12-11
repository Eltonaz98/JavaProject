package inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestCreaNuovoFile {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		
		String nomeFile;
		final String nomeDirectory;

		sc = new Scanner(System.in);
	
		do {
			System.out.println("Prego inserire il nome del file di testo");
			nomeFile = sc.nextLine() ;

			int punto=nomeFile.indexOf('.');
			if(punto != -1) System.out.println("Errore il nome del file non deve contenere .txt\n");
			else {
				nomeFile=nomeFile + ".txt";
				break;
			}

		}while(true);
		

		System.out.println("Prego inserire il percorso di destinazione del tuo nuovo file:");
		nomeDirectory ="C:\\Users\\BeGear\\Desktop\\" + sc.nextLine();

		File firstFile = new File(nomeDirectory, nomeFile);
		File directory = new File(nomeDirectory);

		if (directory.exists() == false) {
			directory.mkdir();
			System.out.println("\nLa cartella è stata creata! ");
		}

		if (firstFile.exists() == false) {
			firstFile.createNewFile();
			System.out.println("Il file è stato creato! ");
		}

        System.out.println("\n*** CONTROLLO FILE ***\n");
		System.out.println("Esiste il file (" + nomeFile + ")? " + firstFile.exists());
		System.out.println("Esiste il file (" + nomeDirectory + ")? " + directory.exists());
		
	    String testo;
	    
	    System.out.println("\n*** INSERIMENTO TESTO ***\n");
	    
	    do {
		System.out.println("\nInserisci il testo e premi invio per andare a capo (digita stop per fermarti)");
		testo= sc.nextLine();
		
		if(testo.equalsIgnoreCase("stop"))
			break;
		
		FileWriter fw = new FileWriter(firstFile, true);
		fw.write(testo + "\n");
		fw.flush();
	    fw.close();
	    }while(true);
		
	}
}
