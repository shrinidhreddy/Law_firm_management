package io.javabrains.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.model.ReportModel;
import io.javabrains.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	private ReportRepository repo;
	
	public ReportService() {}
	
	public ReportService(ReportRepository repo) {
		super();
		this.repo=repo;
	}
	
	public void savereport(ReportModel report) {
		repo.save(report);
	}
}
