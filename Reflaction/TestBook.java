package Reflaction;

public class TestBook {
	
	public static void main(String[] args) {
		
		
		Book book1 = new Book("Alla ricerca di nemo ", "Piero", 30);
		Book book2 = new Book("Alla ricerca della felicità", "Gianni" , 40);
		
		System.out.println("Autore : " + book1.getAutore() +" Titolo : " + book1.getTitolo() +" Prezzo : " + book1.getPrezzo());
		System.out.println("Autore : " + book2.getAutore() +" Titolo : " + book2.getTitolo() +" Prezzo : " + book2.getPrezzo());
	}
	
}
