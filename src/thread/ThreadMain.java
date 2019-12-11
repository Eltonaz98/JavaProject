package thread;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		Thread tft = new ThreadFromThread();
		Thread tfr = new Thread(new ThreadFromRunnable());
		
		tft.setName("Thread From Class Thread");
		tft.setPriority(1);
		tft.setDaemon(true);
		
		tfr.setName("Thread From Interface Runnable");
		tfr.setPriority(10);
		tfr.setDaemon(false);
		
		
		tft.start();
		tfr.start();
		
		
	}

}
