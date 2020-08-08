package com.honeywell.hackaton.honeywell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.hackaton.honeywell.service.StudentService;
import com.honeywell.hackaton.honeywell.vo.StudentRegistrationVO;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@Autowired
	
	StudentService studentService;
	
	@PostMapping
	@RequestMapping("saveStudentDetails")
	public String saveStudentDetails( @RequestBody StudentRegistrationVO studentRegistrationVO){
		try {
			return studentService.saveStudentDetails(studentRegistrationVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping
	@RequestMapping("validateUserLogin")
	public String validateUserLogin(@RequestBody StudentRegistrationVO studentRegistrationVO){
		
	
		try {
			return	studentService.validateUser(studentRegistrationVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
	return null;
	}
}
