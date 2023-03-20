package com.example.springbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	/*@GetMapping("/hello")
	public String sayHello2() {
		return "Hello World2";
	}
	returns - Error creating bean with name 'requestMappingHandlerMapping' defined in class path resource
	*/
}
