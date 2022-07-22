package com.heyy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeyyController {


	@GetMapping("/hello")
	public ResponseEntity<String> check() {
		return new ResponseEntity<String>("hi hello bye", HttpStatus.OK);
	}
}
