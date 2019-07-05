package com.nielsonferreira.demo;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.println("Entrei aqui!");
		return "hello";
	}
}
