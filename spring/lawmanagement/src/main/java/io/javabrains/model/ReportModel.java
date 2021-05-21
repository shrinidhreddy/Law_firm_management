package io.javabrains.model;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReportModel {
	
	@Id
	private String client;
	private Time time;
	private LocalDate date;
	private String report;
	
	
	
	public ReportModel(String client, Time time, LocalDate date, String report) {
		super();
		this.client = client;
		this.time = time;
		this.date = date;
		this.report = report;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	

}
