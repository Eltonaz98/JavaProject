package collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class TestArrayListColors {

	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		do {
			System.out.println("Inserisci un colore (scrivi stop per fermarti): ");

			String colore=sc.nextLine();

			if(colore.equalsIgnoreCase("stop"))
				break;

			v.add(colore);
		}while(true);

		for (Object x : v) {
			System.out.println(x + ": " + x.getClass().getSimpleName());
		}

			
//
//		System.out.println("\n--------- con ciclo for normale -----------");
//
//		for (int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i));
//		}
	
	}
	 
}
