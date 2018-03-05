package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.DAO.IStudentDAO;
import com.sample.model.Student;

@Service
public class StudentService implements IStudentService {

    @Autowired
     IStudentDAO s;
    
    public StudentService(IStudentDAO s){
        this.s=s;
    }
    
     public List<Student> fetchStudents(){         
         return s.fetchStudents();
     }
}