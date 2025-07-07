package com.excelr.spring_3.exception;

public class EmployeeNotFoundException extends RuntimeException {
	private String message;
	
	@Override
	public String getMessage() {
		return message;
	}

	public EmployeeNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	

}


