package thread;

import java.util.Random;
import java.util.Scanner;

public class TestAutoDaCorsa {
	
	public static void main(String[] args) {
		
   
    Scanner sc = new Scanner (System.in);
   
    
    Thread a1 = new Thread( new Auto());
    Thread a2 = new Thread( new Auto());
    Thread a3 = new Thread( new Auto());
   
    System.out.println("Inserire nome macchina : ");
    a1.setName(sc.nextLine());
    System.out.println("Inserire nome macchina : ");
    a2.setName(sc.nextLine());
    System.out.println("Inserire nome macchina : ");
    a3.setName(sc.nextLine());
    a1.start();
    a2.start();
    a3.start();
   
    
    
   
    
    
    
    
    
    
	
	}
}
