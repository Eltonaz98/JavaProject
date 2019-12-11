package interfacce;

public class Elicottero implements Volare {

	@Override
	public void decolla() {
		System.out.println("Decollo sempre in linea verticale");
		
	}

	@Override
	public void atterra() {
		System.out.println("Atterro sempre in linea verticale");
		
	}

    public void caricoLeArmi() {
    	System.out.println("");
    }
    
    public void prendereLaMiraESparare() {
    System.out.println("");
    }


}



