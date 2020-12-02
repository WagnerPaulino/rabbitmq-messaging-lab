package com.rabbitmqmessaginglabbackend.receiver;

import org.springframework.stereotype.Component;

import com.rabbitmqmessaginglabbackend.domain.Message;

@Component
public class ReceiverMessage {

	public void receiveMessage(Message message) {
		System.out.println("Received <" + message.toString() + ">");
	}

}
