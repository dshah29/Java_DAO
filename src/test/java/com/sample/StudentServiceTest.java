package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sample.DAO.IStudentDAO;
import com.sample.DAOImpl.StudentDAOImpl;
import com.sample.model.Student;
import com.sample.service.IStudentService;
import com.sample.service.StudentService;

public class StudentServiceTest {
    
    @Test
    public void testFetchStudents() {       
        List<Student> ls=new ArrayList<Student>();
        ls.add(new Student("112","Darshan",16));
        IStudentDAO s= mock(IStudentDAO.class);    
        //Given
        given(s.fetchStudents()).willReturn(ls);
        //When
        IStudentService st= new StudentService(s);
        List<Student> studentData= st.fetchStudents();
        //Then    
        assertThat(studentData.size(), is(1));
    
    }
    

}