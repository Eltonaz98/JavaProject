package base;

import java.util.Scanner;

public class TestPasqua {
	
	private static Scanner tastiera;
	
	static int giorno,mese,anno;
	
	public static void main(String[] args) {
		
		int a=0,b=0,c=0,d=0,e=0;
	    
	    tastiera = new Scanner(System.in);
	    
	    System.out.print("Prego inserire un anno compreso tra il 1900-2099 ");
	    anno= tastiera.nextInt(); tastiera.nextLine(); 
	    
	    a=anno%19;
    	b=anno%4;
    	c=anno%7;
    	d=((19*a)+24)%30;
    	e=((2*b+4*c+6*d+5)%7);
	    calcoloMese(d,e);
	    calcoloGiorno();
	    
	}
	    
	    public static void calcoloMese(int d,int e) {
	    	mese=22+d+e;
	    	if (mese<=31) System.out.println("La data di Pasqua è nel mese di Marzo");
	    	else if (mese>=31) System.out.println("La data di Pasqua è nel mese di Aprile");
	
	    }
	    
	    public static void calcoloGiorno() {
	    	
	    	giorno=mese-31; System.out.println("la data di Pasqua è in giorno " + giorno);
//	    	if (((data!=26) && (data!=25)) || (((data==25) && (d!=28)) && (a<=10)))
//	    	 System.out.println("la data di Pasqua è " + data);
//	    	else if (((data==25) && (d==28)) && (a>10))
//             System.out.println("la data di Pasqua è 18 Aprile");
//	    	else if (data==26)
//	         System.out.println("la data di Pasqua è 19 Aprile");
	    }
	    			
	    	
	

}
