package com.blog.cavalr.dao;

import java.util.List;

import com.blog.cavalr.entity.Project;

public interface ProjectDao extends AbstractDao<Project, String> {
	void saveProject(Project p);
	List<Project> findProject(String description);
}
