package eccezzioni;

import java.io.EOFException;
import java.util.Scanner;

public class TestCinema {
	
	public static void main(String[]args) throws AgeException {
		
		Scanner sc = new Scanner(System.in);
		
		Cinema p = new Cinema();
		
		
		int npe = 0;
		int npm = 0;
		int npo = 0;
		
		System.out.println("In che cinema vuoi entrare ? " );
		p.tipocinema();
			
		
		do { System.out.println("Come ti chiami? Se nessun altro deve entrare digita stop " );
		p.nome = sc.nextLine();
		npe++;
		if(p.getNome().equalsIgnoreCase("Stop")) {
			System.out.println(" Buona Visione!!");
			break;
		}
		if (p.xxx ==true) {
		System.out.println("Quanti anni hai? ");
		p.età = sc.nextInt();
		if(p.età < 18)
			npm++;
		if(p.età > 90)
			npo++;
		sc.nextLine();
		try {
		p.ControlloEtà();
		}catch(AgeException e) {
			System.out.println(" Accesso negato perche sei under 18 " + e.getMessage());
		}catch(EOFException e) {
			System.out.println(" Accesso negato perchè sei over 90 " + e.getMessage());
		}
		}
		
			
		
		}while(true);
		
		System.out.println("Numero di persone nel cinema : " + (npe -1));
		System.out.println("Numero di persone minorenni : " + npm);
		System.out.println("Numero di persone over 90 : " + npo);
	}


}
