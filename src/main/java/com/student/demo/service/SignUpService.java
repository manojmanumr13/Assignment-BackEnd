package com.student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.student.demo.model.SignUp;
import com.student.demo.repository.SignUpRepo;

@Service
public class SignUpService {
	@Autowired
	SignUpRepo signRepo;

	@Autowired
	PasswordEncoder passwordEncoder;

	public String Loginx(String email, String password) {

		SignUp userx = signRepo.findByEmail(email);
		if (userx == null) {
			return "Invalid Email !" + HttpStatus.NOT_FOUND;
		} else {
			if (passwordEncoder.matches(password, userx.getPassword())) {

				return "Login Successful ! " + HttpStatus.OK + " " + userx.getSignupId();
			} else {

				return "Invalid Password" + HttpStatus.UNAUTHORIZED;
			}
		}
	}

	// User SignUp

	public String SignUpx(SignUp userx) {
		String email = userx.getEmail();
		String password = userx.getPassword();
		String encodepass = passwordEncoder.encode(password);
		userx.setPassword(encodepass);
		SignUp userxAuth = signRepo.findByEmail(email);

		if (userxAuth == null) {
			signRepo.save(userx);
			return "Signup Successful !";
		} else {

			if (userxAuth.getEmail().equals(email)) {
				return "Email Already Exists";
			} else {

				return "Invalid Email";
			}
		}
	}
}
