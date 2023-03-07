package com.jsokol.househunter.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginUser {
	
	@NotBlank(message="Email Can Not Be Blank")
	@Email(message="Must be a valid Email Address")
	private String email;
	
	@NotBlank(message="Password Can Not Be Blank")
	private String password;

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

