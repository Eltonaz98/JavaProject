package base;

import java.util.Scanner;

public class TestMetodi {

	
	public static void main(String[]args) {
		int x, y, z;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("inserire il valore di x ");
		x = sc.nextInt(); sc.nextLine();
		System.out.print("inserire il valore di y ");
		y = sc.nextInt(); sc.nextLine();
		System.out.print("inserire il valore di z ");
		z = sc.nextInt(); sc.nextLine();
		metodoSomma(x, y, z);
		metodoMoltiplica(x,y,z);
		
		
	}
		
		static private void metodoSomma(int x, int y, int z) {
			System.out.println("Somma : " + (x+y+z));
			
			}
	
		static private void metodoMoltiplica(int x,int y,int z) {
			System.out.println("Moltiplicazione : " + (x*y*z));
			
		}
		
		
		
		
	}
	
