package base;

import javax.swing.JOptionPane;
//import java.util.Scanner;                                //sotto commento la seconda versione di input

public class InputDaTastiera {

	//private static Scanner sc;
	
	public static void main(String[] args) {
		
		//sc = new Scanner(System.in);
		
		//System.out.print("Digitare il valore della x: ");
		//x= sc.nextInt(); sc.nextLine();
		
		String x = JOptionPane.showInputDialog("Prego inserire un valore: ");
		JOptionPane.showMessageDialog(null, "Hai digitato il seguente valore" + x);
		
	}
}
