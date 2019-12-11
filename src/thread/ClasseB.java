package thread;

public class ClasseB implements Runnable{

	@Override
	public void run() {
	
		System.out.println("Io sono la classe ClasseB. " + Thread.currentThread().getName());
		
	}
	
	

}
