package inheritance;

public class TestMezziDiTrasportoStradale {
	
	
	
	
	public static void main(String[]args) {
		
//		MezzoDiTrasportoStradale[] listamezzi  = new MezzoDiTrasportoStradale [4];
//		
//		
//		listamezzi[0] = new Auto();
		
		
		Auto a1 = new Auto("audi ","a6 ","Stationwagon ",4,6);
		System.out.println("Macchina n 1 : " + a1.toString() + " Area " + a1.calcolaArea(150, 70) + " Volume " + a1.calcolaVolume(150, 70, 3));
		
		Auto a2 = new Auto("Ferrari ", "California ","Sportiva ",2,2);
		System.out.println("Macchina n 2 : " + a2.toString() +" Area " + a2.calcolaArea(100, 50)+ " Volume "  + a2.calcolaVolume(100, 50, 2));
		
		Moto m1 = new Moto("Yamaha ","R6 ", "Citybrum ",2,true);
		System.out.println("Moto n 1 : " + m1.toString());
		
		Moto m2 = new Moto("Harley Davidson ","883 ","SuperSport ",3,false );
		System.out.println("Moto n 2 : " + m2.toString());
		
		
	}

}
