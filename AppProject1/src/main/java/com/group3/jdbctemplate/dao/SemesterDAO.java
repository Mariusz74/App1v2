//Mariusz S
package com.group3.jdbctemplate.dao;
import javax.sql.DataSource;
import com.group3.interfaces.Semester;
public interface SemesterDAO {
	
	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);
	
	// This is the method to be used to create a record in the Student table.
	public int createSemester(String name);
	
	// This is the method to be used to delete a record from the Student table corresponding
	// to a passed Student id.
	public int deleteSemester(Integer id);	
	
	// This is the method to be used to update a record into the Student table.
	public int updateSemester(Integer id, String name);
		
}