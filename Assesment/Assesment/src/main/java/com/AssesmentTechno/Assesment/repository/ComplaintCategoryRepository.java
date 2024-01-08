package com.AssesmentTechno.Assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AssesmentTechno.Assesment.entity.ComplaintCategory;

@Repository
public interface ComplaintCategoryRepository extends JpaRepository<ComplaintCategory, Long>{
	
	
	
}
