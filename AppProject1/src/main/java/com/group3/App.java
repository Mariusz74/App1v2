package com.group3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group3.domain.DeferralImpl;
import com.group3.domain.LecturerImpl;
import com.group3.domain.ProgramSemesterImpl;
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
		context=new ClassPathXmlApplicationContext("configuration.xml"); 
	//System.out.println( "Hello World2!" );		
	// Simple bean blank constructor 
		
	//ProgramSemesterImpl simpleBeanExample=(ProgramSemesterImpl)context.
     //         getBean("classGroup"); 

	//	System.out.println(simpleBeanExample.toString());
		/*
			StudentJDBCTemplate studentJdbcTemplate=(StudentJDBCTemplate)context.getBean("studentJdbcTemplate");
			studentJdbcTemplate.createStudent("Mary", "O'Brien");
			
			ProgramJDBCTemplate programJdbcTemplate=(ProgramJDBCTemplate)context.getBean("programJdbcTemplate");
			programJdbcTemplate.createProgram("NewProgram 2");
			
			SemesterJDBCTemplate semesterJdbcTemplate=(SemesterJDBCTemplate)context.getBean("semesterJdbcTemplate");
			semesterJdbcTemplate.createSemester("Semester 1");
		
			ProgramSemesterJDBCTemplate programsemesterJdbcTemplate=(ProgramSemesterJDBCTemplate)context.getBean("programsemesterJdbcTemplate");
			programsemesterJdbcTemplate.createProgramSemester(1, 1);
			programsemesterJdbcTemplate.updateProgramSemester(1, "DCOM4", 4);
			programsemesterJdbcTemplate.updateProgramSemester2(1, 1, 2);
			programsemesterJdbcTemplate.deleteProgramSemester(1);	
		*/
		
//		ModuleJDBCTemplate moduleJdbcTemplate=(ModuleJDBCTemplate)context.getBean("moduleJdbcTemplate");
//		moduleJdbcTemplate.createModule("Java 1");
//		moduleJdbcTemplate.updateModule(1, "Java 2");
//		moduleJdbcTemplate.deleteModule(1);	
		
		DeferralJDBCTemplate deferralJdbcTemplate=(DeferralJDBCTemplate)context.getBean("deferralJdbcTemplate");
		deferralJdbcTemplate.createDeferral("About Java", 1, 1,1);
		deferralJdbcTemplate.updateDeferral(1, "About Java 2", 1, 2, 1);
		deferralJdbcTemplate.updateDeferralStatus(1, 2);		
		deferralJdbcTemplate.deleteDeferral(1);	
		
//		moduleLecturerJdbcTemplate.createModuleLecturer(1, 1);
//		moduleLecturerJdbcTemplate.updateModuleLecturer(1, 1, 2);
//		moduleLecturerJdbcTemplate.deleteModuleLecturer(1);	
		
//		ProgramSemesterModuleLecturerJDBCTemplate programSemesterModuleLecturerJdbcTemplate=(ProgramSemesterModuleLecturerJDBCTemplate)context.getBean("programSemesterModuleLecturerJdbcTemplate");
//		programSemesterModuleLecturerJdbcTemplate.createProgramSemesterModuleLecturer(1, 1);
//		programSemesterModuleLecturerJdbcTemplate.updateProgramSemesterModuleLecturer(1, 1, 2);
//		programSemesterModuleLecturerJdbcTemplate.deleteProgramSemesterModuleLecturer(1);	
		
    }
}
