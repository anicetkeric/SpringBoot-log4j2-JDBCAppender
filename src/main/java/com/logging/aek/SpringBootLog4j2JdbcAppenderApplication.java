package com.logging.aek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4j2JdbcAppenderApplication implements CommandLineRunner {

	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4j2JdbcAppenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		logger.error("My first Error message");
	}

}

