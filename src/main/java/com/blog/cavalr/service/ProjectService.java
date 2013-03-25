package com.blog.cavalr.service;

import java.util.List;

import com.blog.cavalr.entity.Project;

public interface ProjectService {

	Project findByName(String projectName);
	void saveProject(Project p);
	void deleteProject(String projectName);
	List<Project> findProjects(String description);
}
