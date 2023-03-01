package com.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.task.entities.Department;
import com.task.entities.Employee;
import com.task.repo.DepartmentRepo;
import com.task.repo.EmployeeRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepo.findAll();
	}

	@Override
	public void saveDepartment(Department department) {
		this.departmentRepo.save(department);
	}
	
	

	@Override
	public Department getDepartmentById(int id) {
		Optional<Department> optional = departmentRepo.findById(id);
		Department department = null;
		if (optional.isPresent()) {
			department = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return department;
	}

	@Override
	public void deleteDepartmentById(int id) {
		this.departmentRepo.deleteById(id);
	}

	

}