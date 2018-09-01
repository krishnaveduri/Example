package com.example.exception;

public class InvalidRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestException()
	{
		
	}
	
	public InvalidRequestException(String errorMessage)
	{
		super(errorMessage);
	}
	
	public InvalidRequestException(String errorMessage,Exception e)
	{
		super(errorMessage,e);
	}
	
}
