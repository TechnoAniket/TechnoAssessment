package com.AssesmentTechno.Assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AssesmentTechno.Assesment.entity.Complaint;
import com.AssesmentTechno.Assesment.entity.ComplaintDetailsDTO;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

    @Query("SELECT new com.AssesmentTechno.Assesment.entity.ComplaintDetailsDTO(c.complaintid, e.employeeid, e.name, e.email, c.categoryName, c.description, c.status, c.createdDate) " +
            "FROM Complaint c JOIN c.employee e")
    List<ComplaintDetailsDTO> fetchComplaintDetailsWithEmployee();
}
