package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
	
	private static final String template = "Hello, %s!";
	private static final AtomicLong counter= new AtomicLong();
	
	
	@GetMapping("/test")
	public Hello helo (@RequestParam(value = "nome",defaultValue = "world")
	String name) {
		return new Hello(counter.incrementAndGet(),String.format(template, name));
	}
	

}
