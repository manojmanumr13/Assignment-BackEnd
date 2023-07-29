package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
