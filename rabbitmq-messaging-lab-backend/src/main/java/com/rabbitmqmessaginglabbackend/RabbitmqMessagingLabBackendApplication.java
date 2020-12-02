package com.rabbitmqmessaginglabbackend;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabbitmqmessaginglabbackend.config.RabbitConfig;
import com.rabbitmqmessaginglabbackend.domain.Message;

@SpringBootApplication
public class RabbitmqMessagingLabBackendApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqMessagingLabBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Message messageToSend = new Message(1L, "Some title", "Some contetn", "foo", "bar");
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName, "foo.bar.baz", messageToSend);
	}

}
