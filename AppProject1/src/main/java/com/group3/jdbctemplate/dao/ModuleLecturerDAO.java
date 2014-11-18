// Mariusz
package com.group3.jdbctemplate.dao;
import javax.sql.DataSource;

import com.group3.interfaces.Program;

public interface ModuleLecturerDAO {
	
	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);
	
	// This is the method to be used to create a record in the Student table.
	public int createModuleLecturer(int idModule, int idLecturer);
	
	// This is the method to be used to delete a record from the Student table corresponding
	// to a passed Student id.
	public int deleteModuleLecturer(int id);	
	
	// This is the method to be used to update a record into the Student table.
	public int updateModuleLecturer(int id, int idModule, int idLecturer);
	
}
