package com.matheusknaul.ticketsystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppUser {

	@Id
	private Integer id;
	
	private String name;
	private String password;
	
	@Column(unique = true)
	private String email;
}
