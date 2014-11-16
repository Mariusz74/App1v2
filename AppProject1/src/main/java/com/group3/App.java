package com.group3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group3.domain.DeferralImpl;
import com.group3.domain.Lecturer;
import com.group3.domain.ProgramSemesterImpl;
import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;
import com.group3.jdbctemplate.dao.*;
import com.group3.jdbctemplate.dao.impl.*;

/**
 * Hello world!
 *
 */

public class App 
{

	private static ApplicationContext context;
	//private static ApplicationContext autoWireContext;
	//private static BeanFactory autoWireContext;
    public static void main( String[] args )
    {
   
    	System.out.println( "Hello World!" );
		context=new ClassPathXmlApplicationContext
                ("configuration.xml"); 
		
	// Simple bean blank constructor 
	ProgramSemesterImpl simpleBeanExample=(ProgramSemesterImpl)context.
              getBean("classGroup"); 
	
		System.out.println(simpleBeanExample.toString());
		
			StudentJDBCTemplate studentJdbcTemplate=(StudentJDBCTemplate)context.getBean("studentJdbcTemplate");
			studentJdbcTemplate.createStudent("Mary", "O'Brien");
			
			ProgramJDBCTemplate programJdbcTemplate=(ProgramJDBCTemplate)context.getBean("programJdbcTemplate");
			programJdbcTemplate.createProgram("NewProgram 2");
			
			//SemesterJDBCTemplate semesterJdbcTemplate=(SemesterJDBCTemplate)context.getBean("semesterJdbcTemplate");
			//semesterJdbcTemplate.createSemester("Semester 1");
	
			LecturerJDBCTemplate lecturerJdbcTemplate=(LecturerJDBCTemplate)context.getBean("lecturerJdbcTemplate");
			
			Lecturer lect=new Lecturer("name", "sur");
			lecturerJdbcTemplate.create(lect);
    }
}
