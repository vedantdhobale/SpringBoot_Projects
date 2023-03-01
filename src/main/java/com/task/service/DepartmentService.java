package com.task.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.task.entities.Department;
import com.task.entities.Employee;

public interface DepartmentService {
	List<Department> getAllDepartment();

	void saveDepartment(Department deparment);

	Department getDepartmentById(int id);
	public void deleteDepartmentById(int id);


	
}
