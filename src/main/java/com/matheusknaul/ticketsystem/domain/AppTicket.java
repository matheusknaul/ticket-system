package com.matheusknaul.ticketsystem.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class AppTicket {

	@Id
	private Integer id;
	
	private String title;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private AppCategory category;
	
	private String status; //TODO Criar uma classe para status
	
	private String priority; //TODO Criar uma classe para prioridade
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private String cliente; //TODO Criar uma classe para cliente
	
	@ManyToMany
	@JoinColumn(name = "operador_id")
	private String operador; //TODO Criar uma classe para operador
	
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private LocalDate finishedAt;
}
