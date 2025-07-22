package com.cts.empcrud.exceptions;

@SuppressWarnings("serial")
public class InvalidEmployeeDetailsException extends Exception {

	public InvalidEmployeeDetailsException() {
		super();
	}

	public InvalidEmployeeDetailsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidEmployeeDetailsException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidEmployeeDetailsException(String message) {
		super(message);
	}

	public InvalidEmployeeDetailsException(Throwable cause) {
		super(cause);
	}

}
