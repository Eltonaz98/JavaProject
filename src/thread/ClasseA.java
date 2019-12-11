package thread;

public class ClasseA implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Io sono la classe ClasseA. " + Thread.currentThread().getName());
		
	}

}
