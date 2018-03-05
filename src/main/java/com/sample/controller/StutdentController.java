package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Student;
import com.sample.service.IStudentService;
import com.sample.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StutdentController {
    
    @Autowired
    IStudentService stu;
    
    @RequestMapping(value="/StudentData", method= RequestMethod.GET)
    List<Student> fetchStudents(){        
        return stu.fetchStudents();
    }
    

}