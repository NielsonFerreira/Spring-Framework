package com.nielsonferreira.projeto2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nielsonferreira.projeto2.StatusRole;
import com.nielsonferreira.projeto2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	List<Role> findByStatus(StatusRole status);
}
