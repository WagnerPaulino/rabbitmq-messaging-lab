package com.rabbitmqmessaginglabbackend;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabbitmqmessaginglabbackend.config.RabbitConfig;
import com.rabbitmqmessaginglabbackend.receiver.ReceiverCount;

@SpringBootApplication
public class RabbitmqMessagingLabBackendApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private ReceiverCount receiver;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqMessagingLabBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
	}

}
