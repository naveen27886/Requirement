package com.honeywell.hackaton.honeywell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.hackaton.honeywell.entity.StudentEntity;
import com.honeywell.hackaton.honeywell.repository.StudentRepository;
import com.honeywell.hackaton.honeywell.vo.StudentRegistrationVO;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public String saveStudentDetails(StudentRegistrationVO studentRegistrationVO) throws Exception{
		
		List<StudentEntity> studentList=studentRepository.getByUserName(studentRegistrationVO.getUserName());
		if(studentList.size()>0){
			//throw new Exception();
			return "User Already existed";
		}
		StudentEntity student=new StudentEntity();
		student.setAge(studentRegistrationVO.getAge());
		student.setNameOfStudent(studentRegistrationVO.getNameOfStudent());
		student.setPassword(studentRegistrationVO.getPassword());
		student.setRole(studentRegistrationVO.getRole());
		student.setUserName(studentRegistrationVO.getUserName());
		
		
		studentRepository.save(student);
		
		return "Success";
	}

	
	public String validateUser(StudentRegistrationVO studentRegistrationVO) throws Exception{
		List<StudentEntity> studentList=studentRepository.getByUserName(studentRegistrationVO.getUserName());
		
		if(studentList.size()>0){
			if(!studentList.get(0).getPassword().equals(studentRegistrationVO.getPassword())){
				return "UserID and Password Incorrect";
			}else {
				//call for showing the details and return the VO object (Which Rahul implimented)
				return "SUCCESS";
			}
			
		}else{
			return "UserNotExists";
		}
	}
}
