package com.AssesmentTechno.Assesment.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintDetailsDTO {
	
	private Long complaintId;
	
	private Long employeeId;
	
	private String employeeName;
	
	private String employeeEmail;
	
	private String categoryName;
	
	private String description;
	
	private String status;
	
	private LocalDateTime createdDate;
	

}
