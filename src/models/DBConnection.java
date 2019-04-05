package models;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
 
 public static Connection createConnection()
 {
 Connection con = null;
 String url = "jdbc:mysql://localhost:3306/user"; //MySQL URL followed by the database name
 String username = "root"; //MySQL username
 String password = "Eantiomers60"; //MySQL password
 
 try 
 {
 try 
 {
 Class.forName("com.mysql.cj.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
 } 
 catch (ClassNotFoundException e)
 {
 e.printStackTrace();
 }
 
 con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 } 
 catch (Exception e) 
 {
 e.printStackTrace();
 }
 
 return con; 
 }
}