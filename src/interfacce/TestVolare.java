package interfacce;

public class TestVolare {
	
	public static void main(String[] args) {
		
		Elicottero eli=new Elicottero();
		AereoDiLinea aereo=new AereoDiLinea();
		
		eli.decolla();
		aereo.decolla();
		
		eli.atterra();
		aereo.atterra();
	}

}
