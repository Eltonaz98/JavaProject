package eccezioni;

public class MyClass {
	
	int y;
	
	public void  metodo() {
		
		try {
			int i = 2 / y;
		}
		catch(NullPointerException n) {
			y += 3;
		}
		catch(RuntimeException r) {
			  y += 5;
			  return;
		}
		catch ( Exception e) {
			y += 7;
			
		}finally {
			y += 6;
			
		}
		y += 4;
		
	}
	public static void main(String[]args) {
		MyClass mc = new MyClass();
		mc.metodo();
		System.out.println(mc.y);
	}

}
