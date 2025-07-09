package com.excelr.spring_security_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
// http://localhost:8081/start
	@GetMapping("/start")
	public String start() {
		return "hello spring security....!!!";
	}

}
