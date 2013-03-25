package com.blog.cavalr.entity;

import java.util.Date;

public class Project {

	private String projectName;
	private String projectDescription;
	private String projectManager;
	private Date startDate;
	private Date endDate;
	
	public Project() {}
	
	public Project(String projectName, String projectDescription, String projectManager) {
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectManager = projectManager;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
