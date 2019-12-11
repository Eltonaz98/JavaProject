package base;

import java.util.Scanner;

public class TestCicloForSunAvg {
	
	private static Scanner tastiera;
	
	public static void main(String[] args) {
		
	    int start,end,sum;
	    
	    sum=0;
		
		tastiera = new Scanner(System.in);
		
	    System.out.print("start ");
	    start= tastiera.nextInt(); tastiera.nextLine();
		
	    System.out.print("end ");
	    end= tastiera.nextInt(); tastiera.nextLine();
	    
	    for (int i=start; i<=end; i++) {
	        sum+=i;
	    }
	    
	    System.out.println((end - start)+1);
	    float avg = (float) sum/((end - start)+1);
	    		
	    		System.out.println("Sum = " + sum);
	    		System.out.println("Averenge = " + avg);


    }
}
