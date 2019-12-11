package inheritance;

public class SociBase extends Iscritti {
	
	public SociBase(String nome, String data, int tassa, int sconto) {
		super(nome, data, tassa,sconto);
		this.setTassa (this.calcolatassaiscr(10));
		
	}
	
	public SociBase(String nome, String data, int tassa) {
		super(nome,data,tassa);
	}
		
	    @Override
	    public int calcolatassaiscr(int cti ) {
	    return super.calcolatassaiscr(cti*2);
		
		
	}

}
