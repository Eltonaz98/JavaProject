package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	
	public static void main(String[]args) throws IOException {
		
		File file = new File("Squadra","Juventus" + ".txt");
		File directory = new File("Squadra");
		int x;
		
		
		
		if (file.exists() == false) {
			System.out.println("Il file non è disponibile nel percorso specificato");
			System.exit(0);
			}
		
		FileReader fr = new FileReader(file);
	
		while((x =fr.read())!= -1) // read legge un carattere per volta 
		System.out.print((char)x); // devo fare il cast per convertire il metodo di lettura da byte a char
	                              //print e non println perchè ad ogni lettera letta andrebbe a capo
	     
	} 
	

}
