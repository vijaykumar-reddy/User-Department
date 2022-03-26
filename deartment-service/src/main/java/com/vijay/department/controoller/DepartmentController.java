package com.vijay.department.controoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.department.entity.Department;
import com.vijay.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/departments")
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("in side saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);

	}

	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long departmentId) {
		log.info("in side findByDepartmentId of DepartmentController");
		return departmentService.findByDepartmentId(departmentId);
	}

}
