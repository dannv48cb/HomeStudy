package com.blog.cavalr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.cavalr.dao.ProjectDao;
import com.blog.cavalr.entity.Project;
import com.blog.cavalr.service.ProjectService;

@Service("projectService")
@Transactional(readOnly = true)
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao projectDao;

	public Project findByName(String projectName) {
		return projectDao.findById(projectName);
	}

	@Transactional(readOnly = false)
	public void saveProject(Project p) {
		projectDao.saveProject(p);
	}

	 @Transactional(readOnly = false)
	public void deleteProject(String projectName) {
		Project p = projectDao.findById(projectName);
		if (p != null) {
			projectDao.delete(p);
		}
	}

	public List<Project> findProjects(String description) {
		return projectDao.findProject(description);
	}

}
