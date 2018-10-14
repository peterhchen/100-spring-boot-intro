package com.tutorialspoint.TomcatMavenDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomcatMavenDemoApplication {
	/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TomcatMavenDemoApplication.class);
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(TomcatMavenDemoApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
      return "Hello World from Tomcat";
	}
}
