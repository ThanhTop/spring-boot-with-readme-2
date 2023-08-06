package com.stackjava.springbootgitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitDemoApplication.class, args);
	}

}
