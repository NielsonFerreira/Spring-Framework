package com.nielsonferreira.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nielsonferreira.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.nome like %?1%")
	User findByNomeQualquerCoisa(String nome);
	
	User findByEmail(String email);
	
	User findByNomeIgnoreCase(String nome);
}
