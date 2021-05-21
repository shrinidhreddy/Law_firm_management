package demo.bookingmodel;

import java.sql.Date;

import demo.lawyer.LawyerModel;
import demo.signup.UserModel;

public class BookingModel {
	String bookingId;
	UserModel clientDetail;
	LawyerModel LawyerDetail;
	String lawfirmName;
	Date date; 
	Date time;
	boolean bookingStatus;
	public BookingModel(String bookingId, UserModel clientDetail, LawyerModel lawyerDetail, String lawfirmName,
			Date date, Date time, boolean bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.clientDetail = clientDetail;
		LawyerDetail = lawyerDetail;
		this.lawfirmName = lawfirmName;
		this.date = date;
		this.time = time;
		this.bookingStatus = bookingStatus;
	}
}
