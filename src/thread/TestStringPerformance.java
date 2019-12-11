package thread;

public class TestStringPerformance {
	
	public static void main(String[] args) {
		String string = "Ciao";
		StringBuilder sb = new StringBuilder("Ciao");
		StringBuffer sbuff = new StringBuffer("Ciao");
		
		long start,end;
		
		start = System.nanoTime();
	    for (int i = 0; i < 1000; i++) {
			string = (string + i);
			
		}
		end = System.nanoTime();
		System.out.println("Elapsed time for String: " + (end - start));
		
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			sb.append(i);
			
		}
		end = System.nanoTime();
		System.out.println("Elapsed time for StringBuilder: " + (end - start));
		
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			sbuff.append(i);
			
		}
		end = System.nanoTime();
		System.out.println("Elapsed time for StringBuffer: " + (end - start));
		
	}

}
