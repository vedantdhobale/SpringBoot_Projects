package com.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entities.Department;
import com.task.entities.User;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	
}