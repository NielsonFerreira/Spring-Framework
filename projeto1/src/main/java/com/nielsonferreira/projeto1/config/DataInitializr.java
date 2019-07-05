package com.nielsonferreira.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.nielsonferreira.projeto1.entity.User;
import com.nielsonferreira.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			
			createUser("Nielson", "nielsonfferreira@hotmail.com");
			createUser("João", "joao@hotmail.com");
			createUser("Maria", "maria@hotmail.com");
		}
		
		User user = userRepository.findByNomeIgnoreCase("nielson");
		System.out.println(user.getNome());
		
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		
		userRepository.save(user);
	}

}
