package com.nielsonferreira.projeto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nielsonferreira.projeto2.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
