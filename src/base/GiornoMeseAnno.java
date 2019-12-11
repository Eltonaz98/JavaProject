package base;

import java.util.Scanner;

public class GiornoMeseAnno {
	
    private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int nr_giorno;
		System.out.print("Digitare un numero compreso tra 1 e 7: ");
		nr_giorno= sc.nextInt(); sc.nextLine();
		
		int nr_mese;
		System.out.print("Digitare un numero compreso tra 1 e 12: ");
		nr_mese= sc.nextInt(); sc.nextLine();
		
		int nr_anno;
		System.out.print("Digitare un anno: ");
		nr_anno= sc.nextInt(); sc.nextLine();	
		
		System.out.println("Giorno " + nr_giorno + " " + "Mese " + nr_mese + " " + "Anno " + nr_anno);
		
		
	                           
  
    	
    	if (nr_giorno == 1) System.out.println ("Lunedì");                               
        
    	else if (nr_giorno == 2) System.out.println ("Martedì");
    		
    	else if (nr_giorno == 3) System.out.println ("Mercoledì");
    		
    	else if (nr_giorno == 4) System.out.println ("Giovedì");
    		
    	else if (nr_giorno == 5) System.out.println ("Venerdì");
    		
    	else if (nr_giorno == 6) System.out.println ("Sabato");
    	
    	else if (nr_giorno == 7) System.out.println ("Domenica");
    	
    	else System.out.println("I giorni sono 7");
    	
    
   
    	if (nr_mese == 1) System.out.println ("Gennaio");                               
        
    	else if (nr_mese == 2) System.out.println ("Febbraio");
    		
    	else if (nr_mese == 3) System.out.println ("Marzo");
    		
    	else if (nr_mese == 4) System.out.println ("Aprile");
    		
    	else if (nr_mese == 5) System.out.println ("Maggio");
    		
    	else if (nr_mese == 6) System.out.println ("Giugno");
    	
    	else if (nr_mese == 7) System.out.println ("Luglio");
    	
    	else if (nr_mese == 8) System.out.println ("Agosto");
    	
    	else if (nr_mese == 9) System.out.println ("Settembre");
    	
    	else if (nr_mese == 10) System.out.println ("Ottobre");
    	
    	else if (nr_mese == 11) System.out.println ("Novembre");
    	
    	else if (nr_mese == 12) System.out.println ("Dicembre");
    	
    	else System.out.println("I mesi sono 12");
    	

        if (nr_anno %4 == 0) System.out.println("L'anno è bisestile");
    	
        else if (nr_anno %4 !=0) System.out.println("L'anno non è bisestile");
    
}
}
