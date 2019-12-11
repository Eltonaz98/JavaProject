package inputoutput;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {
	
	public static void main(String[]args) throws IOException {
		
		
		File file = new File("test_IO","abc.txt");
		File directory = new File("test_IO");
		
		System.out.println("Esiste la directory (" + directory + " ) ? " + directory.exists());
		if (directory.exists() == false)  
			directory.mkdir();
		
		
		System.out.println("Esiste il file (" + file + " ) ? " + file.exists());
		if (file.exists() == false)  
			file.createNewFile();
		
		System.out.println("Esiste la directory (" + directory + " ) ? " + directory.exists());
		if (directory.exists() == false)  
			directory.mkdir();
		
		
		System.out.println("Esiste il file (" + file + " ) ? " + file.exists());
		if (file.exists() == false)  
			file.createNewFile();
			
		
	}

}
