package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String wishUser() {
		System.out.println("I am in wishUser()");
		return "Hello Spring Security";
	}
	
	@GetMapping("/test")
	public String myMethid() {
		return"Good Morning";
	}
}
