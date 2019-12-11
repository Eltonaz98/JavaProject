package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWrite {


	public static void main(String[]args) throws IOException {

		File file = new File("Squadra","Juventus" + ".txt");
		File filecopy = new File("Squadra","JuventusCopy" + ".txt");
		File directory = new File("Squadra");
		int x;
        
		if (filecopy.exists() == false) {
			filecopy.createNewFile();
		  
		}
		if (file.exists() == false) {
			System.out.println("Il file non è disponibile nel percorso specificato");
			System.exit(0);
		}
		FileWriter fw = new FileWriter(filecopy);
		FileReader fr = new FileReader(file);

		while((x =fr.read())!= -1)       
			fw.write((char)x);          
		                               
		fw.flush();
		fw.close();
		fr.close();
        
	} 


}
