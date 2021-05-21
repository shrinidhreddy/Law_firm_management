package io.javabrains.controller;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabrains.Service.AdminService;

import io.javabrains.Service.UserService;
import io.javabrains.model.AdminModel;
import io.javabrains.model.LoginModel;
import io.javabrains.model.UserModel;
import io.javabrains.repository.UserRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	private static final String Model = null;
	@Autowired
	private UserService service;

	private UserRepository repo;
	private String role;
	private String email;
	private String password;
	
	@PostMapping("/login")
	@Transactional
	public void loginuser(@RequestBody LoginModel login,HttpServletResponse httpResponse)throws Exception {
		email=login.getEmail();
		
		role=service.finduserbymail(email).getRole();	
		if(role.equals("client")) {
			//httpResponse.sendRedirect("/lawyer");
			System.out.println("3333333333333");
		}
		else {
			//httpResponse.sendRedirect("/admin/lawyer");
			System.out.println("444444444444");
		}
		System.out.println(role);
				
	}

	@PostMapping("/signup")
	@Transactional
	public void saveUser(@RequestBody UserModel user,HttpServletResponse httpResponse)throws Exception {
	System.out.println("#33333333333333");
		service.saveMyUser(user);
		System.out.println(user.getEmail());
		//httpResponse.sendRedirect("/login");
	}
	
	
}
