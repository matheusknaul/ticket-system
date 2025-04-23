package com.matheusknaul.ticketsystem.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
	private Integer id;
	
	private String title;
	
	private String description;
	
	private List<AppUser> usersReponsibles;
	private List<AppUser> usersCreators;
	
	private List<CustomField> customFields;

	public Task(Integer id, String title, String description, List<AppUser> usersReponsibles,
			List<AppUser> usersCreators, List<CustomField> customFields) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.usersReponsibles = usersReponsibles;
		this.usersCreators = usersCreators;
		this.customFields = customFields;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AppUser> getUsersReponsibles() {
		return usersReponsibles;
	}

	public void setUsersReponsibles(List<AppUser> usersReponsibles) {
		this.usersReponsibles = usersReponsibles;
	}

	public List<AppUser> getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(List<AppUser> usersCreators) {
		this.usersCreators = usersCreators;
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(List<CustomField> customFields) {
		this.customFields = customFields;
	}
	
	
}
