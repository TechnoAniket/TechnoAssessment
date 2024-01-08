package com.AssesmentTechno.Assesment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AssesmentTechno.Assesment.Exceptions.EmployeeNotFound;
import com.AssesmentTechno.Assesment.entity.Employee;
import com.AssesmentTechno.Assesment.repository.EmployeeRepository;




@Service
public class EmployeeService  {

	@Autowired
	private EmployeeRepository employeeRepository;




	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	
	public List<Employee> fetchAllEmployee() {
		return employeeRepository.findAll();
	}

	
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Employee deleted !!!";
	}

	
	public Employee updateEmployee(Employee employee, Long id) {
		Employee oldEmployee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFound("Employee is not present"));
		if (oldEmployee != null) {
			if (employee.getName() != null) {
				oldEmployee.setName(employee.getName());
			}
			if (employee.getAddress() != null) {
				oldEmployee.setAddress(employee.getAddress());
			}
			if (employee.getMobile() != null) {
				oldEmployee.setMobile(employee.getMobile());
			}
			if (employee.getEmail() != null) {
				oldEmployee.setEmail(employee.getEmail());
			}
			if (employee.getGender() != null) {
				oldEmployee.setGender(employee.getGender());
			}
			if (employee.getDateOfBirth() != null) {
				oldEmployee.setDateOfBirth(employee.getDateOfBirth());
			}
			if (employee.getDepartment() != null) {
				oldEmployee.setDepartment(employee.getDepartment());
			}
			if (employee.getJobTitle() != null) {
				oldEmployee.setJobTitle(employee.getJobTitle());
			}

			return employeeRepository.save(oldEmployee);
		}
		return null;
	}

	public Employee getEmployeebyId(Long id) {
		return employeeRepository.findById(id).get();
	}
	
}
