package com.swagger.practice.swagger2application.exceptions;

@SuppressWarnings("serial")
public class ContactNotFoundException extends RuntimeException {

	public ContactNotFoundException(String message) {
		super(message);
	}

}
