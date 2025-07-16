package com.cts.oopdemo.exceptions;

@SuppressWarnings("serial")
public class InvalidAmount extends Exception{

	public InvalidAmount() {
		super();
	}

	public InvalidAmount(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidAmount(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAmount(String message) {
		super(message);
	}

	public InvalidAmount(Throwable cause) {
		super(cause);
	}

}
