
/*
 * if any value is not matched with existing details
 * then it throws key not found exception
 * */
 package com.cg.tradingservice.exception;
 

public class KeyNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	public  KeyNotFoundException(String message) {
		/*
		 * throwing the exception and printing the message
		 */
		super(message);
	}

}