package Reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAuto {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {

		Auto auto1 = new Auto("Fiat" , "Panda");

		String s = auto1.getClass().getName();
		System.out.println(s);
		System.out.println(Class.forName(s));


		Method[] metodi = new Method[10];
		Constructor[] cnstr = new Constructor[5];
		Field[] fields = new Field[10];

//		System.out.println("Costruttori della classe Auto : ");
//		cnstr = auto1.getClass().getDeclaredConstructors();
//		for (int i = 0; i < cnstr.length;i++) {
//			System.out.println(cnstr[i]);
//		}
//
//		System.out.println("Attributi della classe Auto : ");
//		fields = auto1.getClass().getDeclaredFields();
//		for (int i = 0;i < fields.length; i++) {
//			System.out.println(fields[i]);
//
//		}
		System.out.println("metodi della classe Auto : ");
		metodi = auto1.getClass().getDeclaredMethods();
		for (int i = 0;i < metodi.length; i++) {
			System.out.println(metodi[i]);
			if  (metodi[i].getName().equalsIgnoreCase("setDiesel")) {	
				metodi[i].setAccessible(true);
				Object[] array = new Object[1];
				array[0] = true;
				System.out.println(auto1.getModello());
				metodi[i].invoke(auto1, array);
				System.out.println(auto1.getModello());
			}
			if  (metodi[i].getName().equalsIgnoreCase("isDiesel")) {	
				metodi[i].setAccessible(true);
				//				Object[] array = new Object[1];
				//				array[0] = true;
				//				System.out.println(auto1.getModello());
				metodi[i].invoke(auto1);
				System.out.println(metodi[i].invoke(auto1));
			}
		}


	}

}
