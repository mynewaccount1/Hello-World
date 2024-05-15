package com.rsr.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsr.entity.Student;
import com.rsr.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	public Student getBySid(Integer sid) {
		return studentRepo.findById(sid).get();
	}

	public List<Student> getAllStudents() {
		return (List<Student>) studentRepo.findAll();
	}

	public String deleteStudent(Integer sid) {
		studentRepo.deleteById(sid);
		return "Student Deleted Successfullly..!!";
	}

	public Student updateStudent(Integer sid, Student student) {
		Optional<Student> student1 = studentRepo.findById(sid);

		if (student1.isPresent()) {
			Student originalStudent = student1.get();

			if (Objects.nonNull(student.getSname()) && !"".equalsIgnoreCase(student.getSname())) {
				originalStudent.setSname(student.getSname());
			}
			if (Objects.nonNull(student.getEmail()) && !"".equalsIgnoreCase(student.getEmail())) {
				originalStudent.setEmail(student.getEmail());
			}
			if (Objects.nonNull(student.getAddress()) && !"".equalsIgnoreCase(student.getAddress())) {
				originalStudent.setAddress(student.getAddress());
			}
			return studentRepo.save(originalStudent);
		}
		return null;
	}
}
