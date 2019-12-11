package thread;

public class ThreadFromRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + i);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
	

}
