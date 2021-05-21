package io.javabrains.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import io.javabrains.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel,Integer> {

	@Query("SELECT u FROM UserModel u WHERE u.email=:email") 
	UserModel findByemail(String email);
}



