package inheritance;

public class TestABC {
	
	public static void main(String[]args) {
		
		C c = new C();
		A a = new A();
		System.out.println("io sono il reference creato nella classe c" + c);
		
		System.out.println("c è un ' istanza di C? " + (c instanceof C));
		System.out.println("c è un ' istanza di B? " + (c instanceof B));
		System.out.println("c è un ' istanza di A? " + (c instanceof A));
		System.out.println("c è un ' istanza di C? " + (c instanceof Object));
		System.out.println("a è un ' istanza di C? " + (a instanceof C));
	}

}
