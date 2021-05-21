package io.javabrains.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.model.AdminModel;
import io.javabrains.model.AppointmentModel;
import io.javabrains.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repo;
	
	public AppointmentService() {}
	public AppointmentService(AppointmentRepository repo) {
		super();
		this.repo=repo;
	}
	
	public void saveappointment(AppointmentModel appointment) {
		repo.save(appointment);
	}
	
}
