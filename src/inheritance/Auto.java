package inheritance;

import interfacce.DimensionareMezziStradali;


public class Auto extends MezzoDiTrasportoStradale implements DimensionareMezziStradali{
	
	int nporte;
	int nposti;
	
	public Auto() {
		
	}
	
	public   Auto(String marca, String modello,String tipo, int nporte, int nposti) {
		super();
		this.setMarca(marca);
		this.setModello(modello);
		this.setNporte(nporte);
		this.setNposti(nposti);
		this.settipo(tipo);
		
	}

	
	
	public int getNporte() {
		return nporte;
	}
	public void setNporte(int nporte) {
		this.nporte = nporte;
	}
	public int getNposti() {
		return nposti;
	}
	public void setNposti(int nposti) {
		this.nposti = nposti;
	}
	@Override
	public boolean impenna() {
		
		return false;
	}
	@Override
	public String toString() {
		
		
		return  ("Marca: " + this.getMarca() + 
				 " Modello : " + this.getModello() + 
				 " Tipo : " + this.getTipo() + 
				 " Porte : " + this.getNporte() + 
				 " Posti : " + this.getNposti() + 
				 " Impenna ? "+ impenna());
	}
	@Override
	public double calcolaArea(double lunghezza, double larghezza) {
		
		return lunghezza * larghezza;
	}
	@Override
	public double calcolaVolume(double lunghezza, double larghezza, double altezza) {
		
		return lunghezza * larghezza * altezza;
		
	}
	
	

}
