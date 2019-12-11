package inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFileScanner {

	public static void main(String[]args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome file che vuoi creare senza specificare l' estensione : ");
		String nomefile = sc.nextLine();
        
        int counter = 0;  
        
        for (int i=0; i<=nomefile.length()-1; i++) {  
            if(nomefile.charAt(i) == '.') { 
            	System.out.println("Il nome del file non può contenere (.)");
            	nomefile = sc.nextLine();
            }
        }
                
		System.out.println("In che directory lo vuoi creare ? ");
		String nomedirectory = sc.nextLine();

		File file = new File("C:\\Users\\BeGear\\Desktop\\" + nomedirectory,nomefile + ".txt");
		File directory = new File( "C:\\Users\\BeGear\\Desktop\\"+ nomedirectory);

		System.out.println("Esiste la directory (" + nomedirectory + " ) ? " + directory.exists());
		if (directory.exists() == false)  
			directory.mkdir();


		System.out.println("Esiste il file (" + nomefile + " ) ? " + file.exists());
		if (file.exists() == false)
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Non è stato possibile creare il file : " + e.getMessage());
			}

		System.out.println("Esiste la directory (" + nomedirectory + " ) ? " + directory.exists());
		if (directory.exists() == false)  
			directory.mkdir();


		System.out.println("Esiste il file (" + nomefile + " ) ? " + file.exists());
		if (file.exists() == false) 
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Non è stato possibile creare il file" + e.getMessage());
			}



	}

}
