package com.first.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstservice")
public class Firstcontroller {
	
	@GetMapping("/firstmessage")
	public String test() {
		return "Hello This is Called in First Service";
	}
}


