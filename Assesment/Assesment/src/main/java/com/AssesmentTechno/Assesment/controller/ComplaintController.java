package com.AssesmentTechno.Assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AssesmentTechno.Assesment.entity.Complaint;
import com.AssesmentTechno.Assesment.entity.ComplaintDetailsDTO;
import com.AssesmentTechno.Assesment.service.ComplaintService;




@RestController
@RequestMapping("/complaint")
public class ComplaintController {

	@Autowired
	private ComplaintService complaintService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Complaint> save(@RequestBody Complaint complaint){
		return ResponseEntity.status(HttpStatus.OK).body(complaintService.create(complaint));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Complaint>> fetchAll(){
		return ResponseEntity.status(HttpStatus.OK).body(complaintService.fetchAll());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Complaint> getComplaint(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(complaintService.getByIdComplaint(id));
	}
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> delComplaint(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(complaintService.delByComplaintid(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Complaint> updateComplaint(@RequestBody Complaint complaint , @PathVariable Long id){
		return ResponseEntity.status(HttpStatus.CREATED).body(complaintService.updateComplaint(complaint, id));
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<ComplaintDetailsDTO>> getComplaintDetails(){
		return ResponseEntity.status(HttpStatus.OK).body(complaintService.getComplaintDetailsListWithEmployee());
	}
	
}
