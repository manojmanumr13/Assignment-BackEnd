package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.demo.model.Student;
import com.student.demo.model.University;
import com.student.demo.service.UniversityService;

@RestController
@RequestMapping("/university")
@CrossOrigin("*")
public class UniversityController {

	@Autowired
	UniversityService userv;

	// post
	@PostMapping
	public University postUniversity(@RequestBody University u) {
		return userv.saveUniversity(u);
	}

	// get
	@GetMapping
	public List<University> displayUniversity() {
		return userv.getUniversity();
	}

	//Get by ID
	@GetMapping("/{id}")

	public University getUniversityID(@PathVariable Long id) {
		return userv.getIniversityId(id);
	}

	// update
	@PutMapping("/{id}")
	public University putUniversity(@RequestBody University u,@PathVariable Long id) {
		return userv.updateUniversity(u,id);
	}

	// delete
	@DeleteMapping("{id}")
	public void removeUniversity(@PathVariable long id) {
		userv.deleteUniveristy(id);

	}

}
