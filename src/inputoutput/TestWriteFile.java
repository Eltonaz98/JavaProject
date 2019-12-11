package inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriteFile {
	

	

	public static void main(String[]args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		File file = new File("Squadra","Juventus" + ".txt");
		File directory = new File("Squadra");
		final String acapo = "\n";
		String s;
		
		if (directory.exists() == false)  directory.mkdir();
		if (file.exists() == false)  file.createNewFile();
		
		FileWriter fw = new FileWriter(file,true); //se dopo file metto ,true mi va ad aggiungere il nuovo testo inserito a quello scritto in precedenza
		System.out.println("****Documento di testo**** / digita stop per salvare ");
		do {
		s = sc.nextLine();
		if (!s.equalsIgnoreCase("stop"))
		fw.write(s + acapo);
		
		}while(!s.equalsIgnoreCase("Stop")); 
		    fw.flush();
		    fw.close();
			System.out.println("E' stato inserito il contenuto da lei scritto nel file di testo");
			
			
			
		
		
		
//		fw.write("Siamo la squadra più forte d' italia" + acapo); 
//		fw.write("Siamo primi in classifica" + acapo);
//		fw.write("Siamo passati come primi nel girone di Champions" + acapo);
//		fw.flush();
//		fw.close();
		
	
			
			
		
	}

}
