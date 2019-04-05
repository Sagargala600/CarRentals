package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.DBConnection;


public class LoginService {
public boolean validate(String uname,String password) {
	String username = null;
	String dbpassword = null;
	try {
	Connection con = DBConnection.createConnection();
		String query = "select * from users where userName=? and password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, uname);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		username = rs.getString("userName");
		dbpassword = rs.getString("password");

		if(username.equals(uname) && dbpassword.equals(password)) {
			return true;
		}
		else {
			return false;
		}
		}
	}
	catch(SQLException e) {
		
	}
	return false;	
}
}


