package com.spring.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.manytomany.entity.Employees;
import com.spring.manytomany.service.EmployeesService;


@RestController
public class EmployeesController 
{
	@Autowired
	private EmployeesService EmpService;
	
	//Get All employee
	@GetMapping("/Employee")
	public List<Employees> getEmployee()
	{
		return this.EmpService.EmployeesList();
	}
	
	//Add Employee
	@PostMapping("/addEmployee")
	public Employees addEmployee(@RequestBody Employees emp)
	{
		return this.EmpService.addEmployee(emp);
	}
}
