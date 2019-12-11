package base;

import java.lang.reflect.Array;

public class CicloForEach {
	
	public static void main (String[]args) {
		
		String [] array1;
		array1 = new String[4];
		
		int[] array2 = {100 , 200 , 300 ,400, 500};
		
		array1[0]= " Matteo";
		array1[1]= " Franco";
		array1[2]= " Pietro";
		array1[3]= " Riccardo";
		
		for(int x : array2) {      //int array2 | String array1
			System.out.println(x);
			
		}
		

		
		
//		for(int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
////			
		
		
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
//		System.out.println(array1[3]);
			
		}

}
