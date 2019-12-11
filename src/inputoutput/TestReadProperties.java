package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestReadProperties {

	public static void main(String[] args) {

		Properties prop = new Properties();
		File fileprop = new File("animali.properties");


		try (FileInputStream  fis  = new FileInputStream(fileprop)) {  /* apre e chiude dopo tutto il ciclo try 
                                                                          lo stream degli oggetti indicati */
			prop.load(fis);

			String s = (String)prop.get("4"); // Prendo direttamente il valore della chiave indicata 
			System.out.println(s);

			for (Object x : prop.keySet()) {  // ciclo tutte le key e le stampo
				System.out.println("Key: " + x + " Value: " + prop.getProperty((String) x));

			}

		} catch (IOException e) {
			System.out.println("Si sono verificati dei problemi durante la lettura del file di properties" + e.getMessage());
			System.exit(0);
		} 



	}

}
