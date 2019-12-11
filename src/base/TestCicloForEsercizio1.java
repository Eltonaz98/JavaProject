package base;

import java.util.Scanner;

public class TestCicloForEsercizio1 {
	
	private static Scanner tastiera;

public static void main(String[] args) {
	
	int x,y,z;
	
	tastiera = new Scanner(System.in);
	
    System.out.print("Inserire il valore iniziale da cui cominciare a contare: ");
    x= tastiera.nextInt(); tastiera.nextLine();
	
    System.out.print("Inserire in numero di cicli da effettuare: ");
    y= tastiera.nextInt(); tastiera.nextLine();
    
    System.out.print("Inserire quanto incrementare ");
    z= tastiera.nextInt(); tastiera.nextLine();
    
    for (int i=x; i<y; i=i+z) {
    	
    	System.out.println("Il valore di i è " + i);
    }
    
}

}
