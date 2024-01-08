package com.AssesmentTechno.Assesment.service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.AssesmentTechno.Assesment.Exceptions.ComplaintNotFoundException;
import com.AssesmentTechno.Assesment.Exceptions.EmployeeNotFound;
import com.AssesmentTechno.Assesment.entity.Complaint;
import com.AssesmentTechno.Assesment.entity.ComplaintDetailsDTO;
import com.AssesmentTechno.Assesment.entity.Employee;
import com.AssesmentTechno.Assesment.repository.ComplaintRepository;
import com.AssesmentTechno.Assesment.repository.EmployeeRepository;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintRepository complaintRespository;
	  @Autowired
	    private EmployeeRepository employeeRepository;

	public Complaint create(Complaint complaint) {
		return complaintRespository.save(complaint);
	}

	public List<Complaint> fetchAll() {
		return complaintRespository.findAll();
	}

	public Complaint getByIdComplaint(Long id) {
		return complaintRespository.findById(id).get();
	}

	public String delByComplaintid(Long id) {
		complaintRespository.deleteById(id);
		return "deleted..!";
	}

	public Complaint updateComplaint(Complaint updatedComplaint, Long id) {
        Complaint oldComplaint = complaintRespository.findById(id).orElseThrow(() -> new ComplaintNotFoundException("Comaplint is not present."));
        if (oldComplaint != null) {
        	

            if (updatedComplaint.getDescription() != null) {
                oldComplaint.setDescription(updatedComplaint.getDescription());
            }
            
            if (updatedComplaint.getStatus() != null) {
                oldComplaint.setStatus(updatedComplaint.getStatus());
            }

            return complaintRespository.save(oldComplaint);
        }
        return null; // Or throw an exception indicating the complaint with the given id doesn't exist
    }
	
	 public List<ComplaintDetailsDTO> getComplaintDetailsListWithEmployee() {
	        return complaintRespository.fetchComplaintDetailsWithEmployee();
	        
	    }

}
	
