package thread;

public class ThreadExtends extends Thread{


	public void run() {
		for (int i = 0; i < 15;i++) {
			System.out.println("Numero di giorni trascorsi : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}


	}
}