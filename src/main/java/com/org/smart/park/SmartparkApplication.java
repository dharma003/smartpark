package com.org.smart.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SmartparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartparkApplication.class, args);
	}

}
