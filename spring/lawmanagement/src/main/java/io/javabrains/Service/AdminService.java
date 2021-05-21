package io.javabrains.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.model.AdminModel;
import io.javabrains.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	public AdminService() {}
	public AdminService(AdminRepository repo) {
		super();
		this.repo=repo;
	}
	
	public List<AdminModel> getAlllawyers(){
		return  (List<AdminModel>) repo.findAll();
	}
	
	public void savemyLawyer(AdminModel admin) {
		repo.save(admin);
	}
	
	public AdminModel findlawyer(int id) {
		return repo.findById(id).get();
	}
	
	public void deletelawyer(int id) {
		repo.deleteById(id);
	}
}
