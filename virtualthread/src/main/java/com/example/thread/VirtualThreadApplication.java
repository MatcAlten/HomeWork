package com.example.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Executors;

@SpringBootApplication
public class VirtualThreadApplication {

	private static final Logger logger = LoggerFactory.getLogger(VirtualThreadApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VirtualThreadApplication.class, args);
	}

	@Bean
	TomcatProtocolHandlerCustomizer<?> protocolHandlerVirtualThreadExecutorCustomizer(){
		return protocolHandler -> {
			logger.info("Configuring " + protocolHandler + " to use VirtualThreadPerTaskExecutor");
			protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		};
	}

	//loom ready (?)
	//creiamo un bean  that set its executor to the new virtual thread per teask executor,no more using normla thread but virtual one
	//




}
