package com.springboot.simple.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@RequestMapping("/wish")
	public String say(){
		return "Hello World";
		}

	
	@RequestMapping(value="/hello" )
	public String helloworld(){
		return "Showing something";
		
	}
	
}
