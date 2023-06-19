package com.logging.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoggingApplication {

	final static Logger log = LoggerFactory.getLogger(LoggingApplication.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {

		String response = "Hi " + name + ",welcome to logging lessons";

		log.debug("Request {}",name);

		if(name.equalsIgnoreCase("test")){
			throw  new RuntimeException("Exception raised. . .");
		}

		log.debug("Response {}",response);
		return response;

	}

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}



}
