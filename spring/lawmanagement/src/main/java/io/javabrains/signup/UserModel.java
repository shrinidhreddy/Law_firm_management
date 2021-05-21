package demo.signup;

public class UserModel {
	String email,username,mobilenumber,role;
	boolean active;
	public String password;
	public UserModel(String email, String username, String mobilenumber, String role, boolean active, String password) {
		super();
		this.email = email;
		this.username = username;
		this.mobilenumber = mobilenumber;
		this.role = role;
		this.active = active;
		this.password = password;
	}
	UserModel(){
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
