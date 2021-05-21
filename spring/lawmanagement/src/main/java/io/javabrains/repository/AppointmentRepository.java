package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.AppointmentModel;

public interface AppointmentRepository extends CrudRepository<AppointmentModel,Integer>{

}
