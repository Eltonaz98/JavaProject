package thread;

public class ThreadMain2 {
	
	public static void main(String[] args) {
		
		Thread tft = new ThreadExtends();
		Thread tfr = new Thread(new ThreadImplements());
		
		
		tft.start();
		tfr.start();
		
		
	}

}
