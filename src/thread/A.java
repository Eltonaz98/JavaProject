package thread;

public class A implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Io sono la classe A. " + Thread.currentThread().getName());
		
	}

}
