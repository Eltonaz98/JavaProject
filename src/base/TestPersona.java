package base;

public class TestPersona {
	
	public static void main(String[] args) {
		
		Persona p1=new Persona("Alex", "Blue", "roma", 'm');
		Persona p2=new Persona("Sara", "Brown", "milano", 'f', 2);
		
		System.out.println("Nome "+p1.nome+"\nCognome "+p1.cognome+"\nLuogo di nascita "+p1.luogo+"\nSesso "
		+p1.sesso+"\nData "+p1.giorno+"."+p1.mese+"."+p1.anno);
		
		System.out.println("\nNome "+p2.nome+"\nCognome "+p2.cognome+"\nLuogo di nascita "+p2.luogo+"\nSesso "
				+p2.sesso+"\nData "+p2.giorno+"."+p2.mese+"."+p2.anno);
	}

}
