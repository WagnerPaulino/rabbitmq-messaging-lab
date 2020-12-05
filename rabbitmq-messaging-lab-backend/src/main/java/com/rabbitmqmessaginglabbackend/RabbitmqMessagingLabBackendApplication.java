package com.rabbitmqmessaginglabbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqMessagingLabBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqMessagingLabBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
