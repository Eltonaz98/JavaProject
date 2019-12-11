package reflection;

public class Book {
	
	private String titolo, autore;
	private int prezzo, sconto;
	
	public Book(String t, String a, int p) {
		this.setTitolo(t);
		this.setAutore(a);
		this.setPrezzo(p);
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
	}
	public int getPrezzo() {
		return prezzo - getSconto();
	}
	public void setPrezzo(int prezzo) {
		if (this.getAutore().equalsIgnoreCase("Steve")) {
			this.setPrezzo(20);
	}
		}
	private int getSconto() {
		return sconto;
	}
	private void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	public String toString() {
		return "Book [titolo=" + this.getTitolo() + ", autore=" + this.getAutore() + ", prezzo=" + this.getPrezzo() + "]";
	}

}
