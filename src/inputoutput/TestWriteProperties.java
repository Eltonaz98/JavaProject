package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sound.midi.SysexMessage;

public class TestWriteProperties {

	public static void main(String[] args) {

		Properties prop = new Properties();
		File fileprop = new File("config.properties");
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
		
		prop.setProperty("nome", "Alessandro");
		prop.setProperty("cognomee", "Tona");
		prop.setProperty("squadra", "Juventus");
		try {
			prop.storeToXML(fos, "Scrittura file di properties");
			fos.flush();
			fos.close();
			System.out.println("Programma terminato");
		} catch (IOException e) {
			System.out.println("Si sono verificati degli errori durante la scrittura del file di properties" + e.getMessage());
			System.exit(0);
		}
		

	}

}
