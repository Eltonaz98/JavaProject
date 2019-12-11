package interfacce;

public class AereoDiLinea implements Volare {

	@Override
	public void decolla() {
		System.out.println("Ho bisogno sempre di un aereoporto di notevoli dimensioni");
		
	}

	@Override
	public void atterra() {
		System.out.println("Dopo l'atterraggio scatta sempre l'applauso");
		
		
	}

}
