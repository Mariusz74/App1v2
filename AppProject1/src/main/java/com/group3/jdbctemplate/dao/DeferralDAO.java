package com.group3.jdbctemplate.dao;

import javax.sql.DataSource;

import com.group3.domain.Status;
import com.group3.interfaces.ModuleLecturer;
import com.group3.interfaces.Student;

public interface DeferralDAO {

	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);

	// This is the method to be used to create a record in the Deferral table.
	public int createDeferral(String imageAddress, int idStudent, int idModuleLecture);
	
	// This is the method to be used to delete a record from the Deferral table corresponding
	// to a passed Deferral id.
	public int deleteDeferral(int id);	
	
	// This is the method to be used to update a record into the Deferral table.
	public int updateDeferral(int id, String imageAddress, int idStudent, int idModuleLecture);
	
	// This is the method to be used to update a record into the Deferral table.
//public int updateDeferralStatus(Integer id, enum Status);
}
