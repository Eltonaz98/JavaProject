package eccezioni;

import java.util.Scanner;

public class TestCheckNull {
	
	

	public static void main(String[]args) {
		
		String x;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" Prego inserire un numero" + "--Scrivi Stop per terminare");
	         x = sc.nextLine();
	         
	          if( x.equalsIgnoreCase("Stop")) 
		    	 
		     try {
		    	 Integer.parseInt(x);
		     }catch(NumberFormatException e) {
		    	 System.out.println("Inserire un numero ");
		     }
	         
		      
	         } while  (!x.equalsIgnoreCase("Stop"));
	}
	}
			
	         
		
	          
	

