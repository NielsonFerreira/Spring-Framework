package com.nielsonferreira.projeto2;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.nielsonferreira.projeto2.entity.Functionality;
import com.nielsonferreira.projeto2.entity.Role;
import com.nielsonferreira.projeto2.entity.User;
import com.nielsonferreira.projeto2.repository.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private UserRepository userRepository;
		
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Functionality functionality = new Functionality();
		functionality.setName("Add");
		
		Functionality functionality2 = new Functionality();
		functionality2.setName("Delete");
		
		Role role = new Role("Admin", StatusRole.ATIVO, Arrays.asList(functionality));
		Role role3 = new Role("Aluno", StatusRole.ATIVO, Arrays.asList(functionality2));
		
		User user = new User();
		
		user.setName("Nielson Ferreira");
		user.setEmail("nielsonfferreira@hotmail.com");
		user.setRoles(Arrays.asList(role, role3));
		
		this.userRepository.save(user);
		
		User user2 = new User();
		
		user2.setName("João Silva");
		user2.setEmail("joao.s@gmail.com");
		
		this.userRepository.save(user2);
		
		User userR = this.userRepository.findByName("Nielson");
		
		System.out.println(userR.getEmail());
	}

}
