package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/grouptest")
	public String test(@RequestParam String test) {
		
		System.out.println(test);
		return test;
	}


}
