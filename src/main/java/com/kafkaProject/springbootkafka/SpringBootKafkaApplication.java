package com.kafkaProject.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Spring Boot Kafka application.
 * This class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication
public class SpringBootKafkaApplication {

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args Command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}
}
