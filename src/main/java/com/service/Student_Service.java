package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Student;
import com.Spring.dao.Student_Dao;

@Service
public class Student_Service {
	
	@Autowired
	Student_Dao studentDao;
	public ArrayList<Student> fetchAllStuent(){
		System.err.println("Hello I'm Service");
		ArrayList<Student> studenList = studentDao.fetchAllStudents();
		return studenList;
	}

}
