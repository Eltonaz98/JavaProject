package base;

import java.util.Scanner;

public class TestImpiccato {
	
	public static void main(String[] args) {
		
		char[] parola_array = new char[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire la parola da indovinare");
		String parola = sc.nextLine();
		
		for (int i = 0; i < 25; i++) {
			System.out.println("x");
		}
		
		parola_array = parola.toCharArray();
		System.out.println(parola_array);
		int lengthparola = (parola.length() - 2 );
		System.out.println("Numero di tentativi a disposizione " + lengthparola);
		
		for (int i = 0; i < parola_array.length; i++) {
			if (i == 0) {
				System.out.print(parola_array[i]);
				continue;
			}
			if (i == parola_array.length - 1 ) {
				System.out.print(parola_array[i]);
				break;
			}
			System.out.print("_");
		}
	}

}
