package com.blog.cavalr.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.blog.cavalr.dao.ProjectDao;
import com.blog.cavalr.entity.Project;

@Repository
public class ProjectDaoImpl extends AbstractDaoImpl<Project, String> implements
		ProjectDao {

	protected ProjectDaoImpl() {
		super(Project.class);
	}

	public void saveProject(Project p) {
		saveOrUpdate(p);

	}

	public List<Project> findProject(String description) {
		return findByCriteria(Restrictions.like("projectDescription",
				description, MatchMode.START));
	}

}
