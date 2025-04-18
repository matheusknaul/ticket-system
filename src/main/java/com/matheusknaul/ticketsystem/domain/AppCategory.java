package com.matheusknaul.ticketsystem.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppCategory {

	@Id
	private Integer id;
	
	private String title;
}
