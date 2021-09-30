package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRespository) {
		this.studentRepository = studentRespository;
	}
	
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
}
