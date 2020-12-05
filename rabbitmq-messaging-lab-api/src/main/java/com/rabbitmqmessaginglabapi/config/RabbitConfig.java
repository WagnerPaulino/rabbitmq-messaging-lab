package com.rabbitmqmessaginglabapi.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	public static final String topicExchangeName = "spring-boot-exchange";

	public static final String routingKeyBase = "foo.bar.";

}
