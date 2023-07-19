package com.quinn.newslp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}

}
