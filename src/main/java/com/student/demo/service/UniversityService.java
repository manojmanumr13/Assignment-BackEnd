package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.demo.model.University;
import com.student.demo.repository.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	UniversityRepository urepo;

	// post
	public University saveUniversity(University u) {
		return urepo.save(u);
	}

	// get
	public List<University> getUniversity() {
		return urepo.findAll();
	}

	// get the data using id
	public University getIniversityId(Long id) {
		return urepo.findById(id).orElse(null);
	}

	// put or update
	public University updateUniversity(University u, Long id) {
		University univ = urepo.findById(id).orElse(null);
		if (univ != null) {
			univ.setUniversityName(u.getUniversityName());
			return urepo.saveAndFlush(u);
		} else {
			return null;
		}

	}

	// detele
	public void deleteUniveristy(long id) {
		urepo.deleteById(id);
	}

}
