package com.practice.sample.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome/v1")
public class Welcome {

	@GetMapping("/get")
	public void getMessage() {
		System.out.println("Welcome to Rest Api");
	}
}
