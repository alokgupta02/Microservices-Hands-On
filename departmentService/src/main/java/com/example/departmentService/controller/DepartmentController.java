package com.example.departmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentService.entity.Department;
import com.example.departmentService.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside Save Department of Controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long id) {
		log.info("Inside Find Department of Controller");
		return departmentService.findDepartmentById(id);
	}
	
	

}
