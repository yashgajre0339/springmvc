package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/saveStudent")
	public ModelAndView testMethod() {
		System.out.println("Project working fine");
	ModelAndView modelAndView=new ModelAndView("createstudent.jsp");
	modelAndView.addObject("student1", new Student());
	return modelAndView;
	
	}
	
	@RequestMapping("/studentsave")
	public ModelAndView savestudent(@ModelAttribute Student student) {
		if(student!=null){
			studentService.saveStudent(student);
			
			
		}
		ModelAndView modelAndView=new ModelAndView("Home.jsp");
		modelAndView.addObject("save", student.getName()+"saved sucessfully");
		return modelAndView;
		
		
	}
@RequestMapping("/viewallstudents")
	public ModelAndView getallStudents() {
	List<Student> student =studentService.getAllStudents();
	ModelAndView modelAndView = new ModelAndView("viewallstudent.jsp");
	  modelAndView.addObject("students", student);
	 return modelAndView;
	
		
	}
@RequestMapping("/delete")
public ModelAndView delelteStudentById(@RequestParam(name="id")int id) {
	boolean res=false;
	ModelAndView modelAndView=null;
	if (id>0) {
		res= studentService.deleteStudentById(id);
	}
		if(res==true) {
			modelAndView=new ModelAndView("deleted.jsp");
			modelAndView.addObject("student", "student deleted sucessfully");
			
					
			
			
	}
	return modelAndView;
}

}
