package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	private String name = "Forrester";

	@RequestMapping("/")
	public String index() {
		return "Greetings from "+name+", Spring Boot + Tanzu!";
	}

}