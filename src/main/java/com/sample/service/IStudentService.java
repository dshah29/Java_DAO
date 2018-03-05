package com.sample.service;

import java.util.List;

import com.sample.model.Student;

public interface IStudentService {
     List<Student> fetchStudents();
}