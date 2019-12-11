package Reflaction;

public class Book {
	
	private String titolo;
	private String autore;
	private double prezzo;
	private int discount;
	
	public Book(String titolo,String autore, int prezzo) {
		
		this.setTitolo(titolo);  // per ottenere i metodi e valori della stessa classe e passarli alla classe che eredità il costruttore
		this.setAutore(autore);
		this.setPrezzo(prezzo);
		
		
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
		if (autore.equalsIgnoreCase("Piero")) {
			setDiscount(20);
			
		}
		
		
	}
	public double getPrezzo() {
		return prezzo - getDiscount();
	}
	public double setPrezzo(double prezzo) {
		return this.prezzo = prezzo;
	}
	private int getDiscount() {
		return discount;
	}
	private void setDiscount(int discount) {
		this.discount = discount;
	}

}
