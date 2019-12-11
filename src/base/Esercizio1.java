package base;

import java.util.Scanner;

public class Esercizio1 {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire numero  da 1 a 7");
		int giorno = sc.nextInt();
		System.out.println("inserire numero da 1 a 12");
		int mese = sc.nextInt();
		System.out.println("inserire un anno");
		int anno = sc.nextInt();
		
		String giorno1 = calcolagiorno (giorno);
		String mese1 = calcolamese (mese);
		String anno1 = calcolaannobisestile(anno);
		
		
		System.out.println("giorno "+ giorno1 + " mese " + mese1 + " anno "+ anno1);
	}
		
	
	
	
	public static String calcolagiorno(int giorno1) {
		String giorno = null;
		
		if (giorno1 == 1) giorno ="lunedi";                   //al posto di giorno = è possibile utilizzare: return
		else if (giorno1 == 2)giorno ="Martedi";
		else if (giorno1 == 3)giorno="Mercoledi";
		else if (giorno1 == 4)giorno="Giovedi";
		else if (giorno1 == 5)giorno="Venerdi";
		else if (giorno1 == 6)giorno="Sabato";
		else if (giorno1 == 7)giorno="Domenica";
		
		return giorno;
	}
		
		private static String calcolamese(int mese1) {
			String mese = null;
			
			if (mese1 == 1) mese = "gennaio";
			else if (mese1 == 2) mese = "febbraio";
			else if ( mese1 == 3) mese = "marzo";
			else if (mese1 == 4) mese = "aprile";
			else if (mese1 == 5) mese ="maggio";
			else if (mese1 == 6) mese ="giugno";
			else if (mese1 == 7) mese ="luglio";
		    else if (mese1 == 8) mese ="agosto";		
		    else if (mese1 == 9) mese ="settembre";
		    else if (mese1 == 10) mese ="ottobre";
		    else if (mese1 == 11) mese ="novembre";
		    else if (mese1 == 12) mese ="dicembre";
		
		return mese;
		
		}
		
		private static String calcolaannobisestile(int anno1) {
			String anno;
			int Bisestile;
			
			Bisestile = anno1%4;
			
			if (Bisestile == 0) anno = "anno bisestile";
			else anno = " non bisestile";
			
					
			return anno; 
			
		
		}
	}

	
	

