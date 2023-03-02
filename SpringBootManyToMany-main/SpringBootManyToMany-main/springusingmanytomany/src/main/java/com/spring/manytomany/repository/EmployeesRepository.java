package com.spring.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.manytomany.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>
{
	
}
