package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestCopyFileToArrayList {

	public static void main(String[]args) throws IOException {

		File directory = new File("Squadra");
		File file = new File(directory,"Juventus.txt");
		ArrayList<String> filelist = new ArrayList<>();
		filelist.add("Forza Juve");
		filelist.add("Ciao");
		
		
		String x;

		if (file.exists() == false) {
			System.out.println("Il file non è disponibile nel percorso specificato");
			System.exit(0);
		}
		FileWriter fw = new FileWriter(file);
		
	    
		
		
		for(String s : filelist) {
			fw.write(s + "\n");
		}
      fw.flush();
      fw.close(); 


	}

}
