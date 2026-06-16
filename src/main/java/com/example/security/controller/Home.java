package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@GetMapping("/")
	public String greet() {
		return "This is our home page";
	}
}
