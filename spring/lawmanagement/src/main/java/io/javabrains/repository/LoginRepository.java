package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.LoginModel;

public interface LoginRepository extends CrudRepository<LoginModel,Integer> {

}
