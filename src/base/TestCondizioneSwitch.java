package base;

public class TestCondizioneSwitch {
	
	public static void main(String[]args) {
		
		int x = 10;
		switch(x)  {
		
		case 0: 
			System.out.println("x non è stato valorizzato");
			break;
		case 10:
			System.out.println("x è stato valorizzato");
			break;
		case 100: case 200: case 300:
			System.out.println("x è stato ben valorizzato");
			break;
		default:
			System.out.println("x è stato valorizzano? Bene o Male? Mah...");
			break;
		}
	}

}
