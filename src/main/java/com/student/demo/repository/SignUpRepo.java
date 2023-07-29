package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.SignUp;

public interface SignUpRepo extends JpaRepository<SignUp, Long>{

	SignUp findByEmail(String email);
}
