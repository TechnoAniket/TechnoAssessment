package com.AssesmentTechno.Assesment.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComplaintCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ComplaintCategoryId;
	
	@ManyToOne
	@JoinColumn(name = "employeeid")
	private Employee employee;
	
	private String categoryName;
	
	private String Status;
	
	
}
