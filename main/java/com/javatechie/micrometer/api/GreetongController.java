package com.javatechie.micrometer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.prometheus.client.CollectorRegistry;

@RestController
public class GreetongController {
	
	
	
	@RequestMapping("/")
	public String getGreeting() {
		
	return "Hello, it is me!";
	}


}
