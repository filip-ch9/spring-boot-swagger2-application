package com.swagger.practice.demo.application.api.error;

public class ApiError {
	
	private String[] codes;
	private String message;

	public ApiError(String code, String message) {
		this(new String[] { code }, message);
	}

	public ApiError(String[] strings, String message2) {

	}

	public String[] getCodes() {
		return codes;
	}

	public void setCodes(String[] codes) {
		this.codes = codes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
