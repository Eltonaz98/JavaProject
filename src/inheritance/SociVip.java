package inheritance;

public class SociVip extends Iscritti {
	
	public SociVip(String nome, String data, int tassa, int sconto) {
		super(nome, data, tassa, sconto);
		this.setTassa (this.calcolatassaiscr(10));
		
	}

	public SociVip(String nome, String data, int tassa) {
		super(nome,data,tassa);
	}
	
	public int calcolatassaiscr(int cti) {
		return super.calcolatassaiscr(cti*3);
		 
	}

}
