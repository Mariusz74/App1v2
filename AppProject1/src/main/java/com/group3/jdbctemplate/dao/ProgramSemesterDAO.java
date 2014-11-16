// Mariusz S
package com.group3.jdbctemplate.dao;
import javax.sql.DataSource;
import com.group3.interfaces.ProgramSemester;

public interface ProgramSemesterDAO {
	
	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);
	
	// This is the method to be used to create a record in the Student table.
	public int createProgramSemester(int idProgram, int idSemester);
	
	// This is the method to be used to delete a record from the Student table corresponding
	// to a passed Student id.
	public int deleteProgramSemester(int id);	
	
	// This is the method to be used to update a record into the Student table.
	public int updateProgramSemester(int id, String name, int CompulsoryModuleQuantity);
	
	// This is the method to be used to update a record into the Student table.
	public int updateProgramSemester2(int id, int idProgram, int idSemester);
	
}
