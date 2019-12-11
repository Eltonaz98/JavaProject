package modificatori;

public class TestI4Modificatori {
	
	public static void main(String[]args) {
		
		I4Modificatori i4m = new I4Modificatori();
		FiglioDiI4Modificatori fi4m = new FiglioDiI4Modificatori();
		
		i4m.b = 21;
		i4m.c = 31;
		i4m.c = 41;
		
		i4m.stampa();                        //posso utilizzare per stampare il metodo stampa()
//		System.out.println(fi4m.getB()); 
//		System.out.println(fi4m.getC());
//		System.out.println(fi4m.getD());
		
		System.out.println(" -----------");
		
		fi4m.b = 220;
		fi4m.c = 330;
		fi4m.d = 440;
		
		fi4m.stampa();                      //posso utilizzare per stampare il metodo stampa()
//		System.out.println(fi4m.getB()); 
//		System.out.println(fi4m.getC());
//		System.out.println(fi4m.getD());
		
		System.out.println(" -----------");
		
		fi4m.metodo1();
		
	}
	

}
