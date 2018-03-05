package com.sample.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sample.DAO.IStudentDAO;
import com.sample.model.Student;
import com.sample.service.IStudentService;

@Repository
public class StudentDAOImpl implements IStudentDAO{

	/*
        @Autowired 
        DataSource dataSource;
        
        @PostConstruct
        private void initialize(){
            setDataSource(dataSource);
        }
        
      */
        public List<Student> fetchStudents() {
            // TODO Auto-generated method stub
        	List<Student> result = new ArrayList<Student>();
        	try{  
        		Class.forName("com.mysql.jdbc.Driver");  
        		Connection con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3306/Student","root","abc123");  
        		//here sonoo is database name, root is username and password  
        		
            //String sql = "SELECT * FROM studentInfo";
         //   List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);        
            
            //for(Map<String, Object> row:rows){
            Statement stmt=con.createStatement();  
            ResultSet row=stmt.executeQuery("select * from studentInfo");  
            while(row.next())  
            {    
                Student s = new Student();            
                s.setSid(row.getString("sid"));
                s.setName(row.getString("name"));
                s.setAge(row.getInt("age"));            
                result.add(s);
            }
        	}
            catch(Exception e){ System.out.println(e);}  
            
            return result;
        }
}