package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCopyArrayListToFile {

	public static void main(String[]args) throws IOException {

		File directory = new File("Squadra");
		File file = new File(directory,"Juventus.txt");
		ArrayList<Character> filelist = new ArrayList<>();
		
		
		int x;

		if (file.exists() == false) {
			System.out.println("Il file non è disponibile nel percorso specificato");
			System.exit(0);
		}
		FileReader fr = new FileReader(file);
		
		while((x =fr.read())!= -1) {
			filelist.add((char) x);
		}
		for(Character s : filelist) {
			System.out.print(s);
		}




	}

}
