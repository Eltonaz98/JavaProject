package base;

public class Persona {
	
	int giorno, mese, anno;
	char sesso;
	String nome, cognome, luogo;
	
	public Persona(String alex, String blue, String roma, char m) {
		nome=alex;
		cognome=blue;
		sesso=m;
		luogo=roma;
		giorno=20;
		mese=5;
		anno=1990;
	}
	
	public Persona(String sara, String brown, String milano, char f, int x) {
		nome=sara;
		cognome=brown;
		sesso=f;
		luogo=milano;
		giorno=2;
		mese=3;
		anno=1998;
	}
	

}


