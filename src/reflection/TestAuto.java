package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAuto {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Auto auto1 = new Auto("Fiat", "Panda 1000 5P");
		
		String s = auto1.getClass().getName();
		System.out.println(s);
		
		System.out.println("\n" + Class.forName("interfacce.Interfaccia1"));
		
		System.out.println("\n*** ELENCO COSTRUTTORI PUBBLICI ***\n");
		
		Constructor[] constructors = new Constructor[10];
		Field[] fields = new Field[10];
		Method[] methods = new Method[10];
		
		constructors = auto1.getClass().getDeclaredConstructors();	
		for (int i=0; i<constructors.length; i++) {
			System.out.println(constructors[i]);
		}

		System.out.println("\n*** ELENCO ATTRIBUTI PUBBLICI ***\n");
		
		fields = auto1.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
			
		}
		
		System.out.println("\n*** ELENCO METODI PUBBLICI ***\n");
		
		methods = auto1.getClass().getDeclaredMethods();
		      for (int i=0; i < methods.length; i++) {
		    	  System.out.println(methods[i]);
		    	  if (methods[i].getName().equalsIgnoreCase("setDiesel")) {
		                methods[i].setAccessible(true);
		                Object[] array = new Object[1];
		                array[0] = true;
						methods[i].invoke(auto1, array);
						System.out.println(auto1.getModello());
		    	  }  
		      }
	}

}
