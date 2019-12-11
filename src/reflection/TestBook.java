package reflection;

import java.util.Scanner;

public class TestBook {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		Book b1 = new Book("Apple", "Steve", 60);
		Book b2 = new Book("Sky", "Jordan", 50);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		

	}

}
