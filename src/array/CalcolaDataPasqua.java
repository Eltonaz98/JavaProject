package array;

import java.util.Scanner;

public class CalcolaDataPasqua {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire anno tra il 1900 e il 2099");
		int anno = sc.nextInt();
		int x = 24;
		int y = 5;
		
		calcolaPasqua(anno,x,y );
		
			}

	private static void calcolaPasqua(int anno, int x, int y) {
	
		int a = anno%19;
		int b = anno%4;
		int c = anno%7;
		int d =	((19*a + x)%30);	
		int e = (((2*b) +( 4*c )+ (6*d )+ y)%7);
		int addizzione = 22 + d + e;
		int giorno = addizzione - 31;
		
	do { 
		if (addizzione <= 31)
	     System.out.println(" la data della Pasqua è il : " + addizzione + " Marzo");
	
	     else if(addizzione > 31);
	    	 
		 if (giorno ==  25 && d == 28 && a > 10)
			 System.out.println("La Pasqua è il 18 Aprile");
		
		 else if (giorno == 26)
			 System.out.println("La Pasqua è il 19 Aprile");
		
		 else 
			 System.out.println("La Pasqua è il " + giorno + " Aprile");
		break;
		
	  } while (anno >= 1900 || anno <= 2099);
	
	}
	
}

	
		


