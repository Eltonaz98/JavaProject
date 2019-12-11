package inheritance;

public class Gatto extends Animale {
	
	public void presentati() {
		super.presentati();
	System.out.println("Io sono il gatto");
	
	}
	
	public void verso() {
		super.verso();
		System.out.println("Miaoo Miaoo");
		
	}
}
