package com.swagger.practice.demo.application.exceptions;

@SuppressWarnings("serial")
public class ContactNotFoundException extends RuntimeException {

	public ContactNotFoundException(String message) {
		super(message);
	}

}
