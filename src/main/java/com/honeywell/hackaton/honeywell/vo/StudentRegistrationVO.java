package com.honeywell.hackaton.honeywell.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentRegistrationVO {
	
	
	

	private String userName;
	
	private String password;
	private String nameOfStudent;
	private int age;
	
	private String role;
	
	
	

	@Override
	public String toString() {
		return "StudentRegistrationVO [userName=" + userName + ", password=" + password + ", nameOfStudent="
				+ nameOfStudent + ", age=" + age + ", role=" + role + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNameOfStudent() {
		return nameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
	

}
