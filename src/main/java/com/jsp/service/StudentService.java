package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudent();
		
		
	}
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	

}
