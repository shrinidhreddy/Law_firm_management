package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.ReportModel;

public interface ReportRepository extends CrudRepository<ReportModel,String> {

}
