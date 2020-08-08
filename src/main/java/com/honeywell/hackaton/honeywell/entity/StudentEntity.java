package com.honeywell.hackaton.honeywell.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.honeywell.hackaton.honeywell.vo.StudentRegistrationVO;

@Entity

public class StudentEntity implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "userId", nullable = false, updatable = false)
	private int userID;
	private String userName;

	private String password;
	private String nameOfStudent;
	private int age;

	private String role;

	/*public StudentEntity(StudentRegistrationVO studentRegistrationVO) {
		this.setAge(studentRegistrationVO.getAge());
		this.setNameOfStudent(studentRegistrationVO.getNameOfStudent());
		this.setPassword(studentRegistrationVO.getPassword());
		this.setRole(studentRegistrationVO.getRole());
		this.setUserName(studentRegistrationVO.getUserName());
	} */
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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
