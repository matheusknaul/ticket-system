package com.matheusknaul.ticketsystem.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppCategory {

	@Id
	private Integer id;
	
	private String title;

	public AppCategory(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public AppCategory() {
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
	
	
}
