package array;

import java.util.Random;

public class TestArrayTabelline {
	
    public static void main(String[] args) {
	
//		int[] array1 = new int [11];
//		int[] array2 ={9,18,27,36,45,54,63,72,81,90};
		int[] numeriCasuali = new int[10];
    	Random random = new Random();
//		
//		
//		final String TITOLO1 = "*** STAMPA DELLA TABELLINA DEL SETTE ***";
//		
//		System.out.println(TITOLO1);
//		for (int i=1; i<array1.length; i++) {
//			array1[i] = 7*i; System.out.print("7 x " + i + " = " );
//			System.out.println(array1[i]);
//		}
//		
//		final String TITOLO2 = "*** STAMPA DELLA TABELLINA DEL NOVE ***";
//
//		System.out.println(TITOLO2);
//		for (int i=0; i<array2.length; i++) 
//			System.out.println("9 x " + (i+1) + " = " + array2[i]);
		
		for(int i=0; i<numeriCasuali.length; i++)
		numeriCasuali[i]= random.nextInt(100) + 1;
		System.out.println("*** STAMPA NUMERI CASUALI ***");
		for(int i = 0; i< numeriCasuali.length; i++) 
		System.out.println ((i+1) + ": " + numeriCasuali[i]);
    }
}
