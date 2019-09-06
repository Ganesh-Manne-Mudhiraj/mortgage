package com.hcl.mortgage.model;

public class Message {

	private int code;
	private String message;
	private String description;
	
	@Override
	public String toString() {
		return "Message [code=" + code + ", message=" + message + ", description=" + description + "]";
	}
}
