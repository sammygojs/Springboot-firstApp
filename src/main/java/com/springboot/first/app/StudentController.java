package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
//	ArrayList<Student>students = new ArrayList<Student>();
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Sumit","Akoliya");
	}
	
	@GetMapping("/students")
	public List<Student>getStudents() {
		List<Student>students = new ArrayList();
		students.add(new Student("Piyush","Akoliya"));
		students.add(new Student("Pranav","Akoliya"));
		students.add(new Student("Kishor","Akoliya"));
		students.add(new Student("Devendra","Akoliya"));
		return students;
	}
	
	@GetMapping("student/{firstname}/{lastname}")
	public Student StudentPathVariable(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		return new Student(firstname, lastname);
	}
	
	@GetMapping("student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstname,
			@RequestParam(name = "lastName") String lastname) {
		return new Student(firstname, lastname);
	}
	
}
