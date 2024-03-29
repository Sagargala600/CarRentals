package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.DBConnection;
import models.UserBean;
 
public class UserDao {
 
 public String registerUser(UserBean userBean)
 {
 String firstName = userBean.getFirstName();
 String lastName = userBean.getLastname();
 String email = userBean.getEmail();
 String userName = userBean.getUserName();
 String password = userBean.getPassword();
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
	 con = DBConnection.createConnection();
 String query = "insert into users(userId,firstName,lastname,Email,userName,password) values (NULL,?,?,?,?,?)"; //Insert user details into the table 'USERS'
 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
 preparedStatement.setString(1, firstName);
 preparedStatement.setString(2, lastName);
 preparedStatement.setString(3, email);
 preparedStatement.setString(4, userName);
 preparedStatement.setString(5, password);
 
 int i= preparedStatement.executeUpdate();
 
 if (i!=0)  //Just to ensure data has been inserted into the database
 return "SUCCESS"; 
 con.close();
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }
}