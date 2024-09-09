package com.Spring.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.Entity.Student;

@Repository
public class Student_Dao {
    public ArrayList<Student> fetchAllStudents() { // Corrected method name
        System.err.println("I am in dao");
        
        ArrayList<Student> liststu = new ArrayList<Student>();
        liststu.add(new Student(1, "Chirag"));
        return liststu;
    }
}
