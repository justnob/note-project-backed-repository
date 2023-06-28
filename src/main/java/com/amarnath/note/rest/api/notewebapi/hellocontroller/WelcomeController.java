package com.amarnath.note.rest.api.notewebapi.hellocontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amarnath.note.rest.api.notewebapi.resource.HelloBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class WelcomeController {
	
	@GetMapping("/hello")
	private String GetHelloMessage() {
		
		return "Hello my dear user";
		
	}
	
	@GetMapping("/hello-bean")
	private HelloBean GetHelloBean() {
		
//		throw new RuntimeException("Some Error Has Happend Please Try Again");
		
		return new HelloBean("welcome my dear user!");
		
	}
	
	@GetMapping("/hello/pathvar/{name}")
	private HelloBean GetHelloBeanWithPath(@PathVariable String name) {
		
		return new HelloBean(String.format("welcome my dear user, %s", name));
		
	}

}
