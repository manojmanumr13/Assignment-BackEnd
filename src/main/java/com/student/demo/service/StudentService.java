package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.model.Student;
import com.student.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRepo;

	// post the data
	public Student saveStudent(Student student) {
		return stuRepo.save(student);
	}

	// get the data
	public List<Student> getAllStudents() {
		return stuRepo.findAll();
	}
	
	// get the data using id
	public Student getStudentid(Long id) {
		return stuRepo.findById(id).orElse(null);
	}
	// update the data
	public Student updateStudent(Student student, Long id) {
		Student studentx = stuRepo.findById(id).orElse(null);
				if(studentx !=null) {
					studentx.setStudentName(student.getStudentName());
					studentx.setUniversity(student.getUniversity());
						return stuRepo.saveAndFlush(studentx);
				}
				else {
					return null;
				}
	}

	// delete the data
	public void deleteStudent(Long id) {
		stuRepo.deleteById(id);
	}

}
