package io.javabrains.payload.response;

public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private String email;
	
	
	
	
	public JwtResponse(String token, String type, String email) {
		super();
		this.token = token;
		this.type = type;
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
