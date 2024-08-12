package com.calci.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	
	// rest api - representation state transfer api; 
	//	1.uniform interface - url and protocols (its set of tools) uri-uniform resource identifier - client -server archi
	
	@GetMapping("/add")
	public String add(@RequestParam int a,@RequestParam int b) {
		
		return "sum is :"+(a+b);
	}                                                                       
	@GetMapping("/sub")
	public String sub(@RequestParam int a,@RequestParam int b) {
		
		return "Substraction is :"+(a-b);
	}
	
	@GetMapping("/mul")
	public String mul(@RequestParam int a,@RequestParam int b) {
		
		return "Multipication is :"+(a*b);
	}
	
	@GetMapping("/div")
	public String div(@RequestParam int a,@RequestParam int b) {
		
		return "Division is :"+(a-b);
	}
	
	
}
