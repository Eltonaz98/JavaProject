package base;

import java.util.Scanner;

public class TestCicloForTabellina {
	
	private static Scanner tastiera;
	
	public static void main(String[] args) {
	
    int x,y;
    
    
	
	tastiera = new Scanner(System.in);
	
    System.out.print("Quale tabellina vuoi stampare? ");
    x= tastiera.nextInt(); tastiera.nextLine();
	
    System.out.print("Per quante volte vuoi stampare la tabellina? ");
    y= tastiera.nextInt(); tastiera.nextLine();
    
    
    for (int i=1; i<=y; i++) {
    	
    	System.out.println(x + "x" + i + "=" + (x*i));
    }
    
}

}
