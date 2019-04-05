package models;

public class UserBean {
	private String firstName;
	private String lastname;
	 private String email;
	 private String userName;
	 private String password;
	 
	 public String getUserName() {
	 return userName;
	 }
	 public void setUserName(String userName) {
	 this.userName = userName;
	 }
	 public String getPassword() {
	 return password;
	 }
	 public void setPassword(String password) {
	 this.password = password;
	 }
	 public void setFirstName(String firstName) {
	 this.firstName = firstName;
	 }
	 public String getFirstName() {
	 return firstName;
	 }
	 public void setEmail(String email) {
	 this.email = email;
	 }
	 public String getEmail() {
	 return email;
	 }
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	}
