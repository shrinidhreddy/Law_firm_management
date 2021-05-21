package io.javabrains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabrains.Service.AdminService;
import io.javabrains.Service.AppointmentService;
import io.javabrains.model.AdminModel;
import io.javabrains.model.AppointmentModel;

@org.springframework.web.bind.annotation.RestController
public class ClientController {
	
	@Autowired
	private AdminService adminservice;
	@Autowired
	private AppointmentService appointmentservice;

	
	
	@RequestMapping(method=RequestMethod.GET,value="/client")
	public List<AdminModel> getallLawyers(){
		return adminservice.getAlllawyers();
		
	}
	
	@PostMapping("/booking")
	public void book(@RequestBody AppointmentModel appmod) {
		appointmentservice.saveappointment(appmod);
	}
	
	
	
	
	
}
