package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCommitRollBack {

	public static void main(String[] args) throws SQLException {
		
		final String driver = "com.mysql.cj.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		final String userdb = "root";
		final String pwd = "admin";
		Connection conn;
		String sql;
		PreparedStatement pstmt;
		ResultSet rs;
		Users user;
		
		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
		conn.setAutoCommit(false);
		sql = "insert into users (id, name, address, email, phone) values (?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Gonzalo" );
		pstmt.setString(3, "Torino" );
		pstmt.setString(4, "Pipa@gmail.it");
		pstmt.setString(5, "331829659");
		pstmt.executeUpdate();
		System.out.println("***Inserimento avvenuto correttamente***");
		conn.commit();
		pstmt.close();
		conn.close();
	}
}
