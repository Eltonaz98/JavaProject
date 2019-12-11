package eccezioni;

import java.util.Scanner;

public class TestArrayEccezzione {
	
	public static void main(String[]args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Inserire lunghezza array  ");
		int x = sc.nextInt();
		
		int[] array = new int[x];
		
		
		for(int i = 0; i< (x+1);i++) {
//		array[i] = i;
//		System.out.println(array[i]);
		try {
			array[i] = i;
		System.out.println(array[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Operazione non consentita");
			
		}
		
		
		}
		
	}

}
