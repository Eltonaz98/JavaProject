package array;

public class TestMetodi {
	
	public static void main(String[]args) {
		
		//metodo senza parametri in ingresso ed uscita
		calcolaMetodo1();
		
		//Metodo senza parametri in ingresso che restituisce un intero
		
		int val1 = calcolaMetodo2();
		System.out.println("Il metodo senza parametri in ingresso restituisce" + " Un intero del seguente valore" + val1);
		
		
		//Metodo che passa un valore booleano e restituisce una stringa
		String s = calcolaMetodo3(false);
		System.out.println("Il metodo che passa un valore boolean e restituisce una stringa" + " del seguente valore" + s);
		
		//Metodo che accetta più valori in ingresso
		calcolaMetodo4(10, 20, '&', true, "pippo");
		
		//Overload 
		calcolametodo4(10, 20);
		
		//Metodo che accetta in ingresso un array
		int[] array1 = {10, 20, 30, 40, 50};
		char[]array2 = {'a', 'b', 'c'};
		calcoloMetodo5(array1, array2);
		
		//Metodo che ritorna un array di char
		char[]arc1 = calcolaMetodo6(1,2,3,4,5);
		for(char x : arc1) System.out.println(x);
			
	}
	private static char[] calcolaMetodo6(int i, int j, int k, int l, int m) {

		char[] return_array = new char [5];
		
			return_array[i-1] = 'a';
			return_array[j-1] = 'b';
			return_array[k-1] = 'c';
			return_array[l-1] = 'd';
			return_array[m-1] = 'e';
			return return_array;
			
		
	}
	private static void calcoloMetodo5(int[] array1, char[] array2) {
		for(int x : array1)System.out.println(x);
		for(char x : array2)System.out.println(x);
	
			
	}
	private static void calcolametodo4(int i, int j) {
		   System.out.println("primo parametro : " + i);
		   System.out.println("secondo parametro : " + j);
		
	}
	private static void calcolaMetodo4(int i, int j, char c, boolean b, String s) {
		   System.out.println("primo parametro : " + i);
		   System.out.println("secondo parametro : " + j);
		   System.out.println("terzo parametro : " + c);
		   System.out.println("quarto parametro : " + b);
		   System.out.println("quinto parametro : " + s);
		   
	}
	private static String calcolaMetodo3(boolean b) {
		if(b == false) return " Falso ";
		else return " Vero ";
		
		
	}
	private static int calcolaMetodo2() {
		return 10 + 20;
		
		
	}
    private static void calcolaMetodo1() {
    	
    	System.out.println("Io sono il metodo senza parametri in ingresso ed uscita");
    	
    }
}
