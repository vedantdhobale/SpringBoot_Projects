package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.entities.Department;
import com.task.entities.Employee;
import com.task.repo.DepartmentRepo;
import com.task.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// display list of employees
	

	@GetMapping("/showNewDepartmentForm")
	public String showNewDepartmentForm(Model model) {
		// create model attribute to bind form data
		Department department = new Department();
		model.addAttribute("department", department);
		return "new_department";
	}

	/*
	 * @GetMapping("/showDepartmentDetails") public String
	 * showDepartmentDetails(Model model) { // create model attribute to bind form
	 * data Department department = new Department();
	 * model.addAttribute("department", department); return "department_details"; }
	 */
	@PostMapping("/saveDepartment")
	public String saveDepartment(@ModelAttribute("department") Department department) {
		// save employee to database
		departmentService.saveDepartment(department);
		return "redirect:/";
	}

	@GetMapping("/showFormForDUpdate/{id}")
	public String showFormForDUpdate(@PathVariable(value = "id") int id, Model model) {

		// get employee from the service
		Department department = departmentService.getDepartmentById(id);

		// set employee as a model attribute to pre-populate the form
		model.addAttribute("department", department);
		return "update_department";
	}

	
	 @GetMapping("/deleteDepartment/{id}") public String
	  deleteDepartment(@PathVariable(value = "id") int id) {
	  
	  // call delete employee method
	  this.departmentService.deleteDepartmentById(id); return "redirect:/"; }
	 

		
	 
	 
	

}