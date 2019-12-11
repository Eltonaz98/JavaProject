package array;

public class TestDataEsempioC {
	public static void main(String[]args) {
		
	
	DataEsempioC de1 = new DataEsempioC();
	DataEsempioC de2 = new DataEsempioC(1985);
    DataEsempioC de3 = new DataEsempioC(14, 7);
    
    System.out.println("Data dell' oggetto de1: " + de1.giorno + "." + de1.mese + "." + de1.anno);
    System.out.println("Data dell' oggetto de1: " + de2.giorno + "." + de2.mese + "." + de2.anno);
    System.out.println("Data dell' oggetto de1: " + de3.giorno + "." + de3.mese + "." + de3.anno);
	
    de1.esempio();
	}
	
}
