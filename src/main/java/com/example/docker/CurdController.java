package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurdController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Docker Tutorial...3rdCommit";
		
	}

}
