package com.example.departmentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentService.entity.Department;
import com.example.departmentService.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside Save Department of Service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		log.info("Inside Find Department of Service");
		return departmentRepository.findByDepartmentId(id);
	}

}
