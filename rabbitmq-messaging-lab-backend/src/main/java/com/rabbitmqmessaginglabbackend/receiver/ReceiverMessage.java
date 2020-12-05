package com.rabbitmqmessaginglabbackend.receiver;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.rabbitmqmessaginglabbackend.domain.Message;

@Component
public class ReceiverMessage {

	public void receiveMessage(String message) {
		Gson gson = new Gson();
		Message m = gson.fromJson(message, Message.class);
		System.out.println("Received <" + m.toString() + ">");
	}

}
