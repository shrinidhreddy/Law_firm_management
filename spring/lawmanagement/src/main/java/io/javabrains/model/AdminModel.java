package io.javabrains.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class AdminModel {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private String experience;
	private String specialist;
	private Boolean available;

	
	
	public AdminModel() {}
	
	public AdminModel(int id, String name, String email, String password, String experience, String specialist) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.experience = experience;
		this.specialist = specialist;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
}
