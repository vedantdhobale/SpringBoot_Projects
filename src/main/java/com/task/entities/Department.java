package com.task.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	private String dname;

	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Department> employee = new HashSet<>();
	


	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	


	

	public Set<Department> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Department> employee) {
		this.employee = employee;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.dId==((Department)obj).getdId();
	}
	
}
