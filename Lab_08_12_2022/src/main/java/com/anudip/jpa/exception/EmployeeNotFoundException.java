package com.anudip.jpa.exception;


//user Defined Exception by extending RuntimeException class
public class EmployeeNotFoundException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
	

}
