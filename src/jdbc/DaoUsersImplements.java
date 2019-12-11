package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;



public class DaoUsersImplements implements DAOUsers{

	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
	final String userdb = "root";
	final String pwd = "admin";
	Connection conn;
	String sql;
	PreparedStatement pstmt;
	ResultSet rs;
	Users user;
	List<Users> usersall;
	Scanner sc = new Scanner(System.in);

	public void connessione() throws SQLException {
		if (user != null) {
			conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
			conn.setAutoCommit(false);
		}
	}
	
	@Override
	public Users getUser(int id) throws SQLException {

		user = null;
		conn = ConnessioneDB.openConnect (driver, url, userdb, pwd);
		if(conn != null) {

			sql= "Select * From users where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) System.out.println("**Attualmente non è presente l' id che hai inserito");
			else {
				while(rs.next()){
					user = new Users();
					user.setId( rs.getInt("id") );
					user.setNome(rs.getString("name"));
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
				}
			}
		}



		return user;

	}



	@Override
	public List<Users> getAllUsers() throws SQLException {

		
		List <Users> usersall = new ArrayList();

		if (conn != null) {

			sql = "Select * From Users"	;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (!rs.isBeforeFirst()) System.out.println("**Attualmente non sono presenti dati nel db");
			else {
				while(rs.next()){
					user = new Users();
					user.setId( rs.getInt("id") );
					user.setNome(rs.getString("name"));
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
					usersall.add(user);
				}
			}
		}


		return usersall;
	}

	@Override
	public void addUsers(Users user) throws SQLException {
     
		
		if(user != null) {
			if(conn != null) {
				if(StringUtils.isNumeric(user.getPhone())) {
				sql = "insert into users (id, name, address, email, phone) values (?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, user.getId());
				pstmt.setString(2, user.getNome());
				pstmt.setString(3, user.getAddress());
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getPhone());
				pstmt.executeUpdate();
				System.out.println("***Inserimento avvenuto correttamente***");
				}else System.out.println("Numero inserito non corretto");
			}
		} else System.out.println("Fottiti");


	}

	@Override
	public void updateUser(Users user) throws SQLException {

	
			if(conn != null) {
				sql = "Update users Set name = ?, address = ?, email = ?, phone = ? Where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getNome());
				pstmt.setString(2, user.getAddress());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPhone());
				pstmt.setInt(5, user.getId());
				pstmt.executeUpdate();

				System.out.println("***Inserimento avvenuto correttamente***");
			}



		
	}

	
	public void deleteUser(int id) throws SQLException {

        
	
		
		if(conn != null) {
			sql = "Delete  From Users Where id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			System.out.println("Vuoi confermare l' operazione? si / no");
			String scelta = sc.nextLine();
			if (scelta.equalsIgnoreCase("si")) {
				conn.commit();
				System.out.println("***Cancellazzione effettuata con successo***");
			} else conn.rollback();
			System.out.println("****Cancellazzione annullata****");
		}
		
	}

	public boolean checkid(int id) throws SQLException {

		
		if(conn != null) {
			sql = "Select id From Users Where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

		}

		return rs.isBeforeFirst();
	}

    public void commitrollback() throws SQLException {
    	
    
			System.out.println("Vuoi confermare le operazioni effettuate? si / no");
			String scelta = sc.nextLine();
			if (scelta.equalsIgnoreCase("si")) {
				conn.commit();
				System.out.println("***Cancellazzione effettuata con successo***");
				
			} else conn.rollback();
			System.out.println("****Cancellazzione annullata****");
    }
}