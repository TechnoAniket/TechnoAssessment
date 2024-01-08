package com.AssesmentTechno.Assesment.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeid;
	
	private String name;
	
	private String address;
	
	private String mobile;
	
	private String email;
	
	private String gender;
	
	private LocalDate dateOfBirth;
	
	private String department;
	
	private String jobTitle;
}
