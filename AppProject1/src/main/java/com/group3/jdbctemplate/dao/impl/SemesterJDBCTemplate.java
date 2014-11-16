// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;
import com.group3.jdbctemplate.dao.SemesterDAO;
import org.springframework.jdbc.core.JdbcTemplate;



public class SemesterJDBCTemplate implements SemesterDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public void createSemester(String name) {
		String SQL = "insert into Semester (name) values (?)";
		jdbcTemplateObject.update(SQL, new Object[] { name });
		System.out.println("Created Semester Name = " + name );
		return;	
	}

	@Override
	public void deleteSemester(Integer id) {
		String SQL = "delete from Semester where id = ?";
		jdbcTemplateObject.update(SQL, new Object[] {id});
		System.out.println("Deleted Semester with ID = " + id );	
		return;
	}

	@Override
	public void updateSemester(Integer id, String name) {
		String SQL = "update Semester set name = ? where id = ?";
		jdbcTemplateObject.update(SQL,  new Object[] {name, id});
		System.out.println("Updated Semester with ID = " + id );
		return;	
	}
	
}


