package com.tutorialspoint.MavenDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Add RestController
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// Add Rest Controller
@RestController
public class MavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
	}
	@RequestMapping(value = "/")
    public String hello() {
      return "Hello World";
    }
	
}
