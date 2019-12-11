package OOP;

public class Incapsulamento {
	
	private String nome;
	private String cognome = "Tona";
	private String password;
	
	public void setNome(String variabile) {
		if(this.cognome.contentEquals("Tona")) this.nome = variabile;
		else System.out.println("Operazione non autorizzata");
		
	}
	public String getNome() {
		return nome;
	}
	public void setCognome(String variabile) {
		this.cognome = variabile;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	
	

}
