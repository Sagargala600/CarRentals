package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDao {
	
	public static String registerCar(ReservedCarDetails cardetails) {
		String firstname = cardetails.getFirstname();
		String lastname = cardetails.getLatname();
		String phone = cardetails.getPhone();
		String email = cardetails.getEmail();
		String carbrand = cardetails.getCar();
		String carmodel = cardetails.getCategory();
		String total = cardetails.getTotal();
		String userName = cardetails.getUserName();
		System.out.println(userName + "This is userName");
		
		Connection con = null;
		 PreparedStatement preparedStatement = null;
		 try {
			 System.out.println("Reached Here in CarDao Class");
			 con = DBConnection.createConnection();
			 String query = "insert into cardetails(firstname, lastname, phone, email, carbrand, carmodel, total, userName) values (?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			 preparedStatement.setString(1, firstname);
			 preparedStatement.setString(2, lastname);
			 preparedStatement.setString(3, phone);
			 preparedStatement.setString(4, email);
			 preparedStatement.setString(5, carbrand);
			 preparedStatement.setString(6, carmodel);
			 preparedStatement.setString(7, total);
			 preparedStatement.setString(8, userName);
			 
			 int i= preparedStatement.executeUpdate();
			 System.out.println("Executed Queries");
			 
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
