package com.group3.jdbctemplate.dao;

import javax.sql.DataSource;

import com.group3.interfaces.DeferralModule;
public interface DeferralModuleDAO {
	
	//This is the method to be used to initialize database resources ie. connection.
	public void setDataSource(DataSource ds);
	
	// This is the method to be used to create a record in the DeferralModule table.
	public int createDeferralModule(int idDeferral, int idModule);
	
	// This is the method to be used to delete a record from the DeferralModule table corresponding
	// to a passed DeferralModule id.
	public int deleteDeferralModule(int id);	
	
	// This is the method to be used to update a record into the DeferralModule table.
	public int updateDeferralModule(int id, int idDeferral, int idModule) ;

 
 

}
