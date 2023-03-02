package com.spring.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.manytomany.entity.Projects;
import com.spring.manytomany.repository.ProjectsRepository;

@Service
public class ProjectService 
{
	@Autowired
	private ProjectsRepository projectRepository;
	
	//List of all projects
	public List<Projects> projectList()
	{
		return this.projectRepository.findAll();
	}
	
	//Add Projects
	public Projects addProject(Projects p)
	{
		return projectRepository.save(p);
	}
}
