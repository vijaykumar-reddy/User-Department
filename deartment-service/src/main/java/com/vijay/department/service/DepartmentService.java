package com.vijay.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.department.entity.Department;
import com.vijay.department.repository.DepartmentRepositoy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepositoy departmentRepositoy;

	public Department saveDepartment(Department department) {
		log.info("in side saveDepartment of DepartmentService");
		return departmentRepositoy.save(department);

	}

	public Department findByDepartmentId(Long departmentId) {
		log.info("in side findByDepartmentId of DepartmentService");
		return departmentRepositoy.findByDepartmentId(departmentId);
	}
}
