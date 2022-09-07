package com.second.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secondservice")
public class Secondcontroller {
	
	@GetMapping("/secondmessage")
	public String test() {
		return "Hello This is Called in second Service";
	}
}


