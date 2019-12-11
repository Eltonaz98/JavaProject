package thread;

public class ThreadFromThread extends  Thread{

	@Override
	public void run() {
		for(int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1500);
				System.out.println(this.getName()+ " " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	
	}
	

	
}
