package io.javabrains.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.model.AdminModel;
import io.javabrains.model.LoginModel;
import io.javabrains.model.UserModel;
import io.javabrains.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public UserService() {}

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyUser(UserModel user) {
		repo.save(user);
		
	}
	public UserModel finduserbymail(String s) {
		return repo.findByemail(s);
	}
	

}
