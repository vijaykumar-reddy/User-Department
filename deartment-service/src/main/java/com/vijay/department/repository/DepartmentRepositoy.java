package com.vijay.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.department.entity.Department;

@Repository
public interface DepartmentRepositoy extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
