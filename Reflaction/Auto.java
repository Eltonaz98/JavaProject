package Reflaction;

public class Auto {
	
	private String marca;
	private String modello;
    protected boolean isDiesel;
	
	private Auto() {
		System.out.println("Io sono il costruttore privato");
	}

	
		public Auto(String marca, String modello) {
		this.setMarca(marca);
		this.setModello(modello);
		System.out.println("Io sono il costruttore pubblico");
		}
		
		public void vendita() {
			this.setMarca(marca);
			this.setModello(modello);
			System.out.println("Sono il metodo per la vendita");
		}
		
		private boolean isDiesel() {
			return isDiesel;
		}


		private void setDiesel(boolean isDiesel) {
			this.isDiesel = isDiesel;
		}


		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModello() {
			return modello + " Diesel?  " + this.isDiesel();
		}
		public void setModello(String modello) {
			this.modello = modello;
		}
		
	
}
