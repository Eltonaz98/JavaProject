package thread;

public class TestAB {
	
	public static void main(String[] args) {
		
		
		System.out.println("Io sono la classe TestAB " + Thread.currentThread().getName() );
		
		Thread t1 = new Thread(new ClasseA());
		Thread t2 = new Thread(new ClasseB());
		Thread t3 = new Thread(new A());
		Thread t4 = new Thread(new B());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
