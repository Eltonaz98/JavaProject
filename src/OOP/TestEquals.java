package OOP;

public class TestEquals {
	
	public static void main(String[]args) {
		Incapsulamento p1 = new Incapsulamento();
		p1.setNome("Alessandro");
        p1.setCognome("Tona");
	Incapsulamento p2 = new Incapsulamento();
	p2.setNome("Alessandro");
	p2.setCognome("Tona");
	
	System.out.println(p1.getNome().equalsIgnoreCase(p2.getNome()));  //compara 2 oggetti e indipendentemente dalle lettere maiuscole o minuscole
	                                                                  // se risulta lo stesso contenuto stampa true, caso contrario false
	}
	
	

}
