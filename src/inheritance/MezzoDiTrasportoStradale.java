package inheritance;

public abstract class MezzoDiTrasportoStradale {
	
	
	private String marca;
	private String modello;
	private String tipo;
	
	
	
	
	public  MezzoDiTrasportoStradale() {
		
	}
	
	public  MezzoDiTrasportoStradale(String marca, String modello,String tipo) {
		this.setMarca(marca);
		this.setModello(modello);
		this.settipo(tipo);
			
	}
	public abstract boolean impenna ();
	public abstract String toString();
	
	
		
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}	
		
	}


