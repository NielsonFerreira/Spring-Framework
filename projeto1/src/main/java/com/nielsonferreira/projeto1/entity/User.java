package com.nielsonferreira.projeto1.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String nome;
	private String email;
	
	@ManyToMany
	private Set<Role> rules;
	
	public User() {
		
	}
	
	public User(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
