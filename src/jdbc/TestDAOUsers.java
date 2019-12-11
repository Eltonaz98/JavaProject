package jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDAOUsers {

	static Users user;                               //DTO
	static DAOUsers dui = new DaoUsersImplements();  //DAO
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        
		try {
			dui.connessione();
		} catch (SQLException e) {
			System.out.println("Connessione non riuscita : " + e.getMessage());
		}
		int scelta;
		menù();

		do{
			scelta = sc.nextInt();
			switch (scelta) {
			case 1: inserimento(); break;
			case 2: Modifica();  break;
			case 3: Lettura(); break;
			case 4: Usersall(); break;
			case 5: Cancellazzione(); break;
			case 9: Commitrollback();
			default : System.out.println("Scelta non consentita");

			}
		}while(scelta != 9);
	}

	private static void Cancellazzione() {


		System.out.println("Inserire l' id dell' utente che si vuole rimuovere");


		try {
			dui.deleteUser (sc.nextInt());sc.nextLine();
		} catch (SQLException e) {
			System.out.println("problema durante l 'eliminazione: " + e.getMessage());
		}


	}

	private static void Usersall() {


		try {
			System.out.println("Utenti registrati nel database:  ");
			for (Users k : dui.getAllUsers()) {
				k.printusers();
			}  

			if (user != null) {
				user.printusers();
			}
		} catch (SQLException e) {
			System.out.println("Si è verificato un errore durante la lettura degli users : " + e.getMessage());
		}





	}

	private static void Modifica() {

		user = new Users();

		System.out.println("Inserire l' id dell' utente che si vuole modificare ");
		user.setId(sc.nextInt()); sc.nextLine();
		try {
		if (dui.checkid(user.getId()) == true ) {
			System.out.println("Inserire nome");
			user.setNome(sc.nextLine());
			System.out.println("Inserire luogo della risiedenza ");
			user.setAddress(sc.nextLine());
			System.out.println("Inserire email");
			user.setEmail(sc.nextLine());
			System.out.println("Inserire numero di telefono");
			user.setPhone(sc.nextLine());
		

			
				dui.updateUser(user);
		}else System.out.println("L' id inserito non è presente nel DB");
			} catch (SQLException e) {
				System.out.println("Si è verificato un errore in fase di modifica: " + e.getMessage());

			}


		}

		private static void Lettura() {

			try {
				System.out.println("Specifica l' id di cui si vuole acquisire le informazioni ");
				user = dui.getUser(sc.nextInt());
				sc.nextLine();
				if (user != null) {
					user.printusers();
				}
			} catch (SQLException e) {
				System.out.println("Si è verificato un errore durante la lettura dello user : " + e.getMessage());
			}



		}

		private static void inserimento() {

			user = new Users();
			System.out.println("Inserire l' id del nuovo utente ");
			user.setId(sc.nextInt());sc.nextLine();
			try {
				if (dui.checkid(user.getId()) == false ) {
			System.out.println("Inserire nome");
			user.setNome(sc.nextLine());
			System.out.println(" Inserire luogo della risiedenza ");
			user.setAddress(sc.nextLine());
			System.out.println("Inserire email");
			user.setEmail(sc.nextLine());
			System.out.println("Inserire numero di telefono");
			user.setPhone(sc.nextLine());

			
				dui.addUsers(user);
				}else System.out.println("L' id è gia presente");
			} catch (SQLException e) {
				System.out.println("Si è verificato un errore durante l ' inserimento: " + e.getMessage());
				e.printStackTrace();
			}
		}

		private static void menù() {
			System.out.println("***GESTIONE UTENTI***");
			System.out.println("*1.Inserimento*******");
			System.out.println("*2.Modifica**********");
			System.out.println("*3.Lettura***********");
			System.out.println("*4.Tutti gli utenti**");
			System.out.println("*5.Cancellazzione****");
			System.out.println("*9.Uscita************");

		}
	
        private static void Commitrollback() {
        	
        	try {
				dui.commitrollback();
			} catch (SQLException e) {
				System.out.println("Si è verificato un errore durante il salvataggio!");
			}
        }
}




