package com.nielsonferreira.projeto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nielsonferreira.projeto2.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select u from User u where u.name like %?1%")
	User findByName(String name);
	
	User findByEmail(String email);
}
