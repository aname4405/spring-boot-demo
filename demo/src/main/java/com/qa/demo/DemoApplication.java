package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
		public String greeting() {
			return "Hello World!";
	}

	@GetMapping("action/{number}")
		public String Action(@PathVariable int number){
			return "This is <h2>"+(number+2)+"</h2>";
	}
}


