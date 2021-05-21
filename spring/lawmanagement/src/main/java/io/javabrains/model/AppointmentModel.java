package io.javabrains.model;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="booking")
public class AppointmentModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String userdetails;
	private String lawyerdetails;
	private String lawfirmname;
	private LocalDate date;
	private String time;
	private String status;
	public AppointmentModel() {}
	
	
	public AppointmentModel(Long id, String userdetails, String lawyerdetails, String lawfirmname, LocalDate date,
			String time, String status) {
		super();
		this.id = id;
		this.userdetails = userdetails;
		this.lawyerdetails = lawyerdetails;
		this.lawfirmname = lawfirmname;
		this.date = date;
		this.time = time;
		this.status = status;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(String userdetails) {
		this.userdetails = userdetails;
	}
	public String getLawyerdetails() {
		return lawyerdetails;
	}
	public void setLawyerdetails(String lawyerdetails) {
		this.lawyerdetails = lawyerdetails;
	}
	public String getLawfirmname() {
		return lawfirmname;
	}
	public void setLawfirmname(String lawfirmname) {
		this.lawfirmname = lawfirmname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}