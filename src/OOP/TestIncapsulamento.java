package OOP;

public class TestIncapsulamento {
	
	public static void main(String[]args) {
		Incapsulamento icps1 = new Incapsulamento();
		icps1.setNome("Alessandro"); 
		icps1.setCognome("Tona"); 
		System.out.println(icps1.getNome() + " " + icps1.getCognome());
		icps1.setCognome("Ciccio Pasticcio");
		System.out.println(icps1.getNome() + " " + icps1.getCognome());
		
		
		
		
	}

}
