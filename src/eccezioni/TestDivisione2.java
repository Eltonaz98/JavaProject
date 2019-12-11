package eccezioni;

public class TestDivisione2 {

	public static void main(String[] args) {
		String s=null;
		try {
		System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Attenzione, la stringa è vuota --> " + e.getMessage());
		} s="h";
		System.out.println("Forzatura in un carattere " + s);

	}

}
