package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestPerformance {

	public static void main(String[] args) {
		
		List<String> v = new Vector();
		List<String> a = new ArrayList();
		List<String> l = new LinkedList();
		
		long start,end;
		
		for (int i=0; i<10000; i++) {
			v.add("Ciao" + i);
		}
		
		System.out.println("Size of vector: " + v.size());
		
		start=System.nanoTime();
		for (int i=0; i<10000; i++) {
			v.get(i);
		}
		end=System.nanoTime();
		System.out.println("Elapsed time for Vector: " + (end-start));
		
		a=v;
		start=System.nanoTime();
		for (int i=0; i<10000; i++) {
			a.get(i);
		}
		end=System.nanoTime();
		System.out.println("Elapsed time for ArrayList: " + (end-start));
		
		l=v;
		start=System.nanoTime();
		for (int i=0; i<10000; i++) {
			l.get(i);
		}
		end=System.nanoTime();
		System.out.println("Elapsed time for LinkedList: " + (end-start));
			
		
	}

}
