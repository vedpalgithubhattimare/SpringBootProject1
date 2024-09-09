package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Student;
import com.service.Student_Service;

@RestController
public class Student_Controller {
	
	@Autowired
	Student_Service studentservice;
	
	@GetMapping("fetchAllStuents")
	ArrayList<Student> fetchAllStudent(){
		System.err.println("Hello I'm controller");
		ArrayList<Student> listStudents= studentservice.fetchAllStuent();
		return listStudents;
	}

}
