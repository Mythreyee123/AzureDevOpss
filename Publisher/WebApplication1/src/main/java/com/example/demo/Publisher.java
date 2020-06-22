package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {

	@PostMapping("/publisher")
	public ResponseEntity<String> publisher() {
		
		return new ResponseEntity<>("This is publisher",HttpStatus.OK);
		
	}
}
