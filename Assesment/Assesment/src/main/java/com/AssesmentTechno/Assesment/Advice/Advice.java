package com.AssesmentTechno.Assesment.Advice;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.AssesmentTechno.Assesment.Exceptions.ComplaintNotFoundException;
import com.AssesmentTechno.Assesment.Exceptions.EmployeeNotFound;


@RestControllerAdvice
public class Advice {

	@ExceptionHandler(ComplaintNotFoundException.class)
	public Map<String, String> complaintNotFound(ComplaintNotFoundException ex){
		
		Map<String, String> map = new HashMap<>();
		map.put("Complaint Not Found", ex.getMessage());
		return map;
		
	}
	@ExceptionHandler(EmployeeNotFound.class)
	public Map<String, String> complaintNotFound(EmployeeNotFound ex){
		
		Map<String, String> map = new HashMap<>();
		map.put("Employee Not Found", ex.getMessage());
		return map;
		
	}
}
