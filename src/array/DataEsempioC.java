package array;

public class DataEsempioC {

	int giorno;
	int mese;
	int anno;
	
	public DataEsempioC() {
		giorno = 18;
		mese = 11;
		anno = 2019;
		System.out.println("io sono metodo costruttore 1");
		
	}
	
	public DataEsempioC(int gg, int mm) {
		this();
		giorno = gg;
		mese = mm;
		anno = 2019;
		System.out.println("io sono metodo costruttore 2");
				
	}
	public DataEsempioC(int aa) {
		giorno = 18;
		mese = 11;
		anno = aa;
		System.out.println("io sono metodo costruttore 3");
	}
	public void esempio() {
		System.out.println("io sono un metodo");
		
	}
	}
