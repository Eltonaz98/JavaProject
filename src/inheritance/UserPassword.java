package inheritance;

import java.util.Scanner;

public class UserPassword {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digitare Exit per uscire");
				System.out.println("------------------------");
				
				do {
				
				System.out.println("Inserire l' username : ");
				String user = sc.nextLine();
				System.out.println("Inserire password : ");
				String psw = sc.nextLine();
				if (user.contentEquals(args[0])) {
			     if(psw.contentEquals(args[1]));
			     System.out.println("Password e nome utente corretti");
			     break;
			     
				}
				else  System.out.println("Users e Password errati");
				continue;
				 
				
					 
				}while(true);
	}

}
