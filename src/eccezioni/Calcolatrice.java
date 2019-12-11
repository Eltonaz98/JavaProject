package eccezioni;

public class Calcolatrice {
	
	int addizzione(int x, int y) {
		return x + y;
	}
	
	int sottrazzione(int x, int y) {
		return x - y;
	}
	int[] divisione(int x, int y) {
		//Questo metodo calcola la divisione tra 2 numeri e ritorna valore della divisione con il relativo resto
		
		int[] risultati = new int[2];
		
		risultati[0] = x/y;
		risultati[1] = this.resto(x, y);
		
		return risultati;
	}
	int moltiplicazione(int x, int y) {
		return x * y;
	}
	private int resto(int x, int y) {
		return x % y;
	}

}
