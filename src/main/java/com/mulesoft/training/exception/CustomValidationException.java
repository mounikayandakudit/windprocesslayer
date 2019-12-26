package com.mulesoft.training.exception;

public class CustomValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String error;
	
	
	public CustomValidationException(String error) {
		super(error);
		this.error = error;
	}
	
	public CustomValidationException(String error, Throwable cause) {
		super(error,cause);
		this.error = error;
	}
	public CustomValidationException(String message,String error, Throwable cause) {
		super(message,cause);
		this.error = error;
	}
	
	public String getError() {
		return this.error;
	}

}
