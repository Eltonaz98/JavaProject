package inheritance;

public class TestMezzoDiTrasportoStradale {


	public static void main(String[] args) {
		
		 
		
		 Auto a1=new Auto("Fiat", "Panda", "CytiCar", 4, 4);
		 Auto a2=new Auto("aaaa", "bbbb", "cccc", 4, 3);
		 Moto m1=new Moto("dddd", "ffff", "gggg", 2, false);
		 Moto m2=new Moto("hhhh", "jjjj", "llll", 3, true);
		 
		System.out.println(a1.toString()); 
		System.out.println(a2.toString());
		System.out.println(m1.toString());
		System.out.println(m2.toString());

		
	}

 


}
