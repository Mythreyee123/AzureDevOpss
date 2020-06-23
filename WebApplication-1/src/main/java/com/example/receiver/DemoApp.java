package com.example.receiver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApp {

	@PostMapping("/webapp1")
	public ResponseEntity<String> alertsreceive(){
		return new ResponseEntity<>("This is WebApplication1", HttpStatus.OK);
	}
	
}
