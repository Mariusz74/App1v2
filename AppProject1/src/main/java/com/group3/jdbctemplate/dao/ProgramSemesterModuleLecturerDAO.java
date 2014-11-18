package com.group3.jdbctemplate.dao;

import javax.sql.DataSource;

public interface ProgramSemesterModuleLecturerDAO {

	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);
	
	// This is the method to be used to create a record in the Student table.
	public int createProgramSemesterModuleLecturer(int idProgramSemester, int idModuleLecturer);
	
	// This is the method to be used to delete a record from the Student table corresponding
	// to a passed Student id.
	public int deleteProgramSemesterModuleLecturer(int id);	
	
	// This is the method to be used to update a record into the Student table.
	public int updateProgramSemesterModuleLecturer(int id, int idProgramSemester, int idModuleLecturer);
	
}
