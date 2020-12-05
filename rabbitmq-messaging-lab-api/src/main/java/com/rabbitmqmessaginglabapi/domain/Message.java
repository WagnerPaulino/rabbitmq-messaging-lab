package com.rabbitmqmessaginglabapi.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private String content;
	private String from;
	private String to;

	public Message(Long id, String title, String content, String from, String to) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.from = from;
		this.to = to;
	}

	public Message() {

	}

}