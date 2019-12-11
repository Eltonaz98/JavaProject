package reflection;

public class Auto {

	private String marca, modello;
	protected boolean isDiesel;
	
	private Auto() {
		System.out.println("Io sono il costruttore privato");
		
	}
	
	public Auto(String marca, String modello) {
		System.out.println("Io sono il costruttore pubblico");
		this.setMarca(marca);
		this.setModello(modello);
		
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello + " " + this.isDiesel;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	private boolean isDiesel() {
		return isDiesel;
	}

	private void setDiesel(boolean isDiesel) {
		this.isDiesel = isDiesel;
	}


}
