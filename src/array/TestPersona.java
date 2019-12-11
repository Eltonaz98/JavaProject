package array;

public class TestPersona {
	public static void main(String[]args) {

	Persona p1 = new Persona();
	Persona p2 = new Persona("Paolo",'M',"Milano");
	
	System.out.println("Utente p1: " + p1.nome + " " + p1.cognome + " " + p1.sesso + " " + p1.cod_fiscale + " " + p1.anno + " " + p1.luogo_nascita); 
	System.out.println("Utente p2: " + p2.nome + " " + p2.cognome + " " + p2.sesso + " " + p2.cod_fiscale + " " + p2.anno + " " + p2.luogo_nascita);
				
}
}