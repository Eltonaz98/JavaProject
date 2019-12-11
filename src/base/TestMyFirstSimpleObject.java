package base;

public class TestMyFirstSimpleObject {
	
	public static void main(String[] args) {
		
		MyFirstSimpleObject mfso1 = new MyFirstSimpleObject();
		MyFirstSimpleObject mfos2 = new MyFirstSimpleObject();
		
		System.out.println("mfso1");
		System.out.println("mfso2");
		
		mfso1.bool1 = true;
		mfso1.bool2 = true;
		mfso1.variabile1 = 100;
		mfso1.variabile2 = 200;
		mfso1.nome = "Pippo";
		
		mfso1.metodo1();
		System.out.println("----------");
		
		
		
	}

}
