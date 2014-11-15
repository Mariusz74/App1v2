package com.group3.jdbctemplate.dao;
import java.util.List;

import javax.sql.DataSource;

import com.group3.interfaces.Student;
public interface StudentDAO {

	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);

	// This is the method to be used to create a record in the Student table.
	public void createStudent(String firstname, String lastname);
	
	// This is the method to be used to delete a record from the Student table corresponding
	// to a passed Student id.
	public void deleteStudent(Integer id);	
	
	// This is the method to be used to update a record into the Student table.
	public void updateStudent(Integer id, String firstname, String surname, String login, String password, String email, String address);
	
	// This is the method to be used to update a record into the Student table.
	public void updateStudentProgramSemester(Integer id, Integer ProgramSemester);
}
