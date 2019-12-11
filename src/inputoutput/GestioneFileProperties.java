package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class GestioneFileProperties {


	String exit;
	Scanner sc = new Scanner(System.in);

	public void Inserimento() {


		Properties prop = new Properties();
		File fileprop = new File("animali.properties");
		FileOutputStream fos = null;



		try {
			fos = new FileOutputStream(fileprop,true);
		} catch (FileNotFoundException e) {
			try {
				fileprop.createNewFile();
			} catch (IOException e1) {
				System.out.println("Si sono verificati dei problemi durante la creazione del file" + e1.getMessage());
				System.exit(0);
			}
		}

		do {
			System.out.print("Inserire la chiave: "); 
			String key = sc.nextLine();
			System.out.print("Inserire i valore: ");
			String value = sc.nextLine();
			prop.setProperty(key, value);
			System.out.println("Vuoi continuare l'inserimento? Si/No");
		} while(sc.nextLine().equalsIgnoreCase("si"));

		try {
			prop.store(fos, "Scrittura file");
			fos.flush();
			fos.close();
			System.out.println("Hai inserito il testo all' interno del file");
		} catch (IOException e) {
			System.out.println("Si sono verificati degli errori durante la scrittura del file di properties" + e.getMessage());
			System.exit(0);
		}


	}

	public void Lettura() {
		Properties prop = new Properties();
		File fileprop = new File("animali.properties");


		try (FileInputStream  fis  = new FileInputStream(fileprop)) {  

			prop.load(fis);

			for (Object x : prop.keySet()) {  
				System.out.println("Key: " + x + " Value: " + prop.getProperty((String) x));

			}

		} catch (IOException e) {
			System.out.println("Si sono verificati dei problemi durante la lettura del file di properties" + e.getMessage());
			System.exit(0);
		} 

	}

	public void Controllouscità() {
		System.out.println("Vuoi tornare al menù principale ? si / no");
		exit= sc.nextLine();
		System.out.println("Grazie e a presto!");
	}



}
