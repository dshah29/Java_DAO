package com.sample.DAO;

import java.util.List;

import com.sample.model.Student;

public interface IStudentDAO {

    List<Student> fetchStudents();
}