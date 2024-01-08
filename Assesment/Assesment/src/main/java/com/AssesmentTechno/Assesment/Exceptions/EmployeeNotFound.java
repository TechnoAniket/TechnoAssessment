package com.AssesmentTechno.Assesment.Exceptions;


public class EmployeeNotFound extends RuntimeException{

	public EmployeeNotFound(String message) {
		super(message);
	}
}