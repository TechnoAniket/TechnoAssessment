package com.AssesmentTechno.Assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AssesmentTechno.Assesment.Exceptions.ComplaintNotFoundException;
import com.AssesmentTechno.Assesment.entity.ComplaintCategory;
import com.AssesmentTechno.Assesment.repository.ComplaintCategoryRepository;


@Service
public class ComplaintCategoryService {

	@Autowired
	private ComplaintCategoryRepository complaintCategoryRepository;

	public ComplaintCategory saveComplaintCategory(ComplaintCategory complaintCategory) {
		return complaintCategoryRepository.save(complaintCategory);
	}

	public List<ComplaintCategory> getAllComplaintCategory() {
		return complaintCategoryRepository.findAll();
	}

	public ComplaintCategory getByIdComplaintCategory(Long id) {

		return complaintCategoryRepository.findById(id).get();
	}

	public String delComplaintCategory(Long id) {
		complaintCategoryRepository.deleteById(id);
		return "ComplaintCategory deleted..!";
	}

	public ComplaintCategory update(ComplaintCategory updatedCategory, Long id) {
		ComplaintCategory oldCategory = complaintCategoryRepository.findById(id).orElseThrow(() -> new ComplaintNotFoundException("Comaplint is not present."));
		if (oldCategory != null) {
			if (updatedCategory.getComplaintCategoryId() != null) {
				oldCategory.setComplaintCategoryId(updatedCategory.getComplaintCategoryId());
			}
			if (updatedCategory.getCategoryName() != null) {
				oldCategory.setCategoryName(updatedCategory.getCategoryName());
			}
			if (updatedCategory.getStatus() != null) {
				oldCategory.setStatus(updatedCategory.getStatus());
			}
			return complaintCategoryRepository.save(oldCategory);
		}
		return null;
	}
}
