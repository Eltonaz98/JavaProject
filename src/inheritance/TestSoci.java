package inheritance;

import java.util.Scanner;

public class TestSoci {

	public static void main(String[] args) {
		
		Scanner tastiera=new Scanner(System.in);
		
		System.out.println("Inserire il nome del del socio: ");
		String nomeSocio=tastiera.nextLine();
		
		System.out.println("Inserire la data di iscrizione del socio: ");
		String dataSocio=tastiera.nextLine();
		
		System.out.println("Inserire la tassa di iscrizione del socio: ");
		int tassaSocio=tastiera.nextInt();
		
		Soci s1=new Soci(nomeSocio, dataSocio, tassaSocio);
		Soci s2=new Soci("Green", "8 Settembre 2019", 120);
		Soci s3=new Soci("Brown", "5 Gennaio 2019", 240);
		Soci s4=new Soci("Brown", "1 Marzo 2018", 80);
		
    s1.metodoStampa();
    s1.metodoPwd();
    
    s2.metodoStampa();
    s2.metodoPwd();
    
    s3.metodoStampa();
    s3.metodoPwd();
    
    s4.metodoStampa();
    s4.metodoPwd();
    
   	}

}
