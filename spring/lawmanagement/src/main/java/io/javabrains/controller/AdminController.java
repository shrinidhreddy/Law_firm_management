package io.javabrains.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabrains.Service.AdminService;
import io.javabrains.Service.UserService;
import io.javabrains.model.AdminModel;
import io.javabrains.model.UserModel;


@org.springframework.web.bind.annotation.RestController
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	@Autowired 
	private UserService userservice;

    
	
	@PostMapping("/admin/save/lawyer")
	@Transactional
	public void saveLawyer(@RequestBody AdminModel admin,HttpServletResponse httpResponse)throws Exception {
		adminservice.savemyLawyer(admin);
		httpResponse.sendRedirect("/admin/lawyer");
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/admin/lawyer/{id}")
	public AdminModel findLawyer(@PathVariable(name="id") int id) {
		return adminservice.findlawyer(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/admin/lawyer")
	public List<AdminModel> getallLawyers(){
		return adminservice.getAlllawyers();
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/admin/lawyer/delete/{id}")
	public void deleteLawyer(@PathVariable(name="id")int id,HttpServletResponse httpResponse)throws Exception {
		adminservice.deletelawyer(id);
		httpResponse.sendRedirect("/admin/lawyer/{id}");
	}

}
