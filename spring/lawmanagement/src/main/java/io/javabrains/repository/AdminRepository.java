package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.AdminModel;

public interface AdminRepository extends CrudRepository<AdminModel,Integer>{

}
