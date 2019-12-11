package eccezioni;

public class StringNull {
	
	public static void main(String[]args) {
	
	String s = null;
	try {
	s.length();
	}catch(NullPointerException f) {
		System.out.println("La Stringa s non ha nessun valore");
	} finally {
		System.out.println("Devi dare un valore String a s");;
	}
	
	
	


}
}