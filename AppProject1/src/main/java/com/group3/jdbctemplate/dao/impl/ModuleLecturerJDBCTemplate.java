//Mariusz S
package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.group3.jdbctemplate.dao.ModuleLecturerDAO;

public class ModuleLecturerJDBCTemplate implements ModuleLecturerDAO {

	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createModuleLecturer(int idModule, int idLecturer) { 
		String SQL = "insert into ModuleLecturer (idModule, idLecturer) values (?, ?)";
		System.out.println("Created ModuleLecturer = " + idModule + " " + idLecturer);		
		return jdbcTemplateObject.update(SQL, new Object[] { idModule, idLecturer });
		//return;	
	}

	@Override
	public int deleteModuleLecturer(int id) {
		String SQL = "delete from ModuleLecturer where id = ?";
		System.out.println("Deleted ModuleLecturer with ID = " + id );
		return jdbcTemplateObject.update(SQL, new Object[] {id});	
		//return;
	}

	@Override
	public int updateModuleLecturer(int id, int idModule, int idLecturer) {
		String SQL = "update ModuleLecturer set idModule = ?, idLecturer = ? where id = ?";
		System.out.println("Updated ModuleLecturer with ID = " + id + " idModule = " + idModule + " idLecturer = " + idLecturer);
		return jdbcTemplateObject.update(SQL,  new Object[] {idModule, idLecturer, id});
			
	}
	
}
