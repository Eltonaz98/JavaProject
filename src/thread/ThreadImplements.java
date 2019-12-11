package thread;

public class ThreadImplements implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3;i++) {
			System.out.println("numero di settimane trascorse : " + i);
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				
			}
		}



	}

}
