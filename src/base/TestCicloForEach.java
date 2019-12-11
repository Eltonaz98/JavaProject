package base;

public class TestCicloForEach {
	
	public static void main(String[] args) {
		
		int[] array2 = {100,200,300,400,500};
		
		String[] array1 = new String[4];
		array1[0] = "Matteo";
		array1[1] = "Cristina";
		array1[2] = "Paolo";
		array1[3] = "Alessandro";
		
		
		for (int x: array2) {
			System.out.println(x);
		}
		
	
	}

}
