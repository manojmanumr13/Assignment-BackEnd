package com.student.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.SignUp;
import com.student.demo.service.SignUpService;

@RestController
@CrossOrigin("*")
public class SignUpController {
	
	@Autowired
	SignUpService sServ;
	
//	@PostMapping("/signup")
//	SignUp saveInfo(@RequestBody SignUp s)
//	{
//		return sServ.postDetails(s);
//	}
	
	@PostMapping("/signin")

	private String Login(@RequestBody Map<String, String> Loginx) {

	    String email = Loginx.get("email");

	    String password = Loginx.get("password");

	    String result = sServ.Loginx(email, password);

	    return result;

	}

    @PostMapping("/signup")

    public String Signup(@RequestBody SignUp userx) {

        return sServ.SignUpx(userx);

    }

}
