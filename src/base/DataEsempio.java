package base;

public class DataEsempio {
	
	int giorno, mese, anno;
	
	public DataEsempio() {
		giorno=18;
		mese=11;
		anno=2019;
	}
	
	public DataEsempio(int gg, int mm ) {
		this();
		giorno=gg;
		mese=mm;
		anno=2019;
	}
	
	public DataEsempio(int aa) {
		giorno=18;
		mese=11;
		anno=aa;
	}

}
