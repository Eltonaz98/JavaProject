package modificatori;

public class FiglioDiI4Modificatori extends I4Modificatori{
	
	@Override
	public void stampa() {
		
		System.out.println("Valore della variabile b = " + this.getB());
		System.out.println("Valore della variabile c = " + this.getC());
		System.out.println("Valore della variabile d = " + this.getD());
		super.stampa();
	}
       
	public void metodo1() {
		super.c = 1111;
		this.c = 2222;
		System.out.println(super.c);
		super.stampaReference();
		System.out.println(this);
		
	}
}
