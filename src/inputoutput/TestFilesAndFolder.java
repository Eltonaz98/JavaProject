package inputoutput;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

public class TestFilesAndFolder {
	
	public static void  main(String args [] ) {
		
		File directory = new File("C:\\Users\\BeGear\\eclipse-workspace\\Corso Java Nov Dic 2019\\bin" );
		File[] file = directory.listFiles();
		int d = 0;
		int f = 0;
		
		for (File s : file) {
			
			if(s.isDirectory() == true)
				d++;
			if(s.isFile() == true)
				f++;
			System.out.println(s.getName());
			
		}
		
		System.out.println("numero directory:"+d);
		System.out.println("numero file : " +f);
		
	}
}
