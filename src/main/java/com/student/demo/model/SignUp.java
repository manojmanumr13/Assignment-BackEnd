package com.student.demo.model;

import jakarta.persistence.*;

@Entity
public class SignUp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long signupId;
	private String name;
	private String email;
	private String password;

	public long getSignupId() {
		return signupId;
	}

	public void setSignupId(long signupId) {
		this.signupId = signupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
