package com.rabbitmqmessaginglabapi.rest;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rabbitmqmessaginglabapi.config.RabbitConfig;
import com.rabbitmqmessaginglabapi.domain.Message;

@RestController
@RequestMapping("api/messages")
public class MessageRest {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostMapping()
	public Message saveMessage(@RequestBody Message message) {
		Gson gson = new Gson();
		rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName, RabbitConfig.routingKeyBase + "message",
				gson.toJson(message));
		return message;
	}

}
