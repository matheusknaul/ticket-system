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
	public AppTicket(Integer id, String title, String description, AppCategory category, String status, String priority,
			String cliente, String operador, LocalDate createdAt, LocalDate updatedAt, LocalDate finishedAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.status = status;
		this.priority = priority;
		this.cliente = cliente;
		this.operador = operador;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.finishedAt = finishedAt;
	}
	public AppTicket() {
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
	public AppCategory getCategory() {
		return category;
	}
	public void setCategory(AppCategory category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDate getFinishedAt() {
		return finishedAt;
	}
	public void setFinishedAt(LocalDate finishedAt) {
		this.finishedAt = finishedAt;
	}
	
	
}
