package com.tutorialspoint.GradleDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Add restcontroller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// Add restcontroller
@RestController
public class GradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
	}
	@RequestMapping(value = "/")
    public String hello() {
      return "Hello World";
    }
}
