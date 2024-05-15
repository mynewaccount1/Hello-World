package com.rsr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rsr.entity.Student;
import com.rsr.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping({"/createStudent"})
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping({"/getById/{sid}"})
	public Student getBySid(@PathVariable ("sid") Integer sid) {
		return studentService.getBySid(sid);
	}
	
	@GetMapping({"/getAllStudents"})
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping({"/deleteStudent/{sid}"})
	public String deleteStudent(@PathVariable ("sid") Integer sid) {
		studentService.deleteStudent(sid);
		return "Student Deleted Successfullly with the Id: "+sid;
	}
	
	@PutMapping({"/updateStudent/{sid}"})
	public Student updateStudent(@PathVariable ("sid") Integer sid, @RequestBody Student student) {
		return studentService.updateStudent(sid, student);
	}
}
