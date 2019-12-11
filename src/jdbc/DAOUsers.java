package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface DAOUsers {
	
	Users getUser(int id) throws SQLException;
	List <Users>  getAllUsers() throws SQLException;
	void addUsers(Users user) throws SQLException;
	void updateUser(Users user) throws SQLException;
	void deleteUser(int id) throws SQLException;
	boolean checkid(int id) throws SQLException;
    void commitrollback() throws SQLException;
    void connessione() throws SQLException;
}
