package interfacce;

public interface Volare {
	
	void decolla();
	void atterra();
	
	default void precipita() {
		System.out.println("Non mi piace precipitare");
	}

}
