package inheritance;



public class Moto extends MezzoDiTrasportoStradale {
	
	int nruote;
	boolean sidecar;
	
	public   Moto(String marca, String modello,String tipo, int nruote, boolean sidecar) {
		super();
		this.setMarca(marca);
		this.setModello(modello);
		this.setNruote(nruote);
		this.setSidecar(sidecar);
		this.settipo(tipo);
	}
	
	public int getNruote() {
		return nruote;
	}
	public void setNruote(int nruote) {
		this.nruote = nruote;
	}
	public boolean isSidecar() {
		return sidecar;
	}
	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	@Override
	public boolean impenna() {
		if (nruote != 2) {
		return  false;
		}else 
		return true;
		
	}
	@Override
	public String toString() {

		return ("Marca: " + this.getMarca() + 
				"Modello : " + this.getModello() + 
				"Tipo : " + this.getTipo() + 
				"nruote: " + this.getNruote() + 
				" Sidecar? " +this.sidecar + 
				" Impenna? " + impenna()); 
	
	}

	
	
}
