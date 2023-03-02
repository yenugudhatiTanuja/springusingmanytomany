package com.spring.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.manytomany.entity.Projects;

public interface ProjectsRepository extends JpaRepository<Projects,Integer>
{
	
}
