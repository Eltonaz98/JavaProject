package esercizio;

public class Persona {
	
	private String nome;
	private int eta;
	private int posto;
	
   
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public int getPosto() {
		return posto;
	}
	
	public void setPosto(int posto) {
		this.posto = posto;
	}
	
	public String toString() {
		return "Persona [nome=" + this.getNome() + ", eta=" + this.getEta() + ", posto=" + this.getPosto() + "]";
	}


}