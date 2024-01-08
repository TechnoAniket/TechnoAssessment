package com.AssesmentTechno.Assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AssesmentTechno.Assesment.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	

}
