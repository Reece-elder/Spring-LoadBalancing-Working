package com.qa.discovery.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${spring.application.name}")
	private String name;

	@GetMapping("/")
	public String greeting() {
		return "Ahoy-hoy, this is " + name + "!";
	}
}