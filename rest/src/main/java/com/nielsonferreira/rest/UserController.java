package com.nielsonferreira.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void findAll(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public User update(@RequestBody User user) {
		return userRepository.save(user);
	}

}