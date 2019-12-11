package collection;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(true);
		al1.add(123.45);
		al1.add(98.76f);
		al1.add('*');
		al1.add(new Object());
		
		for (Object x : al1) {
			System.out.println(x + ": " + x.getClass().getSimpleName());
		}
	}

}
