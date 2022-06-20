package com.in28minutes.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

}
