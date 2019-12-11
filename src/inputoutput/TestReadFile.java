package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReadFile {

	public static void main(String[] args) throws IOException {

		final String nomefile = "abc.txt";
		final String nomedirectory = "C:\\Users\\BeGear\\Desktop\\Test Input Output";
		int x;
		
		File file = new File(nomedirectory, nomefile);
		FileReader fr = null;

        if (file.exists() == false) {
        	System.out.println("Il file richiesto non è disponibile nel percorso specificato");
        	System.out.println(0);
        }
        
        try {
        fr = new FileReader(file);
        } catch (FileNotFoundException e) {
        	System.out.println("Il file richiesto non è disponibile nel percorso specificato");
        	System.exit(0);
        }
        
       while ((x=fr.read()) != -1) {
    	   System.out.print((char)x);
       }
	}
}